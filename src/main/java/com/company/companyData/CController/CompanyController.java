package com.company.companyData.CController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.companyData.CEntity.Company;
import com.company.companyData.CService.companyservice;

@RestController
public class CompanyController {
	
	
	@Autowired
	private companyservice comserv;
	
	@PostMapping("/CompanyDetails")
	public Company addCompany(@RequestBody Company company)
	{
		return comserv.addCompany(company);
		
	}
	
	@GetMapping("/CompanyDetails/{companyid}")
	public Company findBycompanyid(@PathVariable Long companyid)
	{
		return comserv.findBycompanyid(companyid);
		
	}

}
