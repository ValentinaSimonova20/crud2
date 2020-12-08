package com.example.crud.controllers;

import com.example.crud.api.EmploymentService;
import com.example.crud.dto.EmploymentDTO;
import com.example.crud.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class EmploymentController {

    @Autowired
    private EmploymentService employmentService;

    @PostMapping("/save")
    public String getData(@RequestBody @Validated List<EmploymentDTO> employmentDTOS){

        List<EmploymentDTO> currentSet = employmentService.getAllEmployees();

        for(EmploymentDTO employmentDTO: employmentDTOS){

            if(employmentDTO.getEmploymentId() == null)
                employmentService.save(employmentDTO);

            else {
                // check field
                for (EmploymentDTO employmentDTO2: currentSet){

                    if(employmentDTO2.getEmploymentId().equals(employmentDTO.getEmploymentId())){
                        if(!employmentService.checkEquals(employmentDTO, employmentDTO2)){

                            System.out.println("upd");
                            employmentService.updateEmployee(employmentDTO);
                        }
                        else {
                            System.out.println("del");
                            employmentService.deleteEmployee(employmentDTO);
                        }
                    }

                }
            }
        }

        return " done ";

    }

    @PostMapping("/getEmpl")
    public List<EmploymentDTO> getAllEmpl(){
        return employmentService.getAllEmployees();
    }
}
