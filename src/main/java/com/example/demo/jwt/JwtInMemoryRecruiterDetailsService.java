package com.example.demo.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.JobSeekerRegistrationModel;
import com.example.demo.model.RecruiterRegistrationModel;
import com.example.demo.service.JobSeekerRegistrationService;
import com.example.demo.service.RecruiterRegistrationService;

public class JwtInMemoryRecruiterDetailsService implements UserDetailsService{

	
	@Autowired
	RecruiterRegistrationService recruiterRegistrationService;
	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	static {
		inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
				"$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
		inMemoryUserList.add(new JwtUserDetails(2L, "ranga",
				"$2a$10$IetbreuU5KihCkDB6/r1DOJO0VyU9lSiBcrMDT.biU7FOt2oqZDPm", "ROLE_USER_2"));
		
		//$2a$10$IetbreuU5KihCkDB6/r1DOJO0VyU9lSiBcrMDT.biU7FOt2oqZDPm
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		RecruiterRegistrationModel recruiterList = recruiterRegistrationService.findRecruiterByEmail(username);
		
		List<JwtUserDetails> inMemoryUserList = new ArrayList<>();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		inMemoryUserList.add(new JwtUserDetails(Long.valueOf(recruiterList.getRecruiterId()),recruiterList.getEmail(),encoder.encode(recruiterList.getPassword()),"recruiter"));
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream().filter(user -> user.getUsername().equals(username)).findFirst();
		
		if (!findFirst.isPresent()) {
		throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}
		
		return findFirst.get();
		}
	
}
