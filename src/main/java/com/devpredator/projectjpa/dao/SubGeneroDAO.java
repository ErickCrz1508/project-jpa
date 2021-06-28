/**
 * 
 */
package com.devpredator.projectjpa.dao;

import java.util.List;

import com.devpredator.projectjpa.entity.SubGenero;

/**
 * @author Erick Michel Cruz Ceron
 *Interfaz que realiza el CRUD con JPA para la tabla de subgenero
 */
public interface SubGeneroDAO {
	/**
	 * Metodo que nos permite guardar un subgenero.
	 * @param disquera{@link SubGenero} objeto a guardar.
	 */
	void guardar(SubGenero subGenero);
	
	/**
	 * Metodo que permite actualizar registros de subgenero.
	 * @param disquera {@link SubGenero} objeto a actualizar.
	 */
	void actualizar(SubGenero subGenero);
	
	/**
	 * Metodo que permite eliminar un registro de subgenero por su identificador.
	 * @param id {@link Long} identificador del subgenero a eliminar.
	 */
	void eliminar(Long id);
	
	/**
	 * Metodo que permite consultar la lista de subgeneros.
	 * @return {@link List} Lista de subgeneros consultados.
	 */
	List<SubGenero> consultar();
	
	/**
	 * Metodo que permite consultar un subgenero a partir de su identificador.
	 * @param id {@link Long} identificador del subgenero a conultar.
	 * @return {@link SubGenero} Subgenero consultado.
	 */
	SubGenero consultarById(Long id);
	
}
