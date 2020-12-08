package com.example.crud.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {


    private Long personId;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String gender;

    public Long getPersonId() {
        return personId;
    }
}
