package tn.esprit.pidevtasnim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.pidevtasnim.entities.CenterOfCamp;

public interface CenterOfCampRepo extends JpaRepository<CenterOfCamp,Long> {
}
