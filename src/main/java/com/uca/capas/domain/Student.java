package com.uca.capas.domain;

public class Student {

	private String nombre;
	private String apellido;
	private String fEntrada;
	private String carrea;
	private Boolean estado;

	public Student(String nombre, String apellido, String fEntrada, String carrea, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fEntrada = fEntrada;
		this.carrea = carrea;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getfEntrada() {
		return fEntrada;
	}

	public void setfEntrada(String fEntrada) {
		this.fEntrada = fEntrada;
	}

	public String getCarrea() {
		return carrea;
	}

	public void setCarrea(String carrea) {
		this.carrea = carrea;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}