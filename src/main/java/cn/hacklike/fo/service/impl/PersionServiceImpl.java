package cn.hacklike.fo.service.impl;

import cn.hacklike.fo.entity.Persion;
import cn.hacklike.fo.mapper.PersionMapper;
import cn.hacklike.fo.service.PersionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersionServiceImpl implements PersionService {

    @Autowired
    private PersionMapper persionMapper;

    @Override
    public Integer addPersion(Persion persion) {

        Integer integer = persionMapper.addPersion(persion);

        return integer;
    }

    @Override
    public List<Persion> getPersionList() {
        return persionMapper.getPersonList();
    }

}
