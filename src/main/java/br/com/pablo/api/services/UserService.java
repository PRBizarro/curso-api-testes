package br.com.pablo.api.services;

import br.com.pablo.api.domain.User;
import br.com.pablo.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);


}
