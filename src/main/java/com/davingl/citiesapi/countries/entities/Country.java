package com.davingl.citiesapi.countries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
	
	@Id
	Long id;
	
	@Column(name = "nome")
	String nome;
	
	@Column(name = "nome_pt")
	String nome_pt;
	
	@Column(name = "sigla")
	String sigla;
	
	//@Column(name = "bacen")	-> Quando o nome na classe, é o mesmo na tabela, não precisa mapear.
	Integer bacen;
	
	
	public Country() {
		
	}
	
	public Country(Long id, String nome, String nome_pt, String sigla, Integer bacen) {
		super();
		this.id = id;
		this.nome = nome;
		this.nome_pt = nome_pt;
		this.sigla = sigla;
		this.bacen = bacen;
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

	public String getNome_pt() {
		return nome_pt;
	}

	public void setNome_pt(String nome_pt) {
		this.nome_pt = nome_pt;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getBacen() {
		return bacen;
	}

	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
	
	
}
