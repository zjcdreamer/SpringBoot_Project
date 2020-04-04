package springboot08cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import springboot08cache.DAO.EmpMapper;
import springboot08cache.Entity.Employee;

@Service
public class EmpService {

    @Autowired
    EmpMapper empMapper;

    //@Cacheable(cacheNames = "emp",key = "#root.methodName+'['+#id+']'")
    @Cacheable(cacheNames = "emp"/*,keyGenerator = "mykeygenerator"*/)
    public Employee getEmp(int id){
        Employee emp = empMapper.getEmpById(id);
        return emp;
    }

    @CachePut(value = "emp",key = "#employee.id")
    public Employee updateEmployee(Employee employee){
        empMapper.updateEmp(employee);
        return employee;
    }

    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(int id){
//        empMapper.deleteEmpById(id);
        System.out.println("删除"+id+"号员工缓存");
    }
}
