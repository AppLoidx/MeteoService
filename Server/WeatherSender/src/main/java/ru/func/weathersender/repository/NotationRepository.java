package ru.func.weathersender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.func.weathersender.entity.Notation;

import java.util.List;
import java.util.Optional;

/**
 * @author func 04.01.2020
 */
@Repository
public interface NotationRepository extends JpaRepository<Notation, Integer> {

    List<Notation> findByLocation(String location);

    List<Notation> findByTimestamp(String timestamp);

    @Query(value = "SELECT * FROM notations WHERE id = (SELECT MAX(id) FROM notations WHERE location = ?1)", nativeQuery = true)
    Optional<Notation> findNewestNotationByLocation(String location);
}