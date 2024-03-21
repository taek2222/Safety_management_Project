package com.application.safety.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserData {

    @Id
    @Column(name="USER_DATA_NO")
    private int UserDataNo;

    @Column(name="USER_DRINK")
    private int UserDrink;

    @Column(name="USER_PRESSURE")
    private int UserPressure;

    @Column(name="USER_TEMP")
    private float UserTemp;

    @Column(name="USER_START")
    private Time UserStart;

    @Column(name="USER_END")
    private Time UserEnd;

    @ManyToOne
    @JoinColumn(name = "USER_NO_PK")
    private UserProfile userProfile;


}
