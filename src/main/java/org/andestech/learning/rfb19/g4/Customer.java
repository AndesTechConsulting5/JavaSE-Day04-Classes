package org.andestech.learning.rfb19.g4;

public class Customer {

    public Customer(String sname, String name, String address) {
        this.sname = sname;
        this.name = name;
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String sname, name, address;


}


