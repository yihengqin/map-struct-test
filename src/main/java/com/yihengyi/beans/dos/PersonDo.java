package com.yihengyi.beans.dos;

import com.yihengyi.beans.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDo {
    private Integer id;

    private String name;

    private int age;

    private Date birthday;

    private Gender gender;
}
