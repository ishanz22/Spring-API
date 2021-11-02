package lk.abc.repo;

import lk.abc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Thathsara Dananjaya <thathsaradananjaya@gmail.com>
 * @since 10/20/2021
 **/
public interface UserRepo extends JpaRepository<User,String> {
}
