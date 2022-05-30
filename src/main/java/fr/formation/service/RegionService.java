package fr.formation.service;

import fr.formation.entity.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {

    List<Region> recupRegion();


    Optional<Region> getRegionById(int id);
}
