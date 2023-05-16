package com.detention.detentioncenter.user;

import jakarta.persistence.*;

@Entity
@Table(name ="users")
public class user {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(nullable = false, unique = true,length = 50, name = "first_name")
    private String fname;
    @Column(nullable = false, unique = true,length = 50, name = "last_name")
    private String lname;
    @Column(nullable = false, unique = true,length = 50, name = "crime")
    private String crime;
    @Column(nullable = false, unique = true,length = 50,name = "crime_description")
    private String descrption;
    @Column(nullable = false, unique = true,length = 50,name = "photo")
    private Byte[] photo;

    @Column(nullable = false, unique = true,length = 50,name = "caseno")
    private String caseno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }
}
