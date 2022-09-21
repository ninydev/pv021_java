package com.itstep.firstspring.repos.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioCategory;
import com.itstep.firstspring.entities.portfolio.PortfolioItem;
import com.itstep.firstspring.entities.portfolio.PortfolioTag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PortfolioItemRepository extends CrudRepository<PortfolioItem, Long>
{

}
