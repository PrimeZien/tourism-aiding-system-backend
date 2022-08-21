package com.uwu.tas.dto.publicUser;

import com.uwu.tas.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PublicUserDetailsDto {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private LocalDate birthday;
    private Gender gender;
    private String nationality;
    private String country;
    private String address;
    private String town;
    private String zipcode;

    public PublicUserDetailsDto(String email) {
        this.email = email;
    }
}
