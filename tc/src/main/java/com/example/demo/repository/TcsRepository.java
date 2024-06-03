package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tc;
@Repository
public interface TcsRepository extends JpaRepository<Tc, Long>{

}
