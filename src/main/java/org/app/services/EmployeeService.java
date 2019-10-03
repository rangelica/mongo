package org.app.services;

import org.app.model.Employee;
import org.app.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.Date;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();


        String code =  employeeDTO.getCode();
        String fullName = employeeDTO.getFullName();

        employee.setCode(code);
        employee.setFullName(fullName);
        employee.setStartDate(new Date());
        /*Date data = Date.from(employeeDTO.getDataAdesso().atStartOfDay(ZoneId.of("Europe/Rome")).toInstant());
        System.out.println(data);
        employee.setStartDate(data);*/

        employeeRepository.insert(employee);
        return employee;
    }
}
