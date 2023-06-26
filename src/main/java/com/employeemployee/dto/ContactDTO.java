package com.employeemployee.dto;

import java.util.ArrayList;
import java.util.List;

public class ContactDTO {
    private long contactid;
    private int phonenumber1;
    private int phonenumber2;
    private List<ContactDTO> contactDTO = new ArrayList<>();
    public void EmployeeDTO() {
        this.contactDTO.add(new ContactDTO());
    }

    public long getContactid() {
        return contactid;
    }

    public void setContactid(long contactid) {
        this.contactid = contactid;
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

    @Override
    public String toString() {
        return "ContactDTO{" +
                "contactid=" + contactid +
                ", phonenumber1='" + phonenumber1 + '\'' +
                ", phonenumber2='" + phonenumber2 + '\'' +
                '}';
    }
}
