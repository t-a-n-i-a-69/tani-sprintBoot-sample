package com.springboot.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {
    @Id
    @GeneratedValue
    Long userId;
    String userName;
    String address;
    String emailid;
    String gender;
}
