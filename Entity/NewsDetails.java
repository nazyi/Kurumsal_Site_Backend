package com.example.projem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="news_details")
public class NewsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ndetails_id")
    private long ndetails_id;

    @Column(name = "ndetails_title")
    private String ndetails_title;

    @Column(name = "ndetails_desc", length=(5000))
    private String ndetails_desc;

    @Column(name = "ndetails_img",  length = (70000))
    private String ndetails_img;

    @Column(name = "ndetails_createdate")
    private String ndetails_createdate;

    @Column(name = "ndetails_updatedate")
    private String ndetails_updatedate;

    @Column(name = "ndetails_aut")
    private String ndetails_aut;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "news_id")
    private News news;

}
