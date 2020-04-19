package com.snkit.jpaInheritance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value="businessAccountRepository")
public interface BusinessAccountRepository extends JpaRepository<BusinessAccountEntity, String> {

}
