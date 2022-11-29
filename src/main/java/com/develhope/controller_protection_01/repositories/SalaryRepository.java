package com.develhope.controller_protection_01.repositories;

import com.develhope.controller_protection_01.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
