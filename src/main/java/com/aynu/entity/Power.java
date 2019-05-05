package com.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Power implements Serializable {
    private Integer powerId;

    private String powerName;

    private static final long serialVersionUID = 1L;


}