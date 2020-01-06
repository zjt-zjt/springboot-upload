package com.lanou.springbootupload.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class uploadController {

    @RequestMapping("/upload")
    public  String upload(MultipartFile file)  {
        try {

            file.transferTo(new File("F:/"+file.getOriginalFilename()));
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
