package net.javaguidelines.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguidelines.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
