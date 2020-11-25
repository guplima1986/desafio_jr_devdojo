package br.com.devdjojo.bank.persistence.entity;

import br.com.devdjojo.bank.model.*;
import br.com.devdjojo.bank.persistence.entity.AbstractEntity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class TransactionEntity extends AbstractEntity {

    private String encodedKey;
    private Long accountID;
    private LocalDateTime creationDate;
    private LocalDateTime  valueDate;
    private String notes;
    private String parentAccountKey;
    private TypeTransactionEnum type;
    private Double amount;
    private String currencyCode;
    private AffectedAmounts affectedAmounts;
    private Taxes taxes;
    private AccountBalances accountBalances;
    private String userKey;
    private String branchKey;
    private Terms terms;
    private TransactionDetails transactionDetails;
    private TransferDetails transferDetails;

    public String getEncodedKey() {
        return encodedKey;
    }

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getValueDate() {
        return valueDate;
    }

    public void setValueDate(LocalDateTime valueDate) {
        this.valueDate = valueDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getParentAccountKey() {
        return parentAccountKey;
    }

    public void setParentAccountKey(String parentAccountKey) {
        this.parentAccountKey = parentAccountKey;
    }

    public TypeTransactionEnum getType() {
        return type;
    }

    public void setType(TypeTransactionEnum type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public AffectedAmounts getAffectedAmounts() {
        return affectedAmounts;
    }

    public void setAffectedAmounts(AffectedAmounts affectedAmounts) {
        this.affectedAmounts = affectedAmounts;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    public AccountBalances getAccountBalances() {
        return accountBalances;
    }

    public void setAccountBalances(AccountBalances accountBalances) {
        this.accountBalances = accountBalances;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getBranchKey() {
        return branchKey;
    }

    public void setBranchKey(String branchKey) {
        this.branchKey = branchKey;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public TransferDetails getTransferDetails() {
        return transferDetails;
    }

    public void setTransferDetails(TransferDetails transferDetails) {
        this.transferDetails = transferDetails;
    }

}
