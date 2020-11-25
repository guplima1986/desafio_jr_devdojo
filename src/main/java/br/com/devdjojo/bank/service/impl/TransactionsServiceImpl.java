package br.com.devdjojo.bank.service.impl;

import br.com.devdjojo.bank.model.resource.TransactionResponse;
import br.com.devdjojo.bank.persistence.repository.TransactionsRepository;
import br.com.devdjojo.bank.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    private final TransactionsRepository bankRepository;

    public TransactionsServiceImpl(TransactionsRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<TransactionResponse> getAllTransacitionBank(final Long encodedKey) {
        return bankRepository
                .findByEncodedKey(encodedKey)
                .stream()
                .map(TransactionResponse::new)
                .collect(Collectors.toList());
    }
}
