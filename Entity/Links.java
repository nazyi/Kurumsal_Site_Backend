package com.example.projem.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="links")
public class Links {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long links_id;

    @Column(name = "links_url")
    private String links_url;

    @Column(name = "links_name")
    private String links_name;

    @Column(name = "links_desc")
    private String links_desc;

    @Column(name = "links_createdate")
    private String links_createdate;

    @Column(name = "links_updatedate")
    private String links_updatedate;

}


