package cn.hacklike.fo.service.impl;

import cn.hacklike.fo.entity.Persion;
import cn.hacklike.fo.mapper.PersionMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    PersionMapper persionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {
        //重写loadUserByUsername 方法获得 userdetails 类型用户
        //调起用户dao
        Persion persion = persionMapper.selectOne(new QueryWrapper<Persion>().eq("username",username));
        if(persion == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));
        return new org.springframework.security.core.userdetails.User(persion.getUsername(),
                persion.getPassword(), authorities);
    }
}
