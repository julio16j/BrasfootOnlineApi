package com.api.brasfoot.brasfoot.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String nome;
	private Time time;
	private Integer idade;
	private BigDecimal altura;
	@NotNull
	private Integer forca;
	@Enumerated(EnumType.STRING)
	private PernaBoaEnum pernaBoa;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "jogador_id")
	private List<Caracteristica> caracteristicas;
	private Boolean estrela;
	private BigDecimal passe;
	private BigDecimal stamina;
	private BigDecimal salario;
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
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	public PernaBoaEnum getPernaBoa() {
		return pernaBoa;
	}
	public void setPernaBoa(PernaBoaEnum pernaBoa) {
		this.pernaBoa = pernaBoa;
	}
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Boolean getEstrela() {
		return estrela;
	}
	public void setEstrela(Boolean estrela) {
		this.estrela = estrela;
	}
	public BigDecimal getPasse() {
		return passe;
	}
	public void setPasse(BigDecimal passe) {
		this.passe = passe;
	}
	public BigDecimal getStamina() {
		return stamina;
	}
	public void setStamina(BigDecimal stamina) {
		this.stamina = stamina;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
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
		Jogador other = (Jogador) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
