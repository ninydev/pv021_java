package com.itstep.firstspring.controllers.portfolio;


import com.itstep.firstspring.repos.portfolio.PortfolioItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioItemController {

    private final PortfolioItemRepository portfolioItemRepository;

    public PortfolioItemController(
        PortfolioItemRepository portfolioItemRepository
    ) {
        this.portfolioItemRepository = portfolioItemRepository;
    }


    /**
     * Вывод на экран всех портфолио
     * @param model
     * @return
     */
    @GetMapping("/portfolio")
    public String index(Model model){
        model.addAttribute("portfolios", portfolioItemRepository.findAll());
        return "portfolio/index";
    }


}
