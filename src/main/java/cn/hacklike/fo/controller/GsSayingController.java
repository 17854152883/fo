package cn.hacklike.fo.controller;

import cn.hacklike.fo.common.ResultData;
import cn.hacklike.fo.entity.GsSaying;
import cn.hacklike.fo.service.GsSayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gsSaying/")
public class GsSayingController {

    @Autowired
    private GsSayingService gsSayingService;

    @RequestMapping("addGsSaying")
    public ResultData<Integer> addGsSaying(@RequestBody GsSaying gsSaying){
        Integer integer = gsSayingService.addGsSaying(gsSaying);
        return ResultData.newInstance(integer);
    }

    @RequestMapping("/public/getAllGsSaying")
    public ResultData<List<GsSaying>> getAllGsSaying(){
        List<GsSaying> allGsSaying = gsSayingService.getAllGsSaying();
        return ResultData.newInstance(allGsSaying);
    }

    @RequestMapping("getGsSayingByName")
    public ResultData<List<GsSaying>> getGsSayingByName(@RequestBody GsSaying gsSaying){
        List<GsSaying> allGsSaying = gsSayingService.getGsSayingByName(gsSaying);
        return ResultData.newInstance(allGsSaying);
    }

    @RequestMapping("delectGsSayingById")
    public ResultData<Integer> delectGsSayingById(@RequestBody GsSaying gsSaying){
        Integer integer = gsSayingService.delectGsSayingById(gsSaying);
        return ResultData.newInstance(integer);
    }

}
