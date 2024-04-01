package com.intern.pentafox.organization.service;

import com.intern.pentafox.organization.entity.HealthCare;
import com.intern.pentafox.organization.repository.HealthCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HealthCareService {
    @Autowired

    private HealthCareRepository repository;

    public HealthCare saveHealthCare(HealthCare healthcare) {
        return repository.save(healthcare);

    }

    public List<HealthCare> saveHealthCares(List<HealthCare> healthcares) {
        return repository.saveAll(healthcares);
    }

    public List<HealthCare> gethealthcares() {
        return repository.findAll();
    }

    public HealthCare getHealthCareById(int id) {
        return repository.findById(id).orElse(null);
    }

    public HealthCare getHealthCareByName(String name) {
        return repository.findByName(name);
    }

    public HealthCare updateHealthCare(HealthCare healthcare) {
        HealthCare existinghealthcare = repository.findById(healthcare.getId()).orElse(null);
        existinghealthcare.setName(healthcare.getName());
        existinghealthcare.setAge(healthcare.getAge());
        existinghealthcare.setPhoneno(healthcare.getPhoneno());
        existinghealthcare.setDesignation(healthcare.getDesignation());
        return repository.save(existinghealthcare);

    }
    public String deleteHealthCare(int id) {
        repository.deleteById(id);
        return "Successfully deleted";
    }


}
