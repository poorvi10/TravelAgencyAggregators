package com.bits.travelagencyaggregators.model;
import javax.persistence.*;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "uname")
    String uname;

    @Column(name = "password")
    String password;

    public CustomerDetails(int id, String uname, String password) {
        this.id = id;
        this.uname = uname;
        this.password = password;
    }

    public CustomerDetails() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
