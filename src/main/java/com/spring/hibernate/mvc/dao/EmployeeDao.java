package com.spring.hibernate.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.hibernate.mvc.bean.Employee;



public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}


