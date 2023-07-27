package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.Productos;
import com.general.Metodos;

public class ProductosDAO implements Metodos {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Productos producto = null;
	@Override
	public String guardar(Object ob) {
		producto=(Productos)ob;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(producto);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Registro insertado");
			
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
			
		}
		em.close();
		return resultado;
	}
	@Override
	public String editar(Object ob) {
		producto=(Productos)ob;
		Productos productodb=em.find(Productos.class, producto.getProductoId());
		
		em.getTransaction().begin();
		String r= null;
		try {
			//productodb.setProductoId(productodb.getProductoId());
			productodb.setDeptoid(productodb.getDeptoid());
			productodb.setFechacad(productodb.getFechacad());
			productodb.setNombre(productodb.getNombre());
			productodb.setPreciocompra(productodb.getPreciocompra());
			productodb.setPrecioventa(productodb.getPrecioventa());
			productodb.setRefrigerado(productodb.getRefrigerado());
			
			em.merge(producto);
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r="1";
			
		}catch(Exception e) {
			em.getTransaction().rollback();
			
			System.out.println("No pudo insertarse");
			r = e.getMessage();
	}
		em.close();
		return r;
		
	

}
	@Override
	public String eliminar(int id) {
		String r= null;
		producto= em.find(Productos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r= "1";
			
		}catch(Exception e) {
			em.getTransaction().rollback();
			
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
	    }
		return r;
	
   }
	@Override
	public Object buscar(int id) {
		producto= em.find(Productos.class, id);
		return producto;
	}
	@Override
	public List mostrar() {
	 List <Productos> ls = em.createQuery("FROM Productos").getResultList();
	return ls;
	
     }
}	