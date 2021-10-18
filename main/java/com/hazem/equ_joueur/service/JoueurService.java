package com.hazem.equ_joueur.service;

import java.util.List;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.entities.Joueur;

public interface JoueurService {
	Joueur saveJoueur(Joueur j);
	Joueur updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	void deleteJoueurById(Long id);
	Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	List<Joueur> findByNomNumero (String nom, int num);
	List<Joueur> findByEquipe (Equipe equipe);
	List<Joueur> findByEquipeIdEquipe(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	List<Joueur> trierJoueursNomsNumero();
}
