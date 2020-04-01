package springboot08cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import springboot08cache.DAO.EmpMapper;
import springboot08cache.Entity.Employee;

@Service
public class EmpService {

    @Autowired
    EmpMapper empMapper;

    @Cacheable(cacheNames = "emp")
    public Employee getEmp(int id){
        Employee emp = empMapper.getEmpById(id);
        return emp;
    }
}
