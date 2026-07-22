package com.example.projem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private long news_id;

    @Column(name = "news_title")
    private String news_title;

    @Column(name = "news_desc")
    private String news_desc;

    @Column(name = "news_img" ,length = (87000))
    private String news_img;

    @Column(name = "news_createdate")
    private String news_createdate;

    @Column(name = "news_updatedate")
    private String news_updatedate;


    @OneToOne(mappedBy = "news")
    private NewsDetails newsDetails;

}
