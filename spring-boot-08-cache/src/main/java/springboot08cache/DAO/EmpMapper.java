package springboot08cache.DAO;

import org.apache.ibatis.annotations.*;
import springboot08cache.Entity.Employee;

@Mapper
public interface EmpMapper {

    @Select("SELECT * FROM employee WHERE id = #{id}")
    public Employee getEmpById(int id);

    @Update("UPDATE employee SET laseName=#{laseName},email=#{email},gender=#{gender},d_id=#{d_id}")
    public void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById(int id);

    @Insert("INSERT INTO employee(laseName,email,gender,d_id) VALUES(#{laseName},#{email},#{gender},#{d_id}) ")
    public void insertEmp(Employee employee);
}
