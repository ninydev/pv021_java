package com.itstep.firstspring.repos.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioItem;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PortfolioItemRepository extends CrudRepository<PortfolioItem, UUID>
{
}
