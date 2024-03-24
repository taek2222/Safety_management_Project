package com.application.safety.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "user_info")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserInfo {
    @Id
    @Column(name="USER_NO")
    private int UserNoPk;

    @Column(name="USER_FACE_PATH")
    private String UserFacePath;

    @Column(name="USER_AGE")
    private int UserAge;

    @Column(name="USER_TELNO")
    private String UserTelno;

    @OneToOne
    @MapsId
    @JoinColumn(name = "USER_NO")
    private UserProfile userProfile;

}
