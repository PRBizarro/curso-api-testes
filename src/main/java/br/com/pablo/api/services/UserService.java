package br.com.pablo.api.services;

import br.com.pablo.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
