package com.nus.is5126.lcsia.form;

import java.util.ArrayList;
import java.util.List;

public class MasterForm {

    private String       state;
    private String       resultNo;
    private Double       amtToInvest;
    private String       stateId;
    private List<String> stateList = new ArrayList<String>();
    private String purpose;

    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResultNo() {
        return resultNo;
    }

    public void setResultNo(String resultNo) {
        this.resultNo = resultNo;
    }

    public Double getAmtToInvest() {
        return amtToInvest;
    }

    public void setAmtToInvest(Double amtToInvest) {
        this.amtToInvest = amtToInvest;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

}
