package com.aynu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String status;

    private String nickName;

    private String email;

    private String mobile;

    private String city;

    private String province;

    private String headImg;

    private String sex;

    private Date createTime;

    private Date birthday;

    private String password;

    private String salt;

    private Date lastLogTime;

    private Integer ruleId;

    private List<Product> productList;

    private List<Role> roleList;

    private static final long serialVersionUID = 1L;


}