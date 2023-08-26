package com.demo.pojo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Integer id;

    private String email;

    private String cidrBlock;

    private Boolean isDhcp;

    private String name;

    private String password;
}

