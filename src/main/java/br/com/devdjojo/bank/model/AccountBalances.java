package br.com.devdjojo.bank.model;

import br.com.devdjojo.bank.persistence.entity.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class AccountBalances extends AbstractEntity {

    private Double totalBalance;

    public Double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
