package com.example.crud.dao;

import com.example.crud.module.PersonEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {

    @Insert("insert into person (first_name, last_name, middle_name,birth_date, gender) " +
            "values (#{firstName}, #{lastName} ,#{middleName} ,#{birthDate}, #{gender} )")
    void save(PersonEntity personEntity);

    @Update("update person SET first_name= #{firstName}, " +
            "last_name = #{lastName}, " +
            "middle_name = #{middleName},birth_date = #{birthDate}," +
            "gender = #{gender}   " +
            "WHERE person_id=#{id}")
    void update(Long id, PersonEntity personEntity);
}
