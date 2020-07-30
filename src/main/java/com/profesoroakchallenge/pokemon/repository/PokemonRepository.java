/**
 * 
 */
package com.profesoroakchallenge.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.profesoroakchallenge.pokemon.model.Pokemon;


/**
 * @author zero1416
 *
 */
public interface PokemonRepository extends JpaRepository<Pokemon, String>{
	
	public List<Pokemon> findByRoute(String route);
	public List<Pokemon> findByType(String type);
	@Query("Select r from Pokemon r where r.number =: pokedexNumber")
	public Pokemon find(@Param("pokedexNumber") String pokedexNumber);
	
}
