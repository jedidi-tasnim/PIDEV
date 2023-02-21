package tn.esprit.pidevtasnim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidevtasnim.entities.Tasnim;

public interface TasnimRepository extends JpaRepository<Tasnim, Integer> {
}