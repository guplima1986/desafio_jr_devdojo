package br.com.devdjojo.bank.model.resource;

import br.com.devdjojo.bank.persistence.entity.TransactionEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Locale;

public class TransactionResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("arrangementId")
    private String arrangementId;

    @JsonProperty("bookingDate")
    private LocalDateTime bookingDate;

    @JsonProperty("type")
    private String type;

    @JsonProperty("valueDate")
    private LocalDateTime valueDate;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("currencyCode")
    private String currencyCode;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("creditDebitIndicator ")
    private String creditDebitIndicator ;

    @JsonProperty("runningBalance")
    private double runningBalance;

    @JsonProperty("counterPartyAccountNumber")
    private Long counterPartyAccountNumber;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("typeGroup")
    private String typeGroup;

    @JsonProperty("instructedAmount")
    private double instructedAmount;


    public TransactionResponse(final TransactionEntity transactionEntity) {

        id = transactionEntity.getEncodedKey();
        arrangementId = transactionEntity.getParentAccountKey();
        bookingDate = transactionEntity.getCreationDate();
        type = transactionEntity.getType();
        valueDate = transactionEntity.getValueDate();
        amount = transactionEntity.getAmount();
        currencyCode = Currency.getInstance(transactionEntity.getCurrencyCode()).getSymbol(Locale.FRANCE);
        currency = transactionEntity.getCurrencyCode();
        creditDebitIndicator = transactionEntity.getAmount() >= 0 ? "CREDIT"  : "DEBIT";
        runningBalance = transactionEntity.getAccountBalances().getTotalBalance();
        counterPartyAccountNumber = transactionEntity.getAccountID();
        reference = transactionEntity.getParentAccountKey();
        typeGroup = transactionEntity.getType();
        instructedAmount = transactionEntity.getAmount();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArrangementId() {
        return arrangementId;
    }

    public void setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getValueDate() {
        return valueDate;
    }

    public void setValueDate(LocalDateTime valueDate) {
        this.valueDate = valueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public double getRunningBalance() {
        return runningBalance;
    }

    public void setRunningBalance(double runningBalance) {
        this.runningBalance = runningBalance;
    }

    public Long getCounterPartyAccountNumber() {
        return counterPartyAccountNumber;
    }

    public void setCounterPartyAccountNumber(Long counterPartyAccountNumber) {
        this.counterPartyAccountNumber = counterPartyAccountNumber;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTypeGroup() {
        return typeGroup;
    }

    public void setTypeGroup(String typeGroup) {
        this.typeGroup = typeGroup;
    }

    public double getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(double instructedAmount) {
        this.instructedAmount = instructedAmount;
    }
}
