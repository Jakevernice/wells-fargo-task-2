package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private Date createdAt;

    protected Portfolio() {

    }

    public Portfolio(Client clientId, String Name) {
        this.clientId = clientId;
        this.Name = Name;
        this.createdAt = new Date();
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public Client getClient() {
        return clientId;
    }
    public void setClient(Client clientId) {
        this.clientId = clientId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
}
