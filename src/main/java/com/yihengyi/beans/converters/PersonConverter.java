package com.yihengyi.beans.converters;

import com.yihengyi.beans.dos.PersonDo;
import com.yihengyi.beans.dtos.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    @Mappings(@Mapping(source = "name", target = "userName"))
    PersonDto do2dto(PersonDo person);
}
