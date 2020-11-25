package br.com.devdjojo.bank.persistence.repository;

import br.com.devdjojo.bank.model.TransferDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferDetailsRepository extends JpaRepository<TransferDetails, Long> {
}
