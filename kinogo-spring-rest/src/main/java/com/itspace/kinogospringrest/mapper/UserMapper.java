package com.itspace.kinogospringrest.mapper;

import com.itspace.kinogospringcommon.model.entity.User;
import com.itspace.kinogospringrest.dto.CreateUserDto;
import com.itspace.kinogospringrest.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "role", defaultValue = "USER")
    User map(CreateUserDto createUserDto);

    UserDto map(User user);
}
