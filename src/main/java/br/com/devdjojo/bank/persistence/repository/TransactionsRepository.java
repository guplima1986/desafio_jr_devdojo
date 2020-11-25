package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.persistence.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionEntity, Long> {

    List<TransactionEntity> findByAccountID(Long accountId);



}
