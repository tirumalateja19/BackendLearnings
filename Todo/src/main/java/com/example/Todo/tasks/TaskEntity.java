package com.example.Todo.tasks;

import com.example.Todo.common.BaseEntity;
import com.example.Todo.notes.NoteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity(name = "tasks")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskEntity extends BaseEntity {

    @Column(name = "name",nullable = false)
    //It's ok even if we skip this @column hibernate creates though
    String name;

    @Column(name = "due_date",nullable = false)
    Date dueDate;

    @Column(name = "done",nullable = false,columnDefinition = "BOOLEAN DEFAULT FALSE")
    boolean done;

    @OneToMany(mappedBy = "task",cascade = CascadeType.ALL)
    @ToString.Exclude
    List<NoteEntity> notes;

    public void setNotes(List<NoteEntity> notes) {
        this.notes = notes;
    }
}
