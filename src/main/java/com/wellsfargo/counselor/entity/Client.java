package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String branch;

    @Column(nullable = false)
    private Date dateofbirth;
    
    @Column(nullable = false)
    private Date createdAt;

    protected Client() {

    }

    public Client(Advisor advisorId, String firstName, String lastName, String phone, String email, String branch, Date dateofbirth) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.branch = branch;
        this.dateofbirth = dateofbirth;
        this.createdAt = new Date();
    }

    public Long getClientId() {
        return clientId;
    }
    public Advisor getAdvisor() {
        return advisorId;
    }
    public void setAdvisor(Advisor advisorId) {
        this.advisorId = advisorId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Date getDateOfBirth() {
        return dateofbirth;
    }
    public void setDateOfBirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
}
