package com.itstep.firstspring.repos.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioCategory;
import com.itstep.firstspring.entities.portfolio.PortfolioTag;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PortfolioCategoryRepository extends CrudRepository<PortfolioCategory, Long>
{

}
