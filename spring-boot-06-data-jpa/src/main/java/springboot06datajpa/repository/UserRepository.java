package springboot06datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot06datajpa.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
