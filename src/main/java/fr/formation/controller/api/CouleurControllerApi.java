package fr.formation.controller.api;

import fr.formation.entity.Bouteille;
import fr.formation.entity.Couleur;
import fr.formation.service.CouleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/couleur")
public class CouleurControllerApi {

    @Autowired
    CouleurService cs;

    @GetMapping
    public List<Couleur> getAllCouleurs(){
        return cs.getAllCouleurs();
    }

    @GetMapping("/{id}")
    public Optional<Couleur> getCouleurById(@PathVariable("id") int id) {
        return cs.getOneCouleurById(id);
    }

    @PostMapping("/add")
    public void addCouleur(@RequestBody Couleur c) {
        cs.ajouterCouleur(c);
    }


    @PutMapping("/update")
    public void updateCouleur(@RequestBody Couleur c) {
        cs.modifierCouleur(c);
    }


    @DeleteMapping("/{id}")
    public void deleteCouleur(@RequestBody @PathVariable("id") int id) {
        cs.supprimerCouleur(id);
    }
}
