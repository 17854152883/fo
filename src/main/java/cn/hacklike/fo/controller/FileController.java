package cn.hacklike.fo.controller;

import cn.hacklike.fo.common.ResultData;
import cn.hacklike.fo.service.FileService;
import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Map;

@RestController
@RequestMapping("/file/")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("uploadImg")
    private ResultData<String> uploadImg(MultipartFile img, HttpServletRequest req){

        String result = fileService.uploadImg(img, req);

        return ResultData.newInstance(result);
    }

    @RequestMapping("deleteImg")
    private ResultData<Boolean> deleteImg(@RequestBody Map<String,String> map){

        String url = map.get("url");
        if (StringUtils.isEmpty(url)){
            return ResultData.newInstance(false);
        } else {
            boolean result = fileService.deleteImg(map.get("url"));
            return ResultData.newInstance(result);
        }

    }



}
