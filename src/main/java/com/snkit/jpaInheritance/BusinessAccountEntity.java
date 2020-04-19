package com.snkit.jpaInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "microservice", name = "jpa_account")
@DiscriminatorValue(value="COPORATE")
public class BusinessAccountEntity extends AccountParentEntity{

	@Column(name = "gst_num")
	private String gstNum;

	public String getGstNum() {
		return gstNum;
	}

	public void setGstNum(String gstNum) {
		this.gstNum = gstNum;
	}

	@Override
	public String toString() {
		return "BusinessAccountEntity [gstNum=" + gstNum + ", getAccountNum()=" + getAccountNum() + ", getCountry()="
				+ getCountry() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
