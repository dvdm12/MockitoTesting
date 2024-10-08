package main.java.com.service;


import java.util.List;

import main.java.com.model.Producto;
import main.java.com.repository.ProductoRepository;

public class ProductoService {
	private ProductoRepository pRepository;
	
	public ProductoService(ProductoRepository pRepository) {
		this.pRepository = pRepository;
	}
	
	public List<Producto> getAll(){
		return pRepository.getAllProducts();
	}
	
	public Producto getOnlyProduct(String name) {
		return getAll().stream().filter(producto -> producto.getNombre().equals(name)).findFirst().orElse(null);
	}
	
	public double calcTotalValueOfProducts() {
		return getAll().stream().mapToDouble(Producto::getPrecio).sum();
	}
}
