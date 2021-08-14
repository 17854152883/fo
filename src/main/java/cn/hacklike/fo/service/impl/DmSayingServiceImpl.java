package cn.hacklike.fo.service.impl;

import cn.hacklike.fo.entity.DmSaying;
import cn.hacklike.fo.mapper.DmSayingMapper;
import cn.hacklike.fo.service.DmSayingService;
import cn.hutool.json.JSONUtil;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DmSayingServiceImpl implements DmSayingService {

    @Autowired
    private DmSayingMapper dmSayingMapper;

    public Integer addDmSaying(DmSaying dmSaying){
        String dmId = dmSaying.getDmId();
        if(StringUtils.isEmpty(dmId)){
            return dmSayingMapper.insert(dmSaying);
        } else {
            return dmSayingMapper.updateById(dmSaying);
        }
    }

    @Override
    public List<DmSaying> getAllDmSaying() {
        return dmSayingMapper.selectList(new QueryWrapper<DmSaying>());
    }

    @Override
    public List<DmSaying> getDmSayingByName(DmSaying dmSaying) {
        return dmSayingMapper.selectList(
                new QueryWrapper<DmSaying>().like("dm_title",dmSaying.getDmTitle())
                        .like("dm_name",dmSaying.getDmName()));
    }

    @Override
    public Integer delectDmSayingById(DmSaying dmSaying) {
        String dmId = dmSaying.getDmId();
        if (StringUtils.isEmpty(dmId)){
            return 0;
        } else {
            return dmSayingMapper.deleteById(dmId);
        }
    }
}
