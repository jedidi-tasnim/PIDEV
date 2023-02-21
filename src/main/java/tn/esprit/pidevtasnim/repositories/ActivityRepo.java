package tn.esprit.pidevtasnim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.pidevtasnim.entities.Activity;

public interface ActivityRepo extends JpaRepository<Activity,Long> {
}
