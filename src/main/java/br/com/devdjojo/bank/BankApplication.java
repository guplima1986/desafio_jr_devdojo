package br.com.devdjojo.bank;

import br.com.devdjojo.bank.model.AccountBalances;
import br.com.devdjojo.bank.model.AffectedAmounts;
import br.com.devdjojo.bank.model.TransferDetails;
import br.com.devdjojo.bank.model.TypeTransactionEnum;
import br.com.devdjojo.bank.persistence.entity.TransactionEntity;
import br.com.devdjojo.bank.persistence.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.TypeDescription;

import java.time.LocalDateTime;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
