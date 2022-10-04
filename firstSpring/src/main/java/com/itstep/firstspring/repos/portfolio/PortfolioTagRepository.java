package com.itstep.firstspring.repos.portfolio;

import com.itstep.firstspring.entities.portfolio.PortfolioTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PortfolioTagRepository extends JpaRepository<PortfolioTag, Long>
{
    @Override
    Optional<PortfolioTag> findById(Long aLong);
}
