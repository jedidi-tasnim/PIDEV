package tn.esprit.pidevtasnim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidevtasnim.entities.CenterOfCamp;
import tn.esprit.pidevtasnim.exception.UserNotFoundException;
import tn.esprit.pidevtasnim.repositories.CenterOfCampRepo;

import java.util.List;

@Service
public class CenterOfCampService implements ICenterOfCampService{
    @Autowired
    CenterOfCampRepo centerOfCampRepo;
    @Override
    public CenterOfCamp addCenterOfCamp(CenterOfCamp centerOfCamp) {
        return centerOfCampRepo.save(centerOfCamp);
    }

    @Override
    public List<CenterOfCamp> findAllCenterOfCamp() {
        return centerOfCampRepo.findAll();
    }

    @Override
    public CenterOfCamp updateCenterOfCamp(CenterOfCamp centerOfCamp) {
        return centerOfCampRepo.save(centerOfCamp);
    }

    @Override
    public CenterOfCamp findById(Long id) {
        return centerOfCampRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Override
    public void deleteCenterOfCamp(Long id) {
        centerOfCampRepo.deleteById(id);
    }


}
