package com.api.brasfoot.brasfoot.Model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caracteristica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private BigDecimal relevancia;
	
	public Caracteristica() {
		
	}
	public Caracteristica(String nome, BigDecimal relevancia) {
		super();
		this.nome = nome;
		this.relevancia = relevancia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getRelevancia() {
		return relevancia;
	}
	public void setRelevancia(BigDecimal relevancia) {
		this.relevancia = relevancia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caracteristica other = (Caracteristica) obj;
		return Objects.equals(id, other.id);
	}

}
