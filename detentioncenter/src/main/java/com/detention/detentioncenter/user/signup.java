package com.detention.detentioncenter.user;

import jakarta.persistence.*;

@Entity
@Table(name = "signup")
public class signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(nullable = false, unique = true,length = 50, name = "names")
    private  String name;
    @Column(nullable = false, unique = true,length = 50, name = "email")
    private String email;
    @Column(nullable = false, unique = true,length = 18, name = "password")
    private String password;
    @Column(nullable = false, unique = true,length = 50, name = "badgeid")
    private String badgid;
    @Column(nullable = false, unique = true,length = 50, name = "confirmpass")
    private String confirmpass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBadgid() {
        return badgid;
    }

    public void setBadgid(String badgid) {
        this.badgid = badgid;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }
}
