package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.model.AffectedAmounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffectedAmountsRepository extends JpaRepository<AffectedAmounts, Long> {
}
