package com.example.crud.dao;

import com.example.crud.dto.EmploymentDTO;
import com.example.crud.module.EmploymentEntity;
import com.example.crud.module.PersonEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmploymentMapper {

    @Insert("insert into employment (version, start_dt, end_dt,work_type_id," +
            " organization_name,organization_address, position_name, person_id) " +
            "values (#{version}, #{startDt} ,#{endDt} ,#{workTypeId}, #{organizationName}," +
            "#{organizationAddress}, #{positionName}, #{personId})")
    void save(EmploymentEntity employmentEntity);

    @Select("select * from employment")
    List<EmploymentEntity> getAllEmployments();

    @Update("update employment SET version =#{version}, " +
            "start_dt =#{startDt}, " +
            "end_dt =#{endDt},work_type_id =#{workTypeId}," +
            "organization_name =#{organizationName}, organization_address= #{organizationAddress}, " +
            "position_name= #{positionName}, person_id= #{personId} " +
            "WHERE employment_id= #{employmentId}")
    void updateEmployee(EmploymentEntity employmentEntity);

    @Delete("Delete from employment where employment_id= #{employmentId}")
    void deleteEmployee(EmploymentEntity employmentEntity);
}
