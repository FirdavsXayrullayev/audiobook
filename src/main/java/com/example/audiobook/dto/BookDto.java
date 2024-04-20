package com.example.audiobook.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    private Integer id;
    private String name;
    private String type;
    private String author;
    private Float status;
    private String description;
    private String image_url;
}
