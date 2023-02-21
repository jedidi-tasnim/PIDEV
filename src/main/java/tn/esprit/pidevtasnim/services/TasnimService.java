package tn.esprit.pidevtasnim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidevtasnim.entities.Tasnim;
import tn.esprit.pidevtasnim.repositories.TasnimRepository;

@Service
public class TasnimService implements TasnimInterface{

    @Autowired
    TasnimRepository tasnimRepository;

    @Override
    public Tasnim ajouterTasnim(Tasnim t) {
        return tasnimRepository.save(t);
    }
}
