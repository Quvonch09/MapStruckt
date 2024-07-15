package it.city.mapstrukttest.mapper;

import it.city.mapstrukttest.entity.User;
import it.city.mapstrukttest.payload.UserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T16:46:29+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.fullName( dto.getFullName() );
        user.emailAddress( dto.getEmailAddress() );
        user.dob( dto.getDob() );

        return user.build();
    }

    @Override
    public UserDTO toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( entity.getId() );
        userDTO.fullName( entity.getFullName() );
        userDTO.emailAddress( entity.getEmailAddress() );
        userDTO.dob( entity.getDob() );

        return userDTO.build();
    }
}
