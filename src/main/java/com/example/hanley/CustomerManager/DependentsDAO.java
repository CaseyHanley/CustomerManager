package com.example.hanley.CustomerManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentsDAO extends JpaRepository<DependentsEntity,Integer> {
}
