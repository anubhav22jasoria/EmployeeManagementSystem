package com.anubhav.emsbackend.service.impl;

import com.anubhav.emsbackend.dto.EmployeeDto;
import com.anubhav.emsbackend.entity.Employee;
import com.anubhav.emsbackend.mapper.EmployeeMapper;
import com.anubhav.emsbackend.repository.EmployeeRepository;
import com.anubhav.emsbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
