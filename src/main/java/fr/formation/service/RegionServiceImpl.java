package fr.formation.service;


import fr.formation.entity.Region;
import fr.formation.repository.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionDao rDao;


    @Override
    public List<Region> recupRegion() {
        return rDao.findAll();
    }

    @Override
    public Optional<Region> getRegionById(int id) {
        return rDao.findById(id);
    }


}
