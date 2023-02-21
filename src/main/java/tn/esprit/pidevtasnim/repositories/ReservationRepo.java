package tn.esprit.pidevtasnim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.pidevtasnim.entities.Reservation;

import java.util.Optional;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
    void deleteById(Long id);

    Optional<Reservation> findEmployeeById(Long id);
}
