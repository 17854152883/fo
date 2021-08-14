package cn.hacklike.fo.mapper;

import cn.hacklike.fo.entity.Persion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface PersionMapper extends BaseMapper<Persion> {

    List<Persion> getPersonList();

    Integer addPersion(Persion persion);

}
