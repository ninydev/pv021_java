package com.itstep.firstspring.controllers.portfolio;


import com.itstep.firstspring.entities.portfolio.PortfolioItem;
import com.itstep.firstspring.repos.portfolio.PortfolioCategoryRepository;
import com.itstep.firstspring.repos.portfolio.PortfolioItemRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PortfolioItemController {

    private final PortfolioItemRepository itemRepository;
    private final PortfolioCategoryRepository categoryRepository;

    public PortfolioItemController(
        PortfolioItemRepository itemRepository,
        PortfolioCategoryRepository categoryRepository
    ) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;

    }


    /**
     * Вывод на экран всех портфолио
     * @param model
     * @return
     */
    @GetMapping("/portfolio")
    public String index(Model model){
        model.addAttribute("portfolios", itemRepository.findAll());
        return "portfolio/index";
    }

    /**
     * Вывод формы для создания новой сущности
     * @return
     */
    @GetMapping("/portfolio/create")
    public String create(Model model){
        model.addAttribute("categories", categoryRepository.findAll());
        return "/portfolio/form-create";

    }


    /**
     * Сохранение сущности
     * @param portfolio
     */
    @PostMapping("/portfolio/store")
    public RedirectView store(
            @Param("category_id") long category_id,
            PortfolioItem portfolio
    ){
        portfolio.setCategory(categoryRepository.findById(category_id).get());
        itemRepository.save(portfolio);
        return new RedirectView("/portfolio");
    }

    @GetMapping("/portfolio/edit/{id}")
    public String edit(
            Model model,
            @PathVariable(name="id") Long id
    ){
        PortfolioItem p = itemRepository.findById(id).get();
        model.addAttribute("portfolio", p);
        return "/portfolio/form-update";
    }

    @GetMapping("/portfolio/delete/{id}")
    public RedirectView delete(
            @PathVariable(name="id") Long id
    ) {
        itemRepository.deleteById(id);
        return new RedirectView("/portfolio");
    }



}
