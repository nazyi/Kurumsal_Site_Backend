package com.example.projem.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="course_details")
public class CourseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdetails_id")
    private Long cdetails_id;

    @Column(name = "cdetails_title")
    private String cdetails_title;

    @Column(name = "cdetails_desc")
    private String cdetails_desc;

    @Column(name = "cdetails_img")
    private String cdetails_img;

    @Column(name = "cdetails_createdate")
    private String cdetails_createdate;

    @Column(name = "cdetails_updatedate")
    private String cdetails_updatedate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

}
