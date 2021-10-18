package com.hazem.equ_Joueur;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.entities.Joueur;
import com.hazem.equ_joueur.repos.EquJoueurRepository;



@SpringBootTest
class EquJoueurApplicationTests {

	@Autowired
	private EquJoueurRepository equJoueurRepository;
	@Test
	public void testCreateJoueur() {
	Joueur joue = new Joueur("Neymar Jr",10,new Date());
	equJoueurRepository.save(joue);
	}
	
	@Test
	public void testFindJoueur()
	{
	Joueur j = equJoueurRepository.findById(1L).get();

	System.out.println(j);
	}
	
	@Test
	public void testUpdateJoueur()
	{
	Joueur j = equJoueurRepository.findById(1L).get();
	j.setNumJoueur(10);
	equJoueurRepository.save(j);
	System.out.println(j);

	}
	@Test
	public void testDeleteJoueur()
	{
		equJoueurRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousJoueurs()
	{
	List<Joueur> joue = equJoueurRepository.findAll();
	for (Joueur p : joue)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testFindByNomJoueur()
	{
	List<Joueur> joue = equJoueurRepository.findByNomJoueur("Cristiano Ronaldo");
	for (Joueur j : joue)
	{
	System.out.println(j);
	} 
	}
	@Test
	public void testFindByNomJoueurContains ()
	{
	List<Joueur> joue=equJoueurRepository.findByNomJoueurContains("N");

	for (Joueur j : joue)
	{
	System.out.println(j);
	} 
	}
	@Test
	public void testfindByNomNumero()
	{
	List<Joueur> joue = equJoueurRepository.findByNomNumero("Paul Pogba",5);
	for (Joueur j : joue)
	{
	System.out.println(j);
	}

	}
	
	@Test
	public void testfindByEquipe()
	{
	Equipe equ = new Equipe();
	equ.setIdEquipe(2L);
	List<Joueur> joue = equJoueurRepository.findByEquipe(equ);
	System.out.println(joue);


	}
	@Test
	public void testfindByEquipeIdEquipe()
	{
	List<Joueur> joue = equJoueurRepository.findByEquipeIdEquipe(1L);
	for (Joueur j : joue)
	{
	System.out.println(j);
	}
	 }
	
	
	@Test
	public void testfindByOrderBynomJoueurAsc()
	{
	List<Joueur> joue = equJoueurRepository.findByOrderByNomJoueurAsc();
	for (Joueur j : joue)
	{
	System.out.println(j);
	}
	}
	@Test
	public void testtrierJoueursNomsNumero()
	{
	List<Joueur> joue = equJoueurRepository.trierJoueursNomsNumero();
	for (Joueur j : joue)
	{
	System.out.println(j);
	}
	}
	
	
}



	
