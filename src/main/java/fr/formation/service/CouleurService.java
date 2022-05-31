package fr.formation.service;

import fr.formation.entity.Bouteille;
import fr.formation.entity.Couleur;

import java.util.List;
import java.util.Optional;

public interface CouleurService {

    List<Couleur> getAllCouleurs();

    Optional<Couleur> getOneCouleurById(int id);

    void supprimerCouleur(int id);

    void ajouterCouleur(Couleur c);

    void modifierCouleur(Couleur c);
}
