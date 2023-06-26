package com.employeemployee.model;

import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int phonenumber1;
    private int phonenumber2;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPhonenumber1() {
        return phonenumber1;
    }

    public void setPhonenumber1(int phonenumber1) {
        this.phonenumber1 = phonenumber1;
    }

    public int getPhonenumber2() {
        return phonenumber2;
    }

    public void setPhonenumber2(int phonenumber2) {
        this.phonenumber2 = phonenumber2;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
