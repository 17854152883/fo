package cn.hacklike.fo.service;

import cn.hacklike.fo.entity.Persion;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface PersionService{

    Integer addPersion(Persion persion);

    List<Persion> getPersionList();

}
