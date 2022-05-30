package fr.formation.controller.api;

import fr.formation.entity.Bouteille;
import fr.formation.service.BouteilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bouteille")
public class BouteilleControllerApi {

    @Autowired
    BouteilleService bs;

    @GetMapping("")
    public List<Bouteille> getAllBouteille(){
        return bs.recupBouteilles();
    }

    @GetMapping("/{id}")
    public Optional<Bouteille> getOneBouteilleById(@PathVariable("id") int id) {
        return bs.chercherBouteille(id);
    }

    @PostMapping("/add")
    public void addBouteille(@RequestBody Bouteille b) {
        bs.ajouterBouteille(b);
    }


    @PutMapping("/update")
    public void updateBouteille(@RequestBody Bouteille b) {
        bs.modifierBouteille(b);
    }


}
