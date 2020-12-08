package com.example.crud.service;

import com.example.crud.api.EmploymentService;
import com.example.crud.dao.EmploymentMapper;
import com.example.crud.dto.EmploymentDTO;
import com.example.crud.dto.PersonDTO;
import com.example.crud.module.EmploymentEntity;
import com.example.crud.module.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmploymentServiceImpl implements EmploymentService {

    @Autowired
    private EmploymentMapper employmentMapper;

    @Override
    public EmploymentDTO save(EmploymentDTO employmentDTO) {
        ModelMapper modelMapper = new ModelMapper();

        EmploymentEntity employmentEntity = modelMapper.map(employmentDTO, EmploymentEntity.class);

        employmentMapper.save(employmentEntity);


        return modelMapper.map(employmentEntity, EmploymentDTO.class);
    }

    @Override
    public EmploymentDTO updateEmployee( EmploymentDTO employmentDTO) {

        ModelMapper modelMapper = new ModelMapper();

        EmploymentEntity employmentEntity = modelMapper.map(employmentDTO, EmploymentEntity.class);

        employmentMapper.updateEmployee(employmentEntity);

        return modelMapper.map(employmentEntity, EmploymentDTO.class);
    }

    @Override
    public List<EmploymentDTO> getAllEmployees() {
        ModelMapper modelMapper = new ModelMapper();

        return employmentMapper.getAllEmployments().stream()
                .map(employmentEntity -> modelMapper.map(employmentEntity, EmploymentDTO.class)).collect(Collectors.toList());
    }

    @Override
    public boolean checkEquals(EmploymentDTO employmentDTO1, EmploymentDTO employmentDTO2) {
        return
                employmentDTO1.getOrganizationName().equals(employmentDTO2.getOrganizationName()) &&

                employmentDTO1.getPositionName().equals(employmentDTO2.getPositionName());
    }

    @Override
    public EmploymentDTO deleteEmployee(EmploymentDTO employmentDTO) {
        ModelMapper modelMapper = new ModelMapper();

        EmploymentEntity employmentEntity = modelMapper.map(employmentDTO, EmploymentEntity.class);

        employmentMapper.deleteEmployee(employmentEntity);

        return modelMapper.map(employmentEntity, EmploymentDTO.class);
    }
}
