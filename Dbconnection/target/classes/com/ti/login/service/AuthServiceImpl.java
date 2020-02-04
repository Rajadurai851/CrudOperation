package com.ti.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ti.login.entity.TechIndiaEntity;
import com.ti.login.repository.TechIndiaAuth;

@Service
public class AuthServiceImpl implements AuthServiceInterface {
	@Autowired
	TechIndiaAuth repo;

	@Override
	public Boolean validateUser(String userName, String passWord) {

		TechIndiaEntity result = repo.findByuserName(userName);
		

		if (Optional.ofNullable(result).isPresent() && result.getPassword().compareTo(passWord) == 0) {

			return true;
		}

		return false;
	}

}
