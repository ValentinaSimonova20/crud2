package com.example.crud.controllers;

import com.example.crud.api.PersonService;
import com.example.crud.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public String getData(@RequestBody @Validated List<PersonDTO> personDTOs){
        for(PersonDTO personDTO: personDTOs){
            if(personDTO.getPersonId() == null){
                personService.save(personDTO);
                System.out.println("Saved");
            }
        }

        return " done ";

    }

}
