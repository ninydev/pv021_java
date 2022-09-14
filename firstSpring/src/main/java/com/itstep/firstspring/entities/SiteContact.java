package com.itstep.firstspring.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "site_contacts")
public class SiteContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @Column(columnDefinition="TEXT")
    private String message;


    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate // Разобраться - почему автоматом не создало в базе данных
    private Date createdAt = new Date();

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
