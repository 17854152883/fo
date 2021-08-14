package cn.hacklike.fo.service.impl;

import cn.hacklike.fo.entity.GsSaying;
import cn.hacklike.fo.mapper.GsSayingMapper;
import cn.hacklike.fo.service.GsSayingService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GsSayingServiceImpl implements GsSayingService {

    @Autowired
    private GsSayingMapper gsSayingMapper;

    @Override
    public Integer addGsSaying(GsSaying gsSaying) {
        if(StringUtils.isBlank(gsSaying.getGsId())){
            return gsSayingMapper.insert(gsSaying);
        } else {
            return gsSayingMapper.updateById(gsSaying);
        }
    }

    @Override
    public List<GsSaying> getAllGsSaying() {
        return gsSayingMapper.selectList(new QueryWrapper<GsSaying>());
    }

    @Override
    public List<GsSaying> getGsSayingByName(GsSaying gsSaying) {
        List<GsSaying> gsSayings = gsSayingMapper.selectList(new QueryWrapper<GsSaying>().like("gs_title", gsSaying.getGsTitle())
                .like("gs_name", gsSaying.getGsName()).like("gs_mj", gsSaying.getGsMj()));
        return gsSayings;
    }

    @Override
    public Integer delectGsSayingById(GsSaying gsSaying) {
        if(StringUtils.isBlank(gsSaying.getGsId())){
            return 0;
        } else {
            return gsSayingMapper.deleteById(gsSaying.getGsId());
        }
    }

}
