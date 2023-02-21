package tn.esprit.pidevtasnim.services;

import tn.esprit.pidevtasnim.entities.Event;
import tn.esprit.pidevtasnim.entities.Reservation;

import java.io.Serializable;
import java.util.List;

public interface IEventService extends Serializable {

    Event addEvent(Event event);

    public List<Event> findAllEvent();
    public Event updateEvent(Event event);
    public Event findById(Long id);
    public void deleteEvent(Long id);
}
