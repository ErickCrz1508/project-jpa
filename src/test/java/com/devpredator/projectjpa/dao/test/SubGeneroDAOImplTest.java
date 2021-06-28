/**
 * 
 */
package com.devpredator.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.projectjpa.dao.SubGeneroDAO;
import com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl;
import com.devpredator.projectjpa.entity.Genero;
import com.devpredator.projectjpa.entity.SubGenero;

/**
 * @author Erick Michel Cruz Ceron.
 *Clase test para comprobar el funcionamiento de los metodos del CRUD de SubGenero.
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subgeneroDAO = new SubGeneroDAOImpl();
	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.devpredator.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		subGenero.setGenero(genero);
		
		this.subgeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.devpredator.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
	SubGenero subgeneroConsultado =	this.subgeneroDAO.consultarById(7L);
	
	subgeneroConsultado.setDescripcion("Trash Metal");
	subgeneroConsultado.getGenero().setDescripcion("Metal Trash");
	this.subgeneroDAO.actualizar(subgeneroConsultado);
		
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subgeneroDAO.eliminar(7L);
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subgenerosConsultados = this.subgeneroDAO.consultar();
		assertTrue(subgenerosConsultados.size() > 0);
		for (SubGenero subGenero : subgenerosConsultados) {
			System.out.println("SubGenero: "+ subGenero.getDescripcion());
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
			
		}
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
