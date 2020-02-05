package com.capgemini.capcafe.loginregistration.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.capcafe.loginregistration.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserServiceController.class)
public class UserServiceControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	@Test
	public void adEmployeeTest () throws Exception {
		
	}
}


/*
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
*/