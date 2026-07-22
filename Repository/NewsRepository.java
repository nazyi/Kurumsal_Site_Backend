package com.example.projem.Repository;

import com.example.projem.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRepository extends JpaRepository<News, Long> {
}
