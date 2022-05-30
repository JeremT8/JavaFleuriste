package fr.formation.service;

import fr.formation.entity.Couleur;

import java.util.List;
import java.util.Optional;

public interface CouleurService {

    List<Couleur> getAllCouleurs();

    Optional<Couleur> getOneCouleurById(int id);
}
