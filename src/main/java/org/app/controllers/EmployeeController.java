package org.app.controllers;

import org.app.model.Employee;
import org.app.model.EmployeeDTO;
import org.app.services.EmployeeRepository;
import org.app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;


    @ResponseBody
    @RequestMapping(value= "/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/nuovo'>Test Insert</a></li>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>";
        html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += "</ul>";
        return html;
    }

    @ResponseBody
    @GetMapping(value = "/nuovo")
    public String addEmployee() {
        String html = "";
        html+= "<form method ='POST' action='/insert'>"+
                "<label>Code</label> <input type='text' name='code' placeholder='code' /> </br>"+
                "<label>Name</label> <input type='text' name='fullName' placeholder='name' /> </br>"+
                " <input type='submit' />"+
                "</form>";
        return html;


    }

    @ResponseBody
    @PostMapping("/insert")
    public String testInsert(@ModelAttribute EmployeeDTO employeeDTO) {


      /*  Employee employee = new Employee();

        employee.setCode("E10");
        employee.setFullName("Pippo");
        employee.setStartDate(new Date());

        this.employeeRepository.insert(employee);*/
        Employee employee = employeeService.save(employeeDTO);
        return "Inserted: " + employee.getFullName();

    }
}
