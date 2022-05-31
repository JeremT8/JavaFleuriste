package fr.formation.service;

import fr.formation.entity.Couleur;
import fr.formation.entity.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {

    List<Region> recupRegion();


    Optional<Region> getRegionById(int id);

    void supprimerRegion(int id);

    void ajouterRegion(Region r);

    void modifierRegion(Region r);
}
