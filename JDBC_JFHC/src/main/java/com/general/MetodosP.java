package com.general;

import java.util.List;

import com.entity.Productos;

public interface MetodosP {
	
	String guardar(Productos producto);
	String actualizar(Productos producto);
	Productos buscar(int id);
	String eliminar (int id);
	List mostrar();


}
