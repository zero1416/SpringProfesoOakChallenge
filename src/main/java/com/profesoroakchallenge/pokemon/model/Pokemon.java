package com.profesoroakchallenge.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name= "pokemon")
@NamedQuery(name="Pokemon.findByType",query="Select p from Pokemon p where p.type = ?1")
public class Pokemon {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String id;
	private String name;
	private String type;
	private String route;
	private String number;
	
	public Pokemon() {
		
	}
}
