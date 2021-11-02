package lk.abc.service.impl;

import lk.abc.dto.UserDTO;
import lk.abc.repo.UserRepo;
import lk.abc.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author Thathsara Dananjaya <thathsaradananjaya@gmail.com>
 * @since 10/20/2021
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void save(UserDTO dto) {

    }

    @Override
    public void update(UserDTO dto) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO searchById(String id) {
        return null;
    }
}
