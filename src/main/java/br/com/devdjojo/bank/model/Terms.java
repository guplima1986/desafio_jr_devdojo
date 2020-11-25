package br.com.devdjojo.bank.model;

import br.com.devdjojo.bank.persistence.entity.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Terms extends AbstractEntity {

    @OneToOne
    private InterestSettings interestSettings;

    @OneToOne
    private OverDraftInterestSettings overDraftInterestSettings;

    @OneToOne
    private OverDraftSettings overdraftSettings;




    public InterestSettings getInterestSettings() {
        return interestSettings;
    }

    public void setInterestSettings(InterestSettings interestSettings) {
        this.interestSettings = interestSettings;
    }

    public OverDraftInterestSettings getOverDraftInterestSettings() {
        return overDraftInterestSettings;
    }

    public void setOverDraftInterestSettings(OverDraftInterestSettings overDraftInterestSettings) {
        this.overDraftInterestSettings = overDraftInterestSettings;
    }

    public OverDraftSettings getOverdraftSettings() {
        return overdraftSettings;
    }

    public void setOverdraftSettings(OverDraftSettings overdraftSettings) {
        this.overdraftSettings = overdraftSettings;
    }
}
