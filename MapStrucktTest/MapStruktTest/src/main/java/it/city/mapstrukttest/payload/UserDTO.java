package it.city.mapstrukttest.payload;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Integer id;
    private String fullName;
    private String emailAddress;
    private LocalDate dob;
}
