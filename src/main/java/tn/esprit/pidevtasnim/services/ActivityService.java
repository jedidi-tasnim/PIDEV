package tn.esprit.pidevtasnim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidevtasnim.entities.Activity;
import tn.esprit.pidevtasnim.exception.UserNotFoundException;
import tn.esprit.pidevtasnim.repositories.ActivityRepo;

import java.util.List;

@Service
public class ActivityService implements IActivityService{
    @Autowired
    ActivityRepo activityRepo;
    @Override
    public Activity addActivity(Activity activity) {
        return activityRepo.save(activity);
    }

    @Override
    public List<Activity> findAllActivity() {
        return activityRepo.findAll();
    }

    @Override
    public Activity updateActivity(Activity activity) {
        return activityRepo.save(activity);
    }

    @Override
    public Activity findById(Long id) {
        return activityRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Override
    public void deleteActivity(Long id) {
        activityRepo.deleteById(id);
    }

}
