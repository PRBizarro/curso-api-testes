package br.com.pablo.api.resources;

import br.com.pablo.api.domain.User;
import br.com.pablo.api.domain.dto.UserDTO;
import br.com.pablo.api.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserResourceTest {

    public static final String NAME = "Pablo";
    public static final String EMAIL = "pablo@email.com";
    public static final int ID = 1;
    public static final String PASSWORD = "123";
    @InjectMocks
    private UserResource userResource;

    @Mock
    private ModelMapper mapper;

    @Mock
    private UserService userService;

    private User user;
    private UserDTO userDTO;

    private void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}