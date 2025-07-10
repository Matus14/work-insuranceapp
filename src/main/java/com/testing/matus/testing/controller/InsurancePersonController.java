package com.testing.matus.testing.controller;


import com.testing.matus.testing.entity.InsurancePerson;
import com.testing.matus.testing.service.InsurancePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InsurancePersonController {

    @Autowired
    private InsurancePersonService service;


    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("person", new InsurancePerson());
        return "person/form";
    }

    @PostMapping("/")
    public String addPerson(@ModelAttribute InsurancePerson person) {
        service.addOrUpdate(person);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String showAll(Model model) {
        model.addAttribute("people", service.findAll());
        return "person/list";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/list";
    }

    @PostMapping("/edit")
    public String updatePerson(@ModelAttribute InsurancePerson person) {
        service.addOrUpdate(person);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        InsurancePerson person = service.findById(id).orElseThrow();
        model.addAttribute("person", person);
        return "person/edit";
    }
}
