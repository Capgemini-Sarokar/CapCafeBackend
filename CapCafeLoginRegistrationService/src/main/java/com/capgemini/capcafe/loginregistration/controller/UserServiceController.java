package com.capgemini.capcafe.loginregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;
import com.capgemini.capcafe.loginregistration.exception.UserException;
import com.capgemini.capcafe.loginregistration.service.UserService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/capcafe")
public class UserServiceController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/add")
	public UserEntity addEmployee(@RequestBody UserEntity newUser) throws UserException {
		return this.userService.signUp(newUser);
	}

	@GetMapping(value = "/id/{id}")
	public UserEntity getById(@PathVariable String id) throws UserException {
		return this.userService.getById(id);
	}

	@PutMapping(value = "/update")
	public UserEntity update(@RequestBody UserEntity user) {
		return this.userService.update(user);
	}

	@PutMapping(value = "/chng/{id}/{prevpass}/{newpass}")
	public boolean newPassword(@PathVariable String id, @PathVariable String prevpass, @PathVariable String newpass) throws UserException {
		return this.userService.newPassword(id, prevpass, newpass);
	}

	@GetMapping(value = "/login/{id}/{password}")
	public UserEntity login(@PathVariable String id, @PathVariable String password)
			throws UserException {
		return this.userService.login(id, password);
	}

	@GetMapping(value = "/all")
	public List<UserEntity> getAll() throws UserException {
		return this.userService.getAll();
	}
	
}
