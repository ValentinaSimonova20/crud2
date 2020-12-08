package com.example.crud.service;

import com.example.crud.api.PersonService;
import com.example.crud.dao.PersonMapper;
import com.example.crud.dto.PersonDTO;
import com.example.crud.module.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    @Transactional
    public PersonDTO save(PersonDTO personDTO) {


        ModelMapper modelMapper = new ModelMapper();

        PersonEntity personEntity = modelMapper.map(personDTO, PersonEntity.class);

        personMapper.save(personEntity);


        return modelMapper.map(personEntity, PersonDTO.class);
    }

    @Override
    public PersonDTO update(Long id, PersonDTO personDTO) {
        return null;
    }
}
