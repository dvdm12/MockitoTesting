package main.java.model;


public interface Calculadora {
	public double sumar(int a, int b);
	public double restar(int a, int b);
	public double multiplicar(int a, int b);
	public double dividir(int a, int b) throws IllegalArgumentException;	
	public double calcCoseno(double degree);
}
