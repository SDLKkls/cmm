package com.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private Integer productId;

    private String productName;

    private Long price;

    private Integer tagId;

    private String depict;

    private List<Tag> tagList;


    private static final long serialVersionUID = 1L;


}