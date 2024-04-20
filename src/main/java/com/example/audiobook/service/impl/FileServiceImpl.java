package com.example.audiobook.service.impl;

import com.example.audiobook.io.FileUpload;
import com.example.audiobook.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private final FileUpload fileUpload;

    public String uploadFile(MultipartFile file, String type){
        fileUpload.uploadFile(file, type);
        return "OK";
    }
}
