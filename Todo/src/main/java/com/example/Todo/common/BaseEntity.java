package com.example.Todo.common;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id",nullable = false)
    private long id;

    @CreatedDate
    Date CreatedAt;

    @LastModifiedDate
    Date UpdatedAt;
}
