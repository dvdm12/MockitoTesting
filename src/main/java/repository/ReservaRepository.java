package main.java.repository;

import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import main.java.model.Reserva;

public class ReservaRepository {
	public List<Reserva> findAll(){
		List<Reserva> reservationsList = Arrays.asList(
	            new Reserva("Ana López", createDate(2024, 1, 15)),
	            new Reserva("Carlos Gómez", createDate(2024, 2, 20)),
	            new Reserva("Maria Fernández", createDate(2024, 3, 5)),
	            new Reserva("Luis Martínez", createDate(2024, 4, 10)),
	            new Reserva("Laura Rodríguez", createDate(2024, 5, 25)),
	            new Reserva("Pedro Sánchez", createDate(2024, 6, 30)),
	            new Reserva("Carmen García", createDate(2024, 7, 15)),
	            new Reserva("Antonio Pérez", createDate(2024, 8, 20)),
	            new Reserva("Isabel Moreno", createDate(2024, 9, 10)),
	            new Reserva("Javier Ruiz", createDate(2024, 10, 5)),
	            new Reserva("Sonia Torres", createDate(2024, 11, 25)),
	            new Reserva("David Ramírez", createDate(2024, 12, 15)),
	            new Reserva("Elena Vargas", createDate(2024, 1, 5)),
	            new Reserva("Manuel Ortega", createDate(2024, 2, 25)),
	            new Reserva("Raquel Soto", createDate(2024, 3, 15)),
	            new Reserva("Fernando Castro", createDate(2024, 4, 20)),
	            new Reserva("Marta López", createDate(2024, 5, 10)),
	            new Reserva("José Díaz", createDate(2024, 6, 5)),
	            new Reserva("Julia Romero", createDate(2024, 7, 25)),
	            new Reserva("Alberto Gómez", createDate(2024, 8, 15)),
	            new Reserva("Verónica Silva", createDate(2024, 9, 5)),
	            new Reserva("Ricardo Morales", createDate(2024, 10, 20)),
	            new Reserva("Carmen López", createDate(2024, 11, 10)),
	            new Reserva("Ángel Jiménez", createDate(2024, 12, 30)),
	            new Reserva("Nerea Fernández", createDate(2024, 1, 10)),
	            new Reserva("Juan Manuel", createDate(2024, 2, 5)),
	            new Reserva("Esther Peña", createDate(2024, 3, 20)),
	            new Reserva("Francisco Javier", createDate(2024, 4, 15)),
	            new Reserva("Beatriz Navarro", createDate(2024, 5, 30)),
	            new Reserva("Vicente Cano", createDate(2024, 6, 10)),
	            new Reserva("Silvia Ruiz", createDate(2024, 7, 5)),
	            new Reserva("Raúl Castro", createDate(2024, 8, 25)),
	            new Reserva("Sandra Martínez", createDate(2024, 9, 15)),
	            new Reserva("Antonio Ruiz", createDate(2024, 10, 5)),
	            new Reserva("Patricia Díaz", createDate(2024, 11, 30)),
	            new Reserva("Francisco Ortega", createDate(2024, 12, 10)),
	            new Reserva("Alicia Mendoza", createDate(2024, 1, 25)),
	            new Reserva("José Luis López", createDate(2024, 2, 15)),
	            new Reserva("Cristina Morales", createDate(2024, 3, 30)),
	            new Reserva("Luis García", createDate(2024, 4, 5)),
	            new Reserva("María José", createDate(2024, 5, 20)),
	            new Reserva("Jorge Martínez", createDate(2024, 6, 15)),
	            new Reserva("Rosa López", createDate(2024, 7, 5)),
	            new Reserva("Eduardo Pérez", createDate(2024, 8, 30)),
	            new Reserva("Marina Rodríguez", createDate(2024, 9, 10)),
	            new Reserva("Ignacio Torres", createDate(2024, 10, 25)),
	            new Reserva("Lorena Martínez", createDate(2024, 11, 15)),
	            new Reserva("Adrián Morales", createDate(2024, 12, 5)),
	            new Reserva("Paula Sánchez", createDate(2024, 1, 20)),
	            new Reserva("Julián Romero", createDate(2024, 2, 10))
	        );
		
		return reservationsList;
	}
	
	
	/*
	 * This method uploaded a new date and return it
	 * */
	public Date createDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); 
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, 0); 
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        return (Date) calendar.getTime();
	}
}
