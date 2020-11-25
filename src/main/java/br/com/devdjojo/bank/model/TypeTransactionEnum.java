package br.com.devdjojo.bank.model;

public enum TypeTransactionEnum {

    TRANSFER("TRANSFER"),
    DEPOSIT("DEPOSIT"),
    WITHDRAWAL("WITHDRAWAL");

    private String codigo;

    private TypeTransactionEnum(final String cod) {
        this.codigo = cod;

    }

}
