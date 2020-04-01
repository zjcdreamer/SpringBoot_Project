package springboot08cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot08cache.Entity.Employee;
import springboot08cache.service.EmpService;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        Employee emp = empService.getEmp(id);
        return emp;
    }
}
