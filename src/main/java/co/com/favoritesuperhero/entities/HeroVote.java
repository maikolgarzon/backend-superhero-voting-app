package co.com.favoritesuperhero.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "hero_vote")
public class HeroVote implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_hero")
	private Integer idHero;
	
	private String username;
	
	private String comentary;
	
	@Column(name = "create_at")
	private LocalDate createdAt;
	
	public HeroVote() {
		
	}
		
	public HeroVote(Integer idHero, String username, String comentary) {
		this.idHero = idHero;
		this.username = username;
		this.comentary = comentary;
	}

	@PrePersist
	public void actualDate() {
		createdAt = LocalDate.now();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdHero() {
		return idHero;
	}

	public void setIdHero(Integer idHero) {
		this.idHero = idHero;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getComentary() {
		return comentary;
	}

	public void setComentary(String comentary) {
		this.comentary = comentary;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	private static final long serialVersionUID = 1L;	
}