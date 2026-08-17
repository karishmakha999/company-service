package com.company.companyData.CService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.company.companyData.CEntity.Company;
import com.company.companyData.CRepository.CompanyRepo;
import com.company.companyData.excpetionaHandler.CompanyNotFoundException;

@Service
public class companyservice {
	
	
	@Autowired
	private CompanyRepo comprepo;
	
	
	public Company addCompany(Company company)
	{
		return comprepo.save(company);
		
	}
	
	private static final org.slf4j.Logger log =
	        LoggerFactory.getLogger(companyservice.class);
	
	public Company findBycompanyid(Long companyid) {

		log.info("Fetching company with id: {}", companyid);
		
	    return comprepo.findBycompanyid(companyid)
	            .orElseThrow(() ->
	                new CompanyNotFoundException(
	                    "Company not found with id: " + companyid
	                )
	            );
	}
	

}
