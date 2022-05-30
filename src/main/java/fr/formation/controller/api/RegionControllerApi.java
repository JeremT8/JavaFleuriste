package fr.formation.controller.api;

import fr.formation.entity.Region;
import fr.formation.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
