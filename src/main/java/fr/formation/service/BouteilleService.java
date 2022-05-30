package fr.formation.service;

import fr.formation.entity.Bouteille;

import java.util.List;
import java.util.Optional;

public interface BouteilleService {

    List<Bouteille> recupBouteilles();

    Optional<Bouteille> chercherBouteille(int id);

    void ajouterBouteille(Bouteille b);

    void supprimerBouteille(Bouteille b);

    void modifierBouteille(Bouteille b);
}
