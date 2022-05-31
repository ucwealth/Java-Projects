package com.cstore.model;

import com.cstore.service.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {
    private Applicant applicant;

    public Manager(Applicant applicant) {
        super();
        this.applicant = applicant;
    }

    @Override
    public String hireCashier(Applicant applicant) {
        return "Time to interview this applicant " + applicant.getName();
    }

}
