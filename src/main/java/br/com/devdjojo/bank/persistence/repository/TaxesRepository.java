package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.model.Taxes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxesRepository extends JpaRepository<Taxes, Long> {
}
