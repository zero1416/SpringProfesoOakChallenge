package com.profesoroakchallenge.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name= "pokemon")
public class Pokemon {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idPokemon;
	private String namePokemon;
	private String typePokemon;
	private String routePokemon;
	private String numerPokemon;
	
	public Pokemon() {
		
	}
}
