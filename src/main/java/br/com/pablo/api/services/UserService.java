package br.com.pablo.api.services;

import br.com.pablo.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
