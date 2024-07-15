package it.city.mapstrukttest.mapper;

import it.city.mapstrukttest.entity.User;
import it.city.mapstrukttest.payload.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "emailAddress", target = "emailAddress")
    @Mapping(source = "dob", target = "dob")
    User toEntity(UserDTO dto);

    @Mapping(source = "id", target="id")
    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "emailAddress", target = "emailAddress")
    @Mapping(source = "dob", target = "dob")
    UserDTO toDto(User entity);
}
