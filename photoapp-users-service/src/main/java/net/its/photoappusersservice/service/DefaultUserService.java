package net.its.photoappusersservice.service;

import net.its.photoappusersservice.shared.UserDto;

import java.util.UUID;

public class DefaultUserService implements UserService {

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
