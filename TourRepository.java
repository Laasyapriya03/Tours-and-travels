package com.mn.tourism;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<Tours, Long> {

    @Query("SELECT t FROM Tours t ORDER BY t.tourName ASC, t.startDate DESC")
    List<Tours> findAllOrdered();
}
