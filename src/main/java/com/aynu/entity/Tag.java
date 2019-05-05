package com.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag implements Serializable {
    private Integer tagId;

    private String tagName;

    private static final long serialVersionUID = 1L;


}