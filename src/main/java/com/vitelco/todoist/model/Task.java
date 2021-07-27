package com.vitelco.todoist.model;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
    private User assignedUser;
    private Category category;

    public Task(long id, String title, User user, Category category) {
        this.id = id;
        this.title = title;
        this.createdDate = LocalDateTime.now();
        this.assignedUser = user;
        this.category = category;

    }


    public enum Category{
        WORK,PERSONAL
    }
}
