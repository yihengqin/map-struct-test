package com.yihengyi.mapstruct;

import com.yihengyi.beans.converters.PersonConverter;
import com.yihengyi.beans.dos.PersonDo;
import com.yihengyi.beans.dtos.PersonDto;
import com.yihengyi.beans.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class BeanCopyTest {
    @Test
    public void testBeanCopy() {
        PersonDo personDo = new PersonDo();
        personDo.setName("Hollis");
        personDo.setAge(28);
        personDo.setBirthday(new Date());
        personDo.setId(1);
        personDo.setGender(Gender.FEMALE);

        PersonDto personDto = PersonConverter.INSTANCE.do2dto(personDo);
        System.out.println(personDto);
        assertEquals("Hollis", personDto.getUserName());
    }
}