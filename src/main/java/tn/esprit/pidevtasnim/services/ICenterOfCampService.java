package tn.esprit.pidevtasnim.services;

import tn.esprit.pidevtasnim.entities.CenterOfCamp;
import tn.esprit.pidevtasnim.entities.Event;

import java.io.Serializable;
import java.util.List;

public interface ICenterOfCampService extends Serializable {

    CenterOfCamp addCenterOfCamp(CenterOfCamp centerOfCamp);
    List<CenterOfCamp> findAllCenterOfCamp();
    CenterOfCamp updateCenterOfCamp(CenterOfCamp centerOfCamp);
    CenterOfCamp findById(Long id);
    void deleteCenterOfCamp(Long id);
}
