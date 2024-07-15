package it.city.mapstrukttest.service;

import it.city.mapstrukttest.entity.User;
import it.city.mapstrukttest.excepion.GenericException;
import it.city.mapstrukttest.mapper.UserMapper;
import it.city.mapstrukttest.payload.UserDTO;
import it.city.mapstrukttest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User saveUser(UserDTO userDTO){
        return userRepository.save(userMapper.toEntity(userDTO));
    }

    public List<UserDTO> getAllUsers(){
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();
        for (User user : users) {
            userDTOs.add(userMapper.toDto(user));
        }
        return userDTOs;
    }

    public User editUser(UserDTO userDTO){
        return userRepository.save(userMapper.toEntity(userDTO));
    }
    public String deleteUser(Integer id){
        userRepository.deleteById(id);
        return "User deleted";
    }
}
