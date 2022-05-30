package fr.formation.service;

import fr.formation.entity.Bouteille;
import fr.formation.repository.BouteilleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BouteilleServiceImpl implements BouteilleService {

    @Autowired
    BouteilleDao bDao;

    @Override
    public List<Bouteille> recupBouteilles() {
        return bDao.findAll();
    }

    @Override
    public Optional<Bouteille> chercherBouteille(int id) {
        return bDao.findById(id);
    }

    @Override
    public void ajouterBouteille(Bouteille b) {
        bDao.save(b);
    }

    @Override
    public void supprimerBouteille(Bouteille b) {
        bDao.delete(b);
    }

    @Override
    public void modifierBouteille(Bouteille b) {
        bDao.save(b);
    }


}
