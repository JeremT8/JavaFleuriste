package fr.formation.repository;

import fr.formation.entity.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurDao extends JpaRepository<Couleur, Integer> {
}
