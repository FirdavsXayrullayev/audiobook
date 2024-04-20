package com.example.audiobook.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDto {
    private String fileType;
    private MultipartFile file;
}
