package cn.hacklike.fo.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface FileService {

    String uploadImg(MultipartFile multipartFile, HttpServletRequest req);

    boolean deleteImg(String url);

}
