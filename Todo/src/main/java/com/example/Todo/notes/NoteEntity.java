package com.example.Todo.notes;

import com.example.Todo.common.BaseEntity;
import com.example.Todo.tasks.TaskEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "notes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoteEntity extends BaseEntity {
    @Column(name = "title",nullable = false,length = 100)
    String title;
    @Column(name = "body",nullable = false,length=1000)
    String body;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    TaskEntity task;
}
