/*
 *  Copyright 2015 ST Kinetics Pte Ltd. All Rights Reserved.

 *  
 *  @version     1.0, Apr 12, 2015
 *  @author karan
 */
package com.nus.is5126.lcsia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "us_state", catalog = "lendingclub")
public class UsState implements java.io.Serializable {

    private static final long serialVersionUID = -4262535631772985053L;
    private int               id;
    private String            stateName;
    private String            stateCode;

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "state_name")
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Column(name = "state_code")
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}
