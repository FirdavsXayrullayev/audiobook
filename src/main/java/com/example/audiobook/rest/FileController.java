package com.example.audiobook.rest;

import com.example.audiobook.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;

    @PostMapping("upload")
    public String uploadFile(@RequestParam("file")MultipartFile file, @RequestParam("type") String type){
        return fileService.uploadFile(file, type);
    }
}
