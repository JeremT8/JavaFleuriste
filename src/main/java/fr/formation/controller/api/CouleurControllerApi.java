package fr.formation.controller.api;

import fr.formation.entity.Couleur;
import fr.formation.service.CouleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
