package main.java.model;

import java.util.Date;

public class Reserva {
	private String cliente;
	private Date fecha;
	
	public Reserva(String cliente, Date fecha) {
		this.cliente = cliente;
		this.fecha = fecha;
	}
	public String getCliente() {
	return cliente;
	}
	public Date getFecha() {
	return fecha;
	}
}
