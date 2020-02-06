package com.capgemini.capcafe.loginregistration.controller;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;
import com.capgemini.capcafe.loginregistration.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserServiceController.class)
public class UserServiceControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	@Test
	public void addEmployeeTest () throws Exception {
		String exampleUserDetailsJson = "{" + 
				"	\"employeeId\":\"46001980\"," + 
				"	\"emailId\":\"rishav.dev@capgemini.com\"," + 
				"	\"password\":\"password\"," + 
				"	\"name\":\"Rishav Dev\"," + 
				"	\"phoneNumber\":\"9211420420\"," + 
				"	\"dateOfBirth\":\"1996-06-12\"," + 
				"	\"userRole\":\"SPOC\"" + 
				"}";
		
		Calendar dob = Calendar.getInstance();
		dob.set(1997, 1, 1);
		UserEntity mockUser = new UserEntity ("46001645", "kunal.roychoudhury@capgemini.com",
				"password", "Kunal Roychoudhury", "6234567891", dob, "Admin");
		
		Mockito.when(userService.signUp(Mockito.any(UserEntity.class))).thenReturn(mockUser);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/capcafe/add")
				.accept(MediaType.APPLICATION_JSON).content(exampleUserDetailsJson)
				.contentType(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		assertEquals(HttpStatus.OK.value(), response.getStatus());				
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