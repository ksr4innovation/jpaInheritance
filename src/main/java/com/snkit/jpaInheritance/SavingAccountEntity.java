package com.snkit.jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "microservice", name = "jpa_account")
@DiscriminatorValue(value="PERSONAL")
public class SavingAccountEntity  extends AccountParentEntity {

	@Column(name = "adhar_num")
	private String adharNum;

	public String getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}

	

}
