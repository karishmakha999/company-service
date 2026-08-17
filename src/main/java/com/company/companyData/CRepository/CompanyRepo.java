package com.company.companyData.CRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.company.companyData.CEntity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Long>{
	
	Optional<Company> findBycompanyid(Long companyid);
	
}
