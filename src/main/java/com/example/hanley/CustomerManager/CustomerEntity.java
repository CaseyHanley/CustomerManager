package com.example.hanley.CustomerManager;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fName;
    private String lName;
    private String phoneNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @OneToMany(mappedBy = "customer")
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
       tempDependents.setCustomer(this);

   }

}
