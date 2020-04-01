package springboot06datamysql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot06datamysql.Entity.User;
import springboot06datamysql.Service.UserService;

@RestController
public class controller {

    @Autowired
    UserService userService;

    @GetMapping("/insert")
    public void insert(User user){
        userService.insert(user);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        userService.delete(id);
    }

    @GetMapping("/selete/{id}")
    public User selete(@PathVariable("id") int id){
        User user = userService.select(id);
        return user;
    }
}
