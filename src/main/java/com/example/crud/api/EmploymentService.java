package com.example.crud.api;

import com.example.crud.dto.EmploymentDTO;

import java.util.List;

public interface EmploymentService {

    EmploymentDTO save(EmploymentDTO employmentDTO);

    EmploymentDTO updateEmployee(EmploymentDTO employmentDTO);

    List<EmploymentDTO> getAllEmployees();

    boolean checkEquals(EmploymentDTO employmentDTO1, EmploymentDTO employmentDTO2);

    EmploymentDTO deleteEmployee(EmploymentDTO employmentDTO);
}
