package tn.esprit.pidevtasnim.services;

import tn.esprit.pidevtasnim.entities.Activity;
import tn.esprit.pidevtasnim.entities.Event;

import java.io.Serializable;
import java.util.List;

public interface IActivityService extends Serializable {

    Activity addActivity(Activity activity);
    public List<Activity> findAllActivity();
    public Activity updateActivity(Activity activity);
    public Activity findById(Long id);
    public void deleteActivity(Long id);
}
