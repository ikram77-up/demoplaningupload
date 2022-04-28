package org.demoplaningupload.repositories;


import org.demoplaningupload.model.Planing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaningRepository extends JpaRepository<Planing,Long> {
}
