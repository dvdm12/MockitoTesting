package main.java.com.repository;

import java.util.Arrays;
import java.util.List;

import main.java.com.model.Producto;

public class ProductoRepository {
	
	public List<Producto>getAllProducts(){
		List<Producto> listProductsList = Arrays.asList(
			    new Producto("Tornillo Drywall", 5000),
			    new Producto("Clavo Galvanizado", 1200),
			    new Producto("Cinta Aislante", 3500),
			    new Producto("Destornillador Plano", 7500),
			    new Producto("Llave Inglesa", 15000),
			    new Producto("Taladro Inalámbrico", 120000),
			    new Producto("Martillo de Uña", 18000),
			    new Producto("Sierra Caladora", 85000),
			    new Producto("Broca para Madera", 4500),
			    new Producto("Broca para Concreto", 6000),
			    new Producto("Tornillo para Madera", 1000),
			    new Producto("Clavo de Acero", 1400),
			    new Producto("Llave Allen", 3000),
			    new Producto("Caja de Herramientas", 95000),
			    new Producto("Cutter Profesional", 5500),
			    new Producto("Llave de Carraca", 17000),
			    new Producto("Lijadora Eléctrica", 75000),
			    new Producto("Soplete de Gas", 22000),
			    new Producto("Nivel de Burbuja", 6000),
			    new Producto("Flexómetro 5m", 8000),
			    new Producto("Cinta Métrica", 4500),
			    new Producto("Escuadra de Carpintero", 5000),
			    new Producto("Tubo PVC 1/2 pulgada", 12000),
			    new Producto("Tubería de Cobre", 18000),
			    new Producto("Tubería Galvanizada", 22000),
			    new Producto("Pegamento para PVC", 7000),
			    new Producto("Llave Stilson", 20000),
			    new Producto("Serrucho de Mano", 9000),
			    new Producto("Esmeril Angular", 130000),
			    new Producto("Cinta para Ductos", 3000),
			    new Producto("Guantes de Trabajo", 4500),
			    new Producto("Mascarilla Desechable", 800),
			    new Producto("Gafas de Protección", 2500),
			    new Producto("Pistola de Silicona", 8500),
			    new Producto("Silicona Transparente", 12000),
			    new Producto("Llave de Impacto", 180000),
			    new Producto("Cinta de Enmascarar", 2500),
			    new Producto("Rodillo para Pintura", 7000),
			    new Producto("Brocha para Pintura", 4000),
			    new Producto("Compresor de Aire", 240000),
			    new Producto("Pistola para Pintar", 180000)
			);
		
		return listProductsList;
	}
}
