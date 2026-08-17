package com.company.companyData.CEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	private Long companyid;
	private String companyname;
	private String companyaddress;
	
	
	public Company(Long companyid, String companyname, String companyaddress) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.companyaddress = companyaddress;
	}
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	
}
