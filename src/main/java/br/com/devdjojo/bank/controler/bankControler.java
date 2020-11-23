package br.com.devdjojo.bank.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class bankControler {

    @GetMapping
    public void getBankTransactions (@PathVariable  final Long accountId) {

    }
}
