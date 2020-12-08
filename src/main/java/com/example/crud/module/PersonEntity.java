package com.example.crud.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonEntity {

    private Long personId;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String gender;
}
