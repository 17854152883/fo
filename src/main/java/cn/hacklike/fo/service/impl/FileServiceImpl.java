package cn.hacklike.fo.service.impl;

import cn.hacklike.fo.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImg(MultipartFile img, HttpServletRequest req) {

        BufferedOutputStream outputStream = null;

        BufferedInputStream inputStream = null;

        String newUrl = "";

        try {
            String originalFilename = img.getOriginalFilename();

            String[] split = originalFilename.split("\\.");

            String oldName = split[0];

            String houZhui = split[1];

            inputStream = new BufferedInputStream(img.getInputStream());
//            String staticPath = this.getClass().getClassLoader().getResource("file").getFile();
            String path = ResourceUtils.getURL("classpath:").getPath();
            File dir = new File(path + "static/file/img");
            if (!dir.exists()) {
                dir.mkdirs();//建立目录
            }
            String paths = dir.getPath();
            String newFileName = UUID.randomUUID().toString();
            File file = new File( paths + "/"+ newFileName + "." + houZhui);
            newUrl = "/file/img/" + newFileName + "." + houZhui;

            outputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] arr = new byte[1024];

            while (inputStream.read(arr,0,arr.length) > 0){
                outputStream.write(arr,0,arr.length);
                outputStream.flush();
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return newUrl;
    }

    @Override
    public boolean deleteImg(String url) {
        String path = null;
        try {
            path = ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File dir = new File(path + "static" + url);
        return dir.delete();
    }
}
