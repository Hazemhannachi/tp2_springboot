package com.hazem.equ_joueur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.entities.Joueur;

@Repository
public interface EquJoueurRepository extends JpaRepository<Joueur, Long>  {
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	
	@Query("select j from Joueur j where j.nomJoueur like %:nom and j.numJoueur > :num")
	List<Joueur> findByNomNumero (@Param("nom") String nom,@Param("num") int num);
	
	@Query("select j from Joueur j where j.equipe = ?1")
	List<Joueur> findByEquipe (Equipe equipe);
	
	List<Joueur> findByEquipeIdEquipe(Long id);
	
	List<Joueur> findByOrderByNomJoueurAsc();
	
	@Query("select j from Joueur j order by j.nomJoueur ASC, j.numJoueur DESC")
	List<Joueur> trierJoueursNomsNumero ();


}
