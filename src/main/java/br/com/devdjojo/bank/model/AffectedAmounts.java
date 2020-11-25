package br.com.devdjojo.bank.model;

import br.com.devdjojo.bank.persistence.entity.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class AffectedAmounts extends AbstractEntity {

    private Double fundsAmount;
    private Double interestAmount;
    private Double feesAmount;
    private Double overdraftAmount;
    private Double overdraftFeesAmount;
    private Double overdraftInterestAmount;
    private Double technicalOverdraftAmount;
    private Double technicalOverdraftInterestAmount;
    private Double fractionAmount;

    public Double getFundsAmount() {
        return fundsAmount;
    }

    public void setFundsAmount(Double fundsAmount) {
        this.fundsAmount = fundsAmount;
    }

    public Double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Double getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(Double feesAmount) {
        this.feesAmount = feesAmount;
    }

    public Double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(Double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public Double getOverdraftFeesAmount() {
        return overdraftFeesAmount;
    }

    public void setOverdraftFeesAmount(Double overdraftFeesAmount) {
        this.overdraftFeesAmount = overdraftFeesAmount;
    }

    public Double getOverdraftInterestAmount() {
        return overdraftInterestAmount;
    }

    public void setOverdraftInterestAmount(Double overdraftInterestAmount) {
        this.overdraftInterestAmount = overdraftInterestAmount;
    }

    public Double getTechnicalOverdraftAmount() {
        return technicalOverdraftAmount;
    }

    public void setTechnicalOverdraftAmount(Double technicalOverdraftAmount) {
        this.technicalOverdraftAmount = technicalOverdraftAmount;
    }

    public Double getTechnicalOverdraftInterestAmount() {
        return technicalOverdraftInterestAmount;
    }

    public void setTechnicalOverdraftInterestAmount(Double technicalOverdraftInterestAmount) {
        this.technicalOverdraftInterestAmount = technicalOverdraftInterestAmount;
    }

    public Double getFractionAmount() {
        return fractionAmount;
    }

    public void setFractionAmount(Double fractionAmount) {
        this.fractionAmount = fractionAmount;
    }
}

