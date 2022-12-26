package net.kelompok1.springboot.crudrestfulwebservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kelompok1.springboot.crudrestfulwebservice.exception.ResourceNotFoundException;
import net.kelompok1.springboot.crudrestfulwebservice.model.kelompok1;
import net.kelompok1.springboot.crudrestfulwebservice.repository.Kelompok1Repository;

@RestController
@RequestMapping("/api/v1")
public class Kelompok1Controller {
	
	@Autowired
	private Kelompok1Repository kelompok1Repsitory;
	
	// create get all kelompok1 api
	@GetMapping("/kelompok1")
	public List<kelompok1> getAllkelompok1(){
		return kelompok1Repsitory.findAll();
	}
	
	// create kelompok1
	@PostMapping("/kelompok1")
	public kelompok1 createKelompok1(@RequestBody kelompok1 kelompok1) {
		return kelompok1Repsitory.save(kelompok1);
	}
	
	@PutMapping("/kelompok1/{id}")
	public ResponseEntity<kelompok1> updateKelompok1(@PathVariable(value = "id") Long kelompok1Id,
			@RequestBody kelompok1 kelompok1Details) throws ResourceNotFoundException {
		kelompok1 kelompok1 = kelompok1Repsitory.findById(kelompok1Id)
				.orElseThrow(() -> new ResourceNotFoundException("Kelompok1 not found for this id :: " + kelompok1Id));

		kelompok1.setEmailId(kelompok1Details.getEmailId());
		kelompok1.setLastName(kelompok1Details.getLastName());
		kelompok1.setFirstName(kelompok1Details.getFirstName());
		final kelompok1 updatedKelompok1 = kelompok1Repsitory.save(kelompok1);
		return ResponseEntity.ok(updatedKelompok1);
	}
	
	@DeleteMapping("/kelompok1/{id}")
	public Map<String, Boolean> deleteKelompok1(@PathVariable(value = "id") Long kelompok1Id)
			throws ResourceNotFoundException {
		kelompok1 kelompok1 = kelompok1Repsitory.findById(kelompok1Id)
				.orElseThrow(() -> new ResourceNotFoundException("Kelompok1 not found for this id :: " + kelompok1Id));

		kelompok1Repsitory.delete(kelompok1);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
}
