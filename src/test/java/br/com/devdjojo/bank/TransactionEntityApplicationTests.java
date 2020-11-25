package br.com.devdjojo.bank;

import br.com.devdjojo.bank.controler.TransactionControler;
import br.com.devdjojo.bank.model.AccountBalances;
import br.com.devdjojo.bank.model.AffectedAmounts;
import br.com.devdjojo.bank.model.TransferDetails;
import br.com.devdjojo.bank.model.TypeTransactionEnum;
import br.com.devdjojo.bank.model.resource.TransactionResponse;
import br.com.devdjojo.bank.persistence.entity.TransactionEntity;
import br.com.devdjojo.bank.persistence.repository.AccountBalancesRepository;
import br.com.devdjojo.bank.persistence.repository.AffectedAmountsRepository;
import br.com.devdjojo.bank.persistence.repository.TransactionsRepository;
import br.com.devdjojo.bank.persistence.repository.TransferDetailsRepository;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class TransactionEntityApplicationTests {

	@Autowired
	private TransactionsRepository transactionsRepository;

	@Autowired
	private AccountBalancesRepository accountBalancesRepository;

	@Autowired
	private AffectedAmountsRepository affectedAmountsRepository;

	@Autowired
	private TransferDetailsRepository transferDetailsRepository;

	@Autowired
	private TransactionControler transactionControler;

	TransactionEntity entity = new TransactionEntity();


	@BeforeEach
	public void setup(){


		AccountBalances accountBalances = new AccountBalances();
		TransferDetails transferDetails = new TransferDetails();
		AffectedAmounts affectedAmounts = new AffectedAmounts();

		entity.setId(1L);
		entity.setEncodedKey("8a8586c5718588a20171881b4bc86de3");
		entity.setAccountID(1309L);
		entity.setCreationDate(LocalDateTime.of(2020, 04, 17, 15, 02, 39));
		entity.setParentAccountKey("8a8587506b566dfd016b5add799444ec");
		entity.setType(TypeTransactionEnum.TRANSFER);
		entity.setAmount(-11.11);
		entity.setCurrencyCode("EUR");

		affectedAmounts.setId(1L);
		affectedAmounts.setFundsAmount(11.11);

		entity.setAffectedAmounts(affectedAmounts);

		accountBalances.setId(1L);
		accountBalances.setTotalBalance(1679.89);

		entity.setAccountBalances(accountBalances);
		entity.setUserKey("8a8587b371776b9e01717d217e6e1492");
		entity.setBranchKey("8a8587376ad96493016ada758e6208e6");

		transferDetails.setId(1L);
		transferDetails.setLinkedDepositTransactionKey("8a8586c5718588a20171883be60f760c");

		entity.setTransferDetails(transferDetails);

		affectedAmountsRepository.saveAndFlush(affectedAmounts);
		accountBalancesRepository.saveAndFlush(accountBalances);
		transferDetailsRepository.saveAndFlush(transferDetails);
		transactionsRepository.saveAndFlush(entity);

	}

	@After
	public void cleanUp(){
		affectedAmountsRepository.delete(affectedAmountsRepository.findById(1L).orElseGet(null));
		accountBalancesRepository.delete(accountBalancesRepository.findById(1L).orElseGet(null));
		transferDetailsRepository.delete(transferDetailsRepository.findById(1L).orElseGet(null));
		transactionsRepository.delete(transactionsRepository.findById(1L).orElseGet(null));
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetTransaction(){


		final List<TransactionResponse> bankTransactions = transactionControler.getBankTransactions(1309L);

		Assertions.assertThat(bankTransactions).extracting("arrangementId").contains(entity.getParentAccountKey());
		Assertions.assertThat(bankTransactions).extracting("bookingDate").contains(entity.getCreationDate());
		Assertions.assertThat(bankTransactions).extracting("type").contains(entity.getType());
		Assertions.assertThat(bankTransactions).extracting("valueDate").contains(entity.getValueDate());
		Assertions.assertThat(bankTransactions).extracting("amount").contains(entity.getAmount());
		Assertions.assertThat(bankTransactions).extracting("currency").contains(entity.getCurrencyCode());
		Assertions.assertThat(bankTransactions).extracting("runningBalance").contains(entity.getAccountBalances().getTotalBalance());
		Assertions.assertThat(bankTransactions).extracting("counterPartyAccountNumber").contains(entity.getAccountID());
		Assertions.assertThat(bankTransactions).extracting("reference").contains(entity.getParentAccountKey());
		Assertions.assertThat(bankTransactions).extracting("typeGroup").contains(entity.getType());
		Assertions.assertThat(bankTransactions).extracting("instructedAmount").contains(entity.getAmount());

	}



}
