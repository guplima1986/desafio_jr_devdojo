package br.com.devdjojo.bank.service;

import br.com.devdjojo.bank.model.resource.TransactionResponse;

import java.util.List;

public interface TransactionsService {

    List<TransactionResponse> getAllTransacitionBank(final Long encodedKey);

}
