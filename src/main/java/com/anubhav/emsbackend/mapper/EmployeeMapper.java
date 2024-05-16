package com.anubhav.emsbackend.mapper;

import com.anubhav.emsbackend.dto.EmployeeDto;
import com.anubhav.emsbackend.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

    public static List<EmployeeDto> mapToEmployeesDto(List<Employee> employees){
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for(Employee e : employees){
            employeeDtos.add(EmployeeMapper.mapToEmployeeDto(e));
        }

        return employeeDtos;
    }
}
