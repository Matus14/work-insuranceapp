package com.testing.matus.testing.service;


import com.testing.matus.testing.entity.InsurancePerson;
import com.testing.matus.testing.repository.InsurancePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsurancePersonService {

    @Autowired
    private InsurancePersonRepository repository;


    public List<InsurancePerson> findAll() {
        return repository.findAll();
    }

    public Optional<InsurancePerson> findById(Long id) {
        return repository.findById(id);
    }

   public void addOrUpdate(InsurancePerson person) {
        repository.save(person);
   }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
