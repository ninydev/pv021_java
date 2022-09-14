package com.itstep.firstspring.controllers;

import com.itstep.firstspring.entities.SiteContact;
import com.itstep.firstspring.repos.SiteContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactFormController {

    private final SiteContactsRepository contactsRepository;

    public ContactFormController(SiteContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @PostMapping("/contact") // Маршрут, по которому будет отвечать данный метод контроллера
    public String sendContact(
            SiteContact siteContact // На основе параметров запроса я могу сразу содать сущность
//            @RequestParam(value = "name") String name,
//            @RequestParam(value = "email") String email,
//            @RequestParam(value = "phone") String phone,
//            @RequestParam(value = "message") @Nullable String message
    ){
        contactsRepository.save(siteContact); // Я сохраняю сущность в соответствующем репозитории
        return "Ok";
//        return "Incoming: "
//                + name + " "
//                + email + " "
//                + phone +  " "
//                + message ;

    }

}
