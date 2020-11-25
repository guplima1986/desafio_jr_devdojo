package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.model.AccountBalances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBalancesRepository extends JpaRepository<AccountBalances, Long> {
}
