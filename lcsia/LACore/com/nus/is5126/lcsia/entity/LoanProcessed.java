/*
 *  Copyright 2015 ST Kinetics Pte Ltd. All Rights Reserved.

 *  
 *  @version     1.0, Apr 11, 2015
 *  @author karan
 */
package com.nus.is5126.lcsia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_processed", catalog = "lendingclub")
public class LoanProcessed implements java.io.Serializable {

    private static final long serialVersionUID = -2991145643263386170L;
    private int               id;
    private double            loanAmnt;
    private double            intRate;
    private String            purpose;
    private String            desc;
    private String            addrState;
    private String            loanStatus;
    private Double            predicted;

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "loan_amnt")
    public double getLoanAmnt() {
        return loanAmnt;
    }

    public void setLoanAmnt(double loanAmnt) {
        this.loanAmnt = loanAmnt;
    }

    @Column(name = "int_rate")
    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    @Column(name = "purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "addr_state")
    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    @Column(name = "loan_status")
    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    @Column(name = "predicted")
    public Double getPredicted() {
        return predicted;
    }

    public void setPredicted(Double predicted) {
        this.predicted = predicted;
    }

}
