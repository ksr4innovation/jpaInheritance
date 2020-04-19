package com.snkit.jpaInheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value="savingAccountRepository")
public interface SavingAccountRepository extends JpaRepository<SavingAccountEntity, String> {

}
