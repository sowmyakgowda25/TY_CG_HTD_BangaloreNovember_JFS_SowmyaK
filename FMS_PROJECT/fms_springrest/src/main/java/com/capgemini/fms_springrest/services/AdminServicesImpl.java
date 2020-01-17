package com.capgemini.fms_springrest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.capgemini.fms_springrest.dao.AdminDao;
import com.capgemini.fms_springrest.dto.LoginBean;
import com.capgemini.fms_springrest.exception.LoginException;
import com.capgemini.fms_springrest.validations.Validations;

@Service
public class AdminServicesImpl implements AdminService {

	@Autowired
	private AdminDao dao;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	public boolean adminLogin(String name, String password) {
		if (Validations.isValidName(name)) {
			if (Validations.passwordFormat(password) == 10) {
				return dao.adminLogin(name, password);
			} else {
				throw new LoginException("Password should contains atleast one uppercase,"
						+ "one lowercase,one digit, and one special character");
			}
		} else {
			throw new LoginException("Enter alphabets only...");
		}
	}

	public boolean clientSignUp(LoginBean client) {
		String cId = Integer.toString(client.getId());
		if (Validations.isValidId(cId)) {
			if (Validations.isValidName(client.getUserName())) {
				if (Validations.passwordFormat(client.getPassword()) == 10) {
					if (Validations.isValidName(client.getType())) {
						return dao.clientSignUp(client);
					} else {
						throw new LoginException("Enter alphabets only");
					}
				} else {
					throw new LoginException("Password should contains atleast one uppercase,"
							+ "one lowercase,one digit, and one special character");
				}
			} else {
				throw new LoginException("Please Enter alphabets only");
			}
		} else {
			throw new LoginException("Please Enter digits only");
		}
	}

	public boolean schedularSignUp(LoginBean schedular) {
		String schedulId = Integer.toString(schedular.getId());
		if (Validations.isValidId(schedulId)) {
			if (Validations.isValidName(schedular.getUserName())) {
				if (Validations.passwordFormat(schedular.getPassword()) == 10) {
					if (Validations.isValidName(schedular.getType())) {
						return dao.schedularSignUp(schedular);
					} else {
						throw new LoginException("Enter alphabets only");
					}
				} else {
					throw new LoginException("Password should contains atleast one uppercase,"
							+ "one lowercase,one digit, and one special character");
				}
			} else {
				throw new LoginException("Please Enter alphabets only");
			}
		} else {
			throw new LoginException("Please Enter digits only");
		}
	}

	public boolean clientLogin(String name, String password) {
		if (Validations.isValidName(name)) {
			if (Validations.passwordFormat(password) == 10) {
				return dao.clientLogin(name, password);
			} else {
				throw new LoginException("Password should contains atleast one uppercase,"
						+ "one lowercase,one digit, and one special character");
			}
		} else {
			throw new LoginException("Enter alphabets only...");
		}

	}

	@Override
	public boolean adminRegister(LoginBean admin) {
		String adminlId = Integer.toString(admin.getId());
		if (Validations.isValidId(adminlId)) {
			if (Validations.isValidName(admin.getUserName())) {
				if (Validations.passwordFormat(admin.getPassword()) == 10) {
					if (Validations.isValidName(admin.getType())) {
						return dao.adminRegister(admin);
					} else {
						throw new LoginException("Enter alphabets only");
					}
				} else {
					throw new LoginException("Password should contains atleast one uppercase,"
							+ "one lowercase,one digit, and one special character");
				}
			} else {
				throw new LoginException("Please Enter alphabets only");
			}
		} else {
			throw new LoginException("Please Enter digits only");
		}
	}
}
