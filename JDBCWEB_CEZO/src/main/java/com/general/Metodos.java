package com.general;

import java.util.List;
import com.entity.Autos;

public interface Metodos {
	
//
//	String guardar(Autos auto);
//
//	String actualizar(Autos auto);
//
//	Autos buscar(int id);
//
//	String eliminar(int id);
//
//	List mostrar();
//	
	

	String guardar(Object ob);

	String actualizar(Object ob);

	Object buscar(int id);

	String eliminar(int id);

	List mostrar();
	
}
