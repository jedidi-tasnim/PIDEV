package tn.esprit.pidevtasnim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidevtasnim.entities.Campsite;
import tn.esprit.pidevtasnim.exception.UserNotFoundException;
import tn.esprit.pidevtasnim.repositories.CampsiteRepo;

import java.util.List;

@Service
public class CampsiteService implements ICampsiteService{
    @Autowired
    CampsiteRepo campsiteRepo;
    @Override
    public Campsite addCampsite(Campsite campsite) {
        return campsiteRepo.save(campsite);
    }

    @Override
    public List<Campsite> findAllCampsite() {
        return campsiteRepo.findAll();
    }

    @Override
    public Campsite updateCampsite(Campsite campsite) {
        return campsiteRepo.save(campsite);
    }

    @Override
    public Campsite findById(Long id) {
        return campsiteRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Override
    public void deleteCampsite(Long id) {
        campsiteRepo.deleteById(id);
    }


}
