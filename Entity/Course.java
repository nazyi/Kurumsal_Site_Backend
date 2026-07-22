package com.example.projem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name ="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private long course_id;
    @Column(name = "course_title")
    private String course_title;

    @Column(name = "course_desc")
    private String course_desc;

    @Column(name = "course_img" ,length = (500000))
    private String course_img;

    @Column(name = "course_createdate")
    private String course_createdate;

    @Column(name = "course_updatedate")
    private String course_updatedate;

    @OneToOne(mappedBy = "course")
    private CourseDetails course_details;

}
