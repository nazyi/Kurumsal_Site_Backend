package com.example.projem.Repository;

import com.example.projem.Entity.NewsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsDetailsRepository extends JpaRepository<NewsDetails,Long> {
}
