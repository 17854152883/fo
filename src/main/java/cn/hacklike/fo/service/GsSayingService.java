package cn.hacklike.fo.service;

import cn.hacklike.fo.entity.DmSaying;
import cn.hacklike.fo.entity.GsSaying;

import java.util.List;

public interface GsSayingService {

    Integer addGsSaying(GsSaying gsSaying);

    List<GsSaying> getAllGsSaying();

    List<GsSaying> getGsSayingByName(GsSaying gsSaying);

    Integer delectGsSayingById(GsSaying gsSaying);


}
