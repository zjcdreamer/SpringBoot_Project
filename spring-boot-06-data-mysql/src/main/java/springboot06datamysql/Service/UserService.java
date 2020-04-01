package springboot06datamysql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot06datamysql.Entity.User;
import springboot06datamysql.Mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void insert(User user){

        userMapper.insertUser(user);
    }
    public void delete(int id){
        userMapper.deleteUser(id);
    }
    public User select(int id){
        User user = userMapper.selectUser(id);
        return user;
    }
}
