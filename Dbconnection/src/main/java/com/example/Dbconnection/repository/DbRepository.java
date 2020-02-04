package com.example.Dbconnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dbconnection.entity.DbEntity;

@Repository
public interface DbRepository extends JpaRepository<DbEntity, Integer> {



}
