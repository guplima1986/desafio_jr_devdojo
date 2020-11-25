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


		TransactionEntity entity = new TransactionEntity();
		entity.setEncodedKey("8a8586c5718588a20171881b4bc86de3");
		entity.setAccountID(1309L);
		entity.setCreationDate(LocalDateTime.of(2020, 04, 17, 15, 02, 39));
		entity.setParentAccountKey("8a8587506b566dfd016b5add799444ec");
		entity.setType(TypeTransactionEnum.TRANSFER);
		entity.setAmount(-11.11);
		entity.setCurrencyCode("EUR");

		AffectedAmounts affectedAmounts = new AffectedAmounts();
		affectedAmounts.setFundsAmount(11.11);

		entity.setAffectedAmounts(affectedAmounts);

		AccountBalances accountBalances = new AccountBalances();
		accountBalances.setTotalBalance(1679.89);

		entity.setAccountBalances(accountBalances);
		entity.setUserKey("8a8587b371776b9e01717d217e6e1492");
		entity.setBranchKey("8a8587376ad96493016ada758e6208e6");

		TransferDetails transferDetails = new TransferDetails();
		transferDetails.setLinkedDepositTransactionKey("8a8586c5718588a20171883be60f760c");

		entity.setTransferDetails(transferDetails);


	}

}
