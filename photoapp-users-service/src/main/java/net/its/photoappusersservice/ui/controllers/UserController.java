package net.its.photoappusersservice.ui.controllers;

import net.its.photoappusersservice.service.UserService;
import net.its.photoappusersservice.shared.UserDto;
import net.its.photoappusersservice.ui.model.CreateUserRequestModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Environment env;
    private final UserService userService;

    public UserController(Environment env, UserService userService) {
        this.env = env;
        this.userService = userService;
    }

    @GetMapping("/status/check")
    public String status() {
        return "Working on port " + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
        final ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        final UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        userService.createUser(userDto);
        return "CreateUser method is called";
    }
}
