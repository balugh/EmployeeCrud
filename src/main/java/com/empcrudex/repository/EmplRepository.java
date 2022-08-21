package com.empcrudex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empcrudex.entity.Empl;

public interface EmplRepository extends JpaRepository<Empl, Integer> {

}
