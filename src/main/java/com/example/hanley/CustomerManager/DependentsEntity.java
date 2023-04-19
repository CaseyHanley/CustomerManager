package com.example.hanley.CustomerManager;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "dependents")
public class DependentsEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fName;
    private String lName;
    private String phoneNum;
    private String relation;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public void setUser(UserEntity userEntity) {

        user = userEntity;
    }
}
