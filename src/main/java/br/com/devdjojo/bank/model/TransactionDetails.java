package br.com.devdjojo.bank.model;

import br.com.devdjojo.bank.persistence.entity.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class TransactionDetails extends AbstractEntity {

    private String linkedDepositTransactionKey;

    public String getLinkedDepositTransactionKey() {
        return linkedDepositTransactionKey;
    }

    public void setLinkedDepositTransactionKey(String linkedDepositTransactionKey) {
        this.linkedDepositTransactionKey = linkedDepositTransactionKey;
    }
}
