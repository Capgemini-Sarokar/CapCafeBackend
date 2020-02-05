package com.capgemini.capcafe.loginregistration.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.loginregistration.entity.UserEntity;

public interface UserPersistence extends JpaRepository<UserEntity, String> {

}
