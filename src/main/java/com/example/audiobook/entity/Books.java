package com.example.audiobook.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private Integer id;
    private String name;
    private String type;
    private String author;
    private Float status;
    private String description;
    private String image_url;
}
