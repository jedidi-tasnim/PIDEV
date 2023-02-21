package tn.esprit.pidevtasnim.services;

import tn.esprit.pidevtasnim.entities.Campsite;
import tn.esprit.pidevtasnim.entities.Event;

import java.io.Serializable;
import java.util.List;

public interface ICampsiteService extends Serializable {

    Campsite addCampsite(Campsite campsite);
    public List<Campsite> findAllCampsite();
    public Campsite updateCampsite(Campsite campsite);
    public Campsite findById(Long id);
    public void deleteCampsite(Long id);

}
