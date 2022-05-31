package fr.formation.controller.api;

import fr.formation.entity.Couleur;
import fr.formation.entity.Region;
import fr.formation.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/region")
public class RegionControllerApi {

    @Autowired
    RegionService rs;

    @GetMapping
    public List<Region> getAllRegion() {
        return rs.recupRegion();
    }

    @GetMapping("/{id}")
    public Optional<Region> getRegionById(@PathVariable("id") int id) {
        return rs.getRegionById(id);
    }

    @PostMapping("/add")
    public void addRegion(@RequestBody Region r) {
        rs.ajouterRegion(r);
    }


    @PutMapping("/update")
    public void updateRegion(@RequestBody Region r) {
        rs.modifierRegion(r);
    }


    @DeleteMapping("/{id}")
    public void deleteRegion(@RequestBody @PathVariable("id") int id) {
        rs.supprimerRegion(id);
    }
}
