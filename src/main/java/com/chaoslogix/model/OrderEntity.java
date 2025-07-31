package com.chaoslogix.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
public class OrderEntity {

    //Tables primary key. JPA auto-generates. 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String reference;
    private String principal;

    @Enumerated(EnumType.STRING)
    private OrderType orderType;

    private String destination;

    //only used if order is for customer
    private String customerName;

    private int palletCount;
    private double orderValue;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.UNSCHEDULED;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "load_id")
    private LoadEntity load;

    private String orderNotes;

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String notes) {
        this.orderNotes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPalletCount() {
        return palletCount;
    }

    public void setPalletCount(int palletCount) {
        this.palletCount = palletCount;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LoadEntity getLoad() {
        return load;
    }

    public void setLoad(LoadEntity load) {
        this.load = load;
    }

    @PrePersist
    protected void onCreate() {
    createdAt = new Date();
    }

}