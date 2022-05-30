package fr.formation.service;


import fr.formation.entity.Couleur;
import fr.formation.repository.CouleurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouleurServiceImpl implements CouleurService {

    @Autowired
    CouleurDao cDao;

    @Override
    public List<Couleur> getAllCouleurs() {
        return cDao.findAll();
    }

    @Override
    public Optional<Couleur> getOneCouleurById(int id) {
        return cDao.findById(id);
    }
}
