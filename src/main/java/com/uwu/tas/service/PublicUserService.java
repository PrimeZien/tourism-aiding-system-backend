package com.uwu.tas.service;

import com.uwu.tas.dto.publicUser.PublicUserCodeVerifyDto;
import com.uwu.tas.dto.publicUser.PublicUserDetailsDto;
import com.uwu.tas.dto.publicUser.PublicUserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public interface PublicUserService {

    PublicUserRegistrationDto registerPublicUser(PublicUserRegistrationDto registrationDto);

    void verifyUser(PublicUserCodeVerifyDto publicUserCodeVerifyDto);

    PublicUserDetailsDto getPublicUserDetails(String email);

    void updateDetails(PublicUserDetailsDto publicUserDetailsDto);
}