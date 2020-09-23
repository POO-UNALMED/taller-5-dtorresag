package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private  ArrayList<Animal>animal= new ArrayList<>();
	
	
	public Zona(String nombre, Zoologico zoo) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
	}


	public Zona() {
		super();
	}


	public int cantidadAnimales() {
		return animal.size();
	}
	
	public void agregarAnimales(Animal a) {
		animal.add(a);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Animal> getAnimal() {
		return animal;
	}


	public void setAnimal(ArrayList<Animal> animal) {
		this.animal = animal;
	}


	public Zoologico getZoo() {
		return zoo;
	}


	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
}

