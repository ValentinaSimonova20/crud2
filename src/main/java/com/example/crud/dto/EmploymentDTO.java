package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentDTO {

    private Long employmentId;
    private Long version;
    private Date startDt;
    private Date endDt;
    private Long workTypeId;
    private String organizationName;
    private String organizationAddress;
    private String positionName;
    private Long personId;

    public Long getEmploymentId() {
        return employmentId;
    }


    public Date getStartDt() {
        return startDt;
    }

    public Date getEndDt() {
        return endDt;
    }

    public Long getWorkTypeId() {
        return workTypeId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public String getPositionName() {
        return positionName;
    }

    public Long getPersonId() {
        return personId;
    }
}
