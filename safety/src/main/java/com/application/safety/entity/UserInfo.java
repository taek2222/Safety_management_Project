package com.application.safety.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserInfo {

    @Id
    @Column(name="USER_NO_PK")
    private int UserNoPk;

    @Column(name="USER_FACE_PATH")
    private String UserFacePath;


    @Column(name="USER_AGE")
    private int UserAge;

    @Column(name="USER_TELNO")
    private String UserTelno;

    @OneToOne
    @MapsId
    @JoinColumn(name = "USER_NO_PK")
    private UserProfile userProfile;




}
