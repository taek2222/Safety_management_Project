package com.application.safety.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserProfile {

    @Id
    @Column(name = "USER_NO_PK")
    private int UserNoPk;

    @Column(name = "USER_NAME")
    private String UserName;




}
