package com.joonseolee.querydslexample.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class School {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column
    private String address;

    @CreatedDate
    private LocalDate createdDate;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Student> students;

    public School() {}
    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
