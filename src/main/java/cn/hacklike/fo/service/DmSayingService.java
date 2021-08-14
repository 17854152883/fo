package cn.hacklike.fo.service;

import cn.hacklike.fo.entity.DmSaying;

import java.util.List;

public interface DmSayingService {

    Integer addDmSaying(DmSaying dmSaying);

    List<DmSaying> getAllDmSaying();

    List<DmSaying> getDmSayingByName(DmSaying dmSaying);

    Integer delectDmSayingById(DmSaying dmSaying);

}
