package main.java.com.service;

import java.util.List;
import java.util.stream.Collectors;

import main.java.com.model.Reserva;
import main.java.com.repository.ReservaRepository;

public class ReservaService {

	private ReservaRepository reservaRepository;

	public ReservaService(ReservaRepository reservaRepository) {
		this.reservaRepository = reservaRepository;
	}

	public ReservaRepository getReservaRepository() {
		return reservaRepository;
	}

	public void setReservaRepository(ReservaRepository reservaRepository) {
		this.reservaRepository = reservaRepository;
	}
	
	
	public List<Reserva> getReservationByClient(String name){
		return reservaRepository.findAll().stream()
				.filter(reservation-> reservation.getCliente().equals(name))
				.collect(Collectors.toList());
	}
	
	
	
}
