package main.java.service;

import java.lang.Math;

import main.java.model.Calculadora;

public class CalculadoraService implements Calculadora{
	
	public double sumar(int a, int b) {
		return a+b;
	}
	
	public double restar(int a, int b) {
		return a-b;
	}
	
	public double multiplicar(int a, int b) {
		return a*b;
	}
	
	public double dividir(int a, int b) throws IllegalArgumentException {
		if(b==0) throw new IllegalArgumentException("denominator might not be zero");
		
		return a/b;
	}
	
	public double calcCoseno(double degree) {
		return Math.cos(degree);
	}
	
}
	