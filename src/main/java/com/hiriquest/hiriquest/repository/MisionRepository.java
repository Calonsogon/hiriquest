package com.hiriquest.hiriquest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hiriquest.hiriquest.model.Mision;

public interface MisionRepository extends JpaRepository<Mision, Long> {
   }
