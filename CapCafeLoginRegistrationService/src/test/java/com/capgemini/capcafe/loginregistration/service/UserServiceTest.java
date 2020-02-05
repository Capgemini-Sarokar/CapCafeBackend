package com.capgemini.capcafe.loginregistration.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;
import com.capgemini.capcafe.loginregistration.exception.UserException;
import com.capgemini.capcafe.loginregistration.persistence.UserPersistence;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@InjectMocks
    UserService userService = new UserServiceImpl();
    
	@Mock
	BCryptPasswordEncoder passwordEncoder;
	
    @Mock
    UserPersistence userDao;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void signUpTest () throws UserException {
    	Calendar dob = Calendar.getInstance();
		dob.set(1997, 1, 1);
        UserEntity user = new UserEntity ("46001645", "kunal.roychoudhury@capgemini.com",
				"password", "Kunal Roychoudhury", "6234567891", dob, "Admin");
        
        Mockito.when(userDao.save(Mockito.any(UserEntity.class))).thenReturn(user);
        this.userService.signUp(user);
         
        verify(userDao, times(1)).save(user);
    }
}
