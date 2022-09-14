package com.itstep.firstspring.controllers;

import com.itstep.firstspring.repos.SiteContactsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CFController {

    private final SiteContactsRepository contactsRepository;

    public CFController(SiteContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @GetMapping("/cf")
    public String getAll(Model model)
    {
        model.addAttribute("all", contactsRepository.findAll());
        return "cf/all";
    }

}
