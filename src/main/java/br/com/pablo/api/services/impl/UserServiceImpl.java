package br.com.pablo.api.services.impl;

import br.com.pablo.api.domain.User;
import br.com.pablo.api.domain.dto.UserDTO;
import br.com.pablo.api.repositories.UserRepository;
import br.com.pablo.api.services.UserService;
import br.com.pablo.api.services.exceptions.DataIntegrityViolationException;
import br.com.pablo.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        findByEmail(obj);
        return userRepository.save(mapper.map(obj, User.class));
    }

    private void findByEmail(UserDTO obj){
        Optional<User> user = userRepository.findByEmail(obj.getEmail());
        if(user.isPresent()) {
            throw new DataIntegrityViolationException("Email já cadastrado no sistema");
        }
    }
}
