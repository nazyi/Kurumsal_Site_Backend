package com.example.projem.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long contact_id;

    @Column(name = "contact_name")
    private String contact_name;

    @Column(name = "contact_mail")
    private String contact_mail;

    @Column(name = "contact_msgtitle")
    private String contact_msgtitle;

    @Column(name = "contact_message")
    private String contact_message;

    @Column(name = "contact_createdate")
    private String contact_createdate;

    @Column(name = "contact_updatedate")
    private String contact_updatedate;

}


