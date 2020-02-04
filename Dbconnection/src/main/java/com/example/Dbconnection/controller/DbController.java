package com.example.Dbconnection.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dbconnection.entity.DbEntity;
import com.example.Dbconnection.repository.DbRepository;

@RestController
public class DbController {

	
	@Autowired
	DbRepository repo;
	
	//Save a data on the database
	
	@PostMapping(path="/Store")
	@ResponseBody
	public String StoreData(@RequestBody DbEntity SaveData)
	{
		
		repo.save(SaveData);
		return "Data saved successfully";
	}
	
	//Delete a element from the database
	
	@DeleteMapping(path="/delete/{deletedata}")
	@ResponseBody
	public String DeleteData(@PathVariable Integer deletedata)
	{
		repo.deleteById(deletedata);
		return "deleted successfully";
	}
	
	//Retrieve Data from the database
	
	@GetMapping(path="/get/{getdata}")
	@ResponseBody
	public Optional<DbEntity> reterivedata(@PathVariable Integer getdata)
	{
		Optional<DbEntity> list=repo.findById(getdata);
		return list;
			
	}
	
	//Updating Data on the specific element
	
	@PutMapping(path="/update/{adddata}")
	@ResponseBody
	public String addnewuser(@RequestBody DbEntity dataupdate,@PathVariable Integer adddata)
	{
		Optional<DbEntity> ent=repo.findById(adddata);

		return "Data updated sucessfully";
	}
	}
	
	

