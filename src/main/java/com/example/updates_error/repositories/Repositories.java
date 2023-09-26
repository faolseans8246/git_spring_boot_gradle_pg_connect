package com.example.updates_error.repositories;

import com.example.updates_error.tablitsa.SecondTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositories extends JpaRepository <SecondTable, Long>, CrudRepository<SecondTable, Long> {
}
