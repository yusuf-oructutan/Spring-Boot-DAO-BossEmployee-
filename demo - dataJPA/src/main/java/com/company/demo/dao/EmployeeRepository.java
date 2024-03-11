package com.company.demo.dao;

import com.company.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer> {

   // JpaRepository<Employee ,Integer>  ilk parametre değreri entity sınfıı ikincisi primary key

    // bu jpaRepository sayesınde hıc bır kod yazamaya gerek yok


}
