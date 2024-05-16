package com.anubhav.emsbackend.service;

import com.anubhav.emsbackend.dto.EmployeeDto;
import com.anubhav.emsbackend.entity.Employee;

public interface EmployeeService{
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

}
