package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.util.ArrayList;

public class CustomerQuery {
    private String customerId;
    private String customerName;
    private String message;

    public static ArrayList<CustomerQuery> queryList = new ArrayList<>();

    public CustomerQuery(String customerId, String customerName, String message) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.message = message;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomerQuery{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
