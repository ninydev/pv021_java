package com.itstep.firstspring.controllers;

import com.itstep.firstspring.entities.SiteContact;
import com.itstep.firstspring.repos.SiteContactsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ContactFormController {

    private final SiteContactsRepository contactsRepository;

    public ContactFormController(SiteContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }


    /**
     * Создание записи в базе данных -- Create
     * @param siteContact
     * @return
     */
    @PostMapping("/contact") // Маршрут, по которому будет отвечать данный метод контроллера
    public String sendContact(
            SiteContact siteContact // На основе параметров запроса я могу сразу содать сущность
//            @RequestParam(value = "name") String name,
//            @RequestParam(value = "email") String email,
//            @RequestParam(value = "phone") String phone,
//            @RequestParam(value = "message") @Nullable String message
    ){
//        if (siteContact.getName().length() < 10) {
//            return " Name len < 10";
//        }
        contactsRepository.save(siteContact); // Я сохраняю сущность в соответствующем репозитории
        return "Ok";
//        return "Incoming: "
//                + name + " "
//                + email + " "
//                + phone +  " "
//                + message ;

    }




    /**
     * Получение всех записей по данной сущности -- Read
     * @return
     */
    @GetMapping("/contacts")
    public Iterable<SiteContact> readAll(){
        return contactsRepository.findAll();
    }

    /**
     * Получение одной записи по ID -- Read
     *
     * @return
     */
    @GetMapping("/contacts/{id}")
    public Optional<SiteContact> readById(
            @PathVariable(name="id") Long id
    ){
        return contactsRepository.findById(id);
    }

    /**
     * Обновление записи в базе данных по ее Id
     * @param id
     * @param siteContact
     * @return
     */
    @PutMapping("/contacts/{id}")
    public SiteContact updateById(
            @PathVariable(name="id") Long id,
            SiteContact siteContact
    ){
        return contactsRepository.save(siteContact);

    }

    /**
     * Удаление записи по id -- Delete
     * @param id
     */
    @DeleteMapping("/contacts/{id}")
    public void deleteById(
            @PathVariable(name="id") Long id
    ){
        contactsRepository.deleteById(id);
    }




}
