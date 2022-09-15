package com.itstep.firstspring.entities.portfolio;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "portfolio_items")
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name; // Наименование работы
    private String mainImg; // Ссылка на главное изображение
    @Column(columnDefinition="TEXT")
    private String description; // Опсиание работы
    private Integer price; // Стоимость
    private Integer time; // Затраченное время в часах

    @CreationTimestamp
    private Date created_at; // = new Date();


}
