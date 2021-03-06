package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.model.Terms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends JpaRepository<Terms, Long> {
}
