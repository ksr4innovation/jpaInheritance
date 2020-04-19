package com.snkit.jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(schema = "microservice", name = "jpa_account")
@DiscriminatorColumn(name="acc_type",discriminatorType=DiscriminatorType.STRING)
public abstract class AccountParentEntity {

	@Id
	@Column(name = "account_no")
	private String accountNum;

	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
