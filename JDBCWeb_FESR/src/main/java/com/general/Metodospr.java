package com.general;

import java.util.List;

import com.entity.Autos;
import com.entity.Productos;

public interface Metodospr {

	String guardar(Productos producto);
	String actualizar(Productos producto);
	Productos buscar(int id);
	String eliminar(int id);
	List mostrar();
}
