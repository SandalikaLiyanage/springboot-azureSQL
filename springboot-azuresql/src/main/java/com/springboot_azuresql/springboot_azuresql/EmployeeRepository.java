package com.springboot_azuresql.springboot_azuresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
}
