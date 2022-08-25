package com.uwu.tas.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Lob
    private String description;

    private String telephone;
    private String email;
    private boolean emailVerified;
    private String addressLine1;
    private String buildingNo;
    private String city;
    private String province;
    private String postalCode;
    private double distanceAirport;
    private double distanceCity;
    private double latitude;
    private double longitude;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private double rating;
    private int ratingCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Vendor vendor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private AccommodationType accommodationType;

    @OneToMany(mappedBy = "accommodation")
    private List<Room> rooms;

    @OneToMany(mappedBy = "accommodation")
    private List<AccommodationPicture> accommodationPictures;


    @OneToOne(mappedBy = "accommodation")
    private AccommodationFacility accommodationFacility;


}
