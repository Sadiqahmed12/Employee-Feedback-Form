package com.employee_feedback_form.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="feedback")
public class FeedbackEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name="name",nullable = false)
    private String name;
    @Column(name="emp_id",nullable = false)
    private int emp_id;
    @Column(name="current_role",nullable = false)
    private int current_role;
    @Column(name="recomendation",nullable = false)
    private int recomendation;
    @Column(name="balance_life",nullable = false)
    private int balance_life;
    @Column(name="growth",nullable = false)
    private int growth;
    @Column(name="about",nullable = false)
    private String about;
    @Column(name="improve_happiness",nullable = false)
    private String improve_happiness;
}
