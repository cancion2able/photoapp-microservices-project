package net.its.photoappusersservice.service;

import net.its.photoappusersservice.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto userDetails);

    UserDto getUserDetailsByEmail(String email);
}
