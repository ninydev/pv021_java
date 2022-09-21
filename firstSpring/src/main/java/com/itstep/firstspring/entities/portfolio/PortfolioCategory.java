package com.itstep.firstspring.entities.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "portfolio_categories")
public class PortfolioCategory {

    //*---------------------------------
    // One to Many
    @OneToMany
    @JoinColumn(name = "category_id")
    private Set<PortfolioItem> items;




    //*---------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name; // Наименование категории

    @CreationTimestamp
    private Date created_at; // = new Date();

}
