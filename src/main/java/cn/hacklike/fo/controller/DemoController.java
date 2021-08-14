package cn.hacklike.fo.controller;

import cn.hacklike.fo.common.ResultData;
import cn.hacklike.fo.entity.Persion;
import cn.hacklike.fo.service.PersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private PersionService persionService;

    @RequestMapping("/addPersion")
    private Integer addPersion(@RequestBody Persion persion){
        return persionService.addPersion(persion);
    }

    @RequestMapping("/getPersionList")
    private ResultData<List<Persion>> getPersionList(){
        return ResultData.newInstance(persionService.getPersionList());
    }

}
