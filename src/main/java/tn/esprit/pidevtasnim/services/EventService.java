package tn.esprit.pidevtasnim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidevtasnim.entities.Event;
import tn.esprit.pidevtasnim.exception.UserNotFoundException;
import tn.esprit.pidevtasnim.repositories.EventRepo;

import java.util.List;

@Service
public class EventService implements IEventService{
    @Autowired
    EventRepo eventRepo;
    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public List<Event> findAllEvent() {
        return eventRepo.findAll();
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public Event findById(Long id) {
        return eventRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepo.deleteById(id);
    }


}
