package com.hazem.equ_joueur.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Joueur {
	
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJoueur;
	private String nomJoueur;
	private int numJoueur;
	private Date dateTransfert;

	@ManyToOne
	private Equipe equipe;
	
	

	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Joueur(String nomJoueur, int numJoueur, Date dateTransfert) {
		super();
		this.nomJoueur = nomJoueur;
		this.numJoueur = numJoueur;
		this.dateTransfert = dateTransfert;
	}
	public Long getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}

	public Date getDateTransfert() {
		return dateTransfert;
	}

	public void setDateTransfert(Date dateTransfert) {
		this.dateTransfert = dateTransfert;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}


	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur + ", numJoueur=" + numJoueur
				+ ", dateTransfert=" + dateTransfert + "]";
	}

	

	
	
}
