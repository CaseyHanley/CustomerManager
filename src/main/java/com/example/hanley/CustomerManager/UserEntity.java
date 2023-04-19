package com.example.hanley.CustomerManager;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fName;
    private String lName;
    private String phoneNum;


    @OneToMany(mappedBy = "user")
   private List<DependentsEntity> dependents;

   public List<DependentsEntity> getDependents(){

       return dependents;
   }

   public void setDependents(List<DependentsEntity> dependents){

       this.dependents = dependents;
   }

   public void add(DependentsEntity tempDependents){

       if(dependents == null){

           dependents = new ArrayList<>();
       }

       dependents.add(tempDependents);
       tempDependents.setUser(this);

   }

}
