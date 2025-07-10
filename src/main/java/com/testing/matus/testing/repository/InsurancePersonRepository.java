package com.testing.matus.testing.repository;

import com.testing.matus.testing.entity.InsurancePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



public interface InsurancePersonRepository extends JpaRepository<InsurancePerson, Long> {
}
