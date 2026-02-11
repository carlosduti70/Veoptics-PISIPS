package com.uisrael.veoptics.dominio.repositorios;

public interface IPasswordEncoderPort {

	String encode(String rawPassword);

	boolean matches(String rawPassword, String encodedPassword);
}
