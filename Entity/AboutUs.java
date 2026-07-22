package com.example.projem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="aboutus")
public class AboutUs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aboutus_id;

    @Column(name = "aboutus_title" ,length=(2000))
    private String aboutus_title;

    @Column(name = "aboutus_desc", length=(5000))
    private String aboutus_desc;

    @Column(name = "aboutus_img" , length = (87000))
    private String aboutus_img;

    @Column(name = "aboutus_createdate")
    private String aboutus_createdate;

    @Column(name = "aboutus_updatedate")
    private String aboutus_updatedate;

}
