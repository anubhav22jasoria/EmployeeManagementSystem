package com.anubhav.emsbackend.controller;

import com.anubhav.emsbackend.dto.EmployeeDto;
import com.anubhav.emsbackend.entity.Employee;
import com.anubhav.emsbackend.mapper.EmployeeMapper;
import com.anubhav.emsbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long id){
        EmployeeDto employeeDto = employeeService.getEmployeeByid(id);
        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDtos = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeDtos,HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable("id") Long id){
        EmployeeDto employeeDtoUpdated = employeeService.updateEmployeeById(id,employeeDto);
        return new ResponseEntity<>(employeeDtoUpdated,HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>("The emnployee with id :" + id + " has been deleted",HttpStatus.OK);
    }
}
