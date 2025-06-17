package org.modelo.empleado;

public class Empleado {
	private int id;
	private String nombre;
	private double salario;
	
	//CONSTRUCTORS
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(int id, String nombre, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	//GETTERS AND SETTERS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
