package com.three.lonely.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @program: lonely
 * @author: Josiah
 * @create: 2020-04-09 21:38
 **/
@Entity
@Getter
@Setter
public class User {

    private Integer id;
    private String userName;
    private String userPhone;
    private String userSex;
    private String userImage;
    private String userBirthday;
    private String updateTime;
    private Integer deleted;

}
