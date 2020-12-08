package com.example.crud.api;

import com.example.crud.dto.PersonDTO;

public interface PersonService {

    PersonDTO save(PersonDTO personDTO);
    PersonDTO update(Long id, PersonDTO personDTO);
}
