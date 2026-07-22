package com.example.projem.Repository;

import com.example.projem.Entity.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseDetailsRepository extends JpaRepository<CourseDetails, Long> {
}
