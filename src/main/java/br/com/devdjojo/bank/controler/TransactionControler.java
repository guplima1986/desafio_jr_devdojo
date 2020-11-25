package br.com.devdjojo.bank.controler;


import br.com.devdjojo.bank.model.resource.TransactionResponse;
import br.com.devdjojo.bank.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionControler {

    @Autowired
    private TransactionsService transactionsService;

    @GetMapping(value = "/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TransactionResponse> getBankTransactions (@PathVariable  final Long accountId) {
       return transactionsService.getAllTransacitionBank(accountId);
    }
}
