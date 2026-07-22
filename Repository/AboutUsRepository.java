package com.example.projem.Repository;


import com.example.projem.Entity.AboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface AboutUsRepository extends JpaRepository<AboutUs,Long> {
}
