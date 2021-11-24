package com.izdebski.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {

    @Value("#{employee.employeeName}")
    private String panHolderName;

    @Value("MSJS65GG")
    private String panNo;

    public String getPanHolderName() {
        return panHolderName;
    }
    public void setPanHolderName(String panHolderName) {
        this.panHolderName = panHolderName;
    }
    public String getPanNo() {
        return panNo;
    }
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
}