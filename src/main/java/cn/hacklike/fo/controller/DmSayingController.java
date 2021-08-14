package cn.hacklike.fo.controller;

import cn.hacklike.fo.common.ResultData;
import cn.hacklike.fo.entity.DmSaying;
import cn.hacklike.fo.service.DmSayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dmSaying/")
public class DmSayingController {

    @Autowired
    private DmSayingService dmSayingService;

    @RequestMapping("addDmSaying")
    public ResultData<Integer> addDmSaying(@RequestBody DmSaying dmSaying){
        Integer integer = dmSayingService.addDmSaying(dmSaying);
        return ResultData.newInstance(integer);
    }

    @RequestMapping("/public/getAllDmSaying")
    public ResultData<List<DmSaying>> getAllDmSaying(){
        List<DmSaying> allDmSaying = dmSayingService.getAllDmSaying();
        return ResultData.newInstance(allDmSaying);
    }

    @RequestMapping("getDmSayingByName")
    public ResultData<List<DmSaying>> getDmSayingByName(@RequestBody DmSaying dmSaying){
        List<DmSaying> allDmSaying = dmSayingService.getDmSayingByName(dmSaying);
        return ResultData.newInstance(allDmSaying);
    }

    @RequestMapping("delectDmSayingById")
    public ResultData<Integer> delectDmSayingById(@RequestBody DmSaying dmSaying){
        Integer integer = dmSayingService.delectDmSayingById(dmSaying);
        return ResultData.newInstance(integer);
    }


}
