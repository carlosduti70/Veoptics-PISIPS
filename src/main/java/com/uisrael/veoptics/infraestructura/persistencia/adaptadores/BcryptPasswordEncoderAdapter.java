package com.uisrael.veoptics.infraestructura.persistencia.adaptadores;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.uisrael.veoptics.dominio.repositorios.IPasswordEncoderPort;

@Component
public class BcryptPasswordEncoderAdapter implements IPasswordEncoderPort {

	private final PasswordEncoder passwordEncoder;

	public BcryptPasswordEncoderAdapter(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public String encode(String rawPassword) {
		return passwordEncoder.encode(rawPassword);
	}

	@Override
	public boolean matches(String rawPassword, String encodedPassword) {
		return passwordEncoder.matches(rawPassword, encodedPassword);
	}

}
