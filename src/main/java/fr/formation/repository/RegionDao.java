package fr.formation.repository;

import fr.formation.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionDao extends JpaRepository<Region, Integer> {
}
