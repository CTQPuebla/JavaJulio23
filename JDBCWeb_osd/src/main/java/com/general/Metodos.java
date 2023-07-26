package com.general;
//cuarto
import java.util.List;

import com.entity.Autos;

public interface Metodos {
	
	String guardar(Object ob);
	String actualizar(Object ob);
	Object buscar(int id);
	String eliminar(int id);
	List mostrar();
	

}
