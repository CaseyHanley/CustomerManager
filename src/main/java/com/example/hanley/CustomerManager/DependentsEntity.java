package com.example.hanley.CustomerManager;

import jakarta.persistence.*;

@Entity
@Table(name = "dependents")
public class DependentsEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    private String fName;
    private String lName;
    private String phoneNum;
    private String relation;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    public void setCustomer(CustomerEntity customerEntity) {

        customer = customerEntity;
    }
}
