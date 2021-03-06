package ute.apdist.bddclient;

public class Estudiante {
	
	Estudiante() {}
	
	public Estudiante(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	private Long id;
	private String nombre;
	private String cedula;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return String.format("Estudiante{id:%d; nombre:%s; cédula:%s}", getId(), getNombre(), getCedula());
	}
}
