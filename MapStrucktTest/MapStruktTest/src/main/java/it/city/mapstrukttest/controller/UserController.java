package it.city.mapstrukttest.controller;

import it.city.mapstrukttest.entity.User;
import it.city.mapstrukttest.payload.UserDTO;
import it.city.mapstrukttest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<UserDTO> allUsers = userService.getAllUsers();
        return allUsers;
    }
    @PostMapping
    public User saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }
    @PutMapping
    public User updateUser(@RequestBody UserDTO userDTO) {
        return userService.editUser(userDTO);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}
