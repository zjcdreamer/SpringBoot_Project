package springboot06datamysql.Mapper;

import org.springframework.stereotype.Repository;
import springboot06datamysql.Entity.User;

@Repository
public interface UserMapper {

    //增加一个成员
    public void insertUser(User user);

    //删除一个成员
    public void deleteUser(int id);

    //查找一个成员
    public User selectUser(int id);
}
