package com.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private Integer roleId;

    private String roleName;

    private List<Power> powerList;

    private static final long serialVersionUID = 1L;


}