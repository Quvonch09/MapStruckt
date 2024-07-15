package it.city.mapstrukttest.excepion;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericException extends RuntimeException{
    private String message;
    private Integer statusCode;
}