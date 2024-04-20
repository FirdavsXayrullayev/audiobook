package com.example.audiobook.io;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Configuration
public class FileUpload {
    public String getPath(String name, String type){
        String fileName = name.substring(name.lastIndexOf("."));
        String path = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy/MM/dd"));

        return type + "/" + path + "/" + System.currentTimeMillis() + fileName;
    }
    public String uploadFile(MultipartFile file, String  type){
        String url = getPath(Objects.requireNonNull(file.getOriginalFilename()), type);
        File saveFile = new File(url);
        if (!saveFile.getParentFile().exists()){
            saveFile.getParentFile().mkdirs();
        }
        try(OutputStream outputStream = new FileOutputStream(url)) {
            outputStream.write(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return url;
    }
}
