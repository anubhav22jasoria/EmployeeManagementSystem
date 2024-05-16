package com.anubhav.emsbackend.service;

import com.anubhav.emsbackend.dto.EmployeeDto;
import com.anubhav.emsbackend.entity.Employee;

import java.util.List;

public interface EmployeeService{
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    public EmployeeDto getEmployeeByid(Long id);
    public List<EmployeeDto> getAllEmployees();
}
