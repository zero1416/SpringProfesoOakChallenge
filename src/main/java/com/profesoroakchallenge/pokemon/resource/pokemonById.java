/**
 * 
 */
package com.profesoroakchallenge.pokemon.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author zero1416
 *
 */
@RestController
public class pokemonById {
	private String pokemonNumber;
	
	public void pokemonResource(String pokemonId) {
		this.pokemonNumber=pokemonId;
	}
	@RequestMapping("/pokemon")
	public ResponseEntity<String> findPokemon(){
		return ResponseEntity.ok("Picachu");
	}
}
