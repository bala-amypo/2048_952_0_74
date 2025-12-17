package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframe.sterotype.Repository;

import com.example.demo.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}