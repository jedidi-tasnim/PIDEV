package tn.esprit.pidevtasnim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.pidevtasnim.entities.Event;

public interface EventRepo extends JpaRepository<Event,Long> {
}
