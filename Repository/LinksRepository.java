package com.example.projem.Repository;

import com.example.projem.Entity.Links;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LinksRepository extends JpaRepository<Links,Long> {
}
