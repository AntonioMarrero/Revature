package boot.assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.assignment.models.Dennis;
import boot.assignment.service.DennisService;


@CrossOrigin
@RestController
@RequestMapping("/dennis")
public class DennisController {
	
	@Autowired
	DennisService dennisService;
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Dennis addDennis(@Valid @RequestBody Dennis newDennis) {
		return dennisService.addDennis(newDennis);
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Dennis updateDennis(@Valid @RequestBody Dennis updatedDennis) {
		return dennisService.updateDennisById(updatedDennis);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Dennis> findAllDenniss() {
		return dennisService.findAllDenniss();
	}

	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Dennis findDennisById(@PathVariable("id") Long id) {
		System.out.println(dennisService.findDennisById(id));
		return dennisService.findDennisById(id);
	}
	
	@GetMapping(value="age/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Dennis findDennisByAge(@PathVariable("age") Long age) {
		System.out.println(dennisService.findDennisByAge(age));
		return dennisService.findDennisByAge(age);
	}
	
	@DeleteMapping(value="/delete/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteItem(@PathVariable("id") Long id) {
		dennisService.deleteDennisById(id);
	
	}
}
