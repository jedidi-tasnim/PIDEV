package tn.esprit.pidevtasnim.services;

import tn.esprit.pidevtasnim.entities.Tasnim;

import java.io.Serializable;

public interface TasnimInterface extends Serializable {

    Tasnim ajouterTasnim(Tasnim t);
}
