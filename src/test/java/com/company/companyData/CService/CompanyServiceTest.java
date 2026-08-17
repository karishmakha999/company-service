package com.company.companyData.CService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.companyData.CEntity.Company;
import com.company.companyData.CRepository.CompanyRepo;
import com.company.companyData.excpetionaHandler.CompanyNotFoundException;

@ExtendWith(MockitoExtension.class)
class CompanyServiceTest {

    @Mock
    private CompanyRepo companyRepository;

    @InjectMocks
    private companyservice companyService;

    @Test
    void getCompanyById_shouldReturnCompany() {

        Company company = new Company();

        company.setCompanyid(1L);
        company.setCompanyname("ABC");
        company.setCompanyaddress("Pune");

        when(companyRepository.findBycompanyid(1L))
                .thenReturn(Optional.of(company));

        Company result = companyService.findBycompanyid(1L);

        assertEquals(1L, result.getCompanyid());
        assertEquals("ABC", result.getCompanyname());
        assertEquals("Pune", result.getCompanyaddress());

        verify(companyRepository).findBycompanyid(1L);
    }

    @Test
    void getCompanyById_shouldThrowExceptionWhenNotFound() {

        when(companyRepository.findBycompanyid(100L))
                .thenReturn(Optional.empty());

        assertThrows(
                CompanyNotFoundException.class,
                () -> companyService.findBycompanyid(100L)
        );

        verify(companyRepository).findBycompanyid(100L);
    }
}