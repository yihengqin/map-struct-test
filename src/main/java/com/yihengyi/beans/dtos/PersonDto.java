package com.yihengyi.beans.dtos;

import com.yihengyi.beans.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDto {
    private String userName;

    private Integer age;

    private Date birthday;

    private Gender gender;
}
