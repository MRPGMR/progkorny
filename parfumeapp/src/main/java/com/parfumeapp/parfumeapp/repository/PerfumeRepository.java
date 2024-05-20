package com.parfumeapp.parfumeapp.repository;
/*

 */
import com.parfumeapp.parfumeapp.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeRepository extends JpaRepository <Perfume,Integer> {
}
