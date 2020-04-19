package com.snkit.jpaInheritance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpamappedsuberclassApplication  implements CommandLineRunner{

	@Autowired
	SavingAccountRepository savingAccountRepository;
	
	@Autowired
	BusinessAccountRepository businessAccountRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpamappedsuberclassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	/*	SavingAccountEntity sAccount = new SavingAccountEntity();
		sAccount.setAccountNum("12345");
		sAccount.setCountry("India");
		sAccount.setAdharNum("123457");
		sAccount.setState("Hyd");
		
		
		savingAccountRepository.save(sAccount);
		
		BusinessAccountEntity bAccount = new BusinessAccountEntity();
		bAccount.setAccountNum("12345678");
		bAccount.setCountry("India");
		bAccount.setGstNum("GST12345");;
		bAccount.setState("Hyd");
		
		businessAccountRepository.save(bAccount);*/
		
		Optional<BusinessAccountEntity> bAccount =  businessAccountRepository.findById("12345678");
	
			if (bAccount.isPresent()) {
				BusinessAccountEntity bEntity =	bAccount.get();
				
				System.out.println("  Business Entity "+bEntity);
			}
	}

}
