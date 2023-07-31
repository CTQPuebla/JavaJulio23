package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Productos;
import com.general.Metodos;

public class ProductosDAO implements Metodos {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	EntityManager em = emf.createEntityManager();
	Productos productos = null;
	
	@Override
	public String guardar(Object ob) {
		// TODO Auto-generated method stub
		productos = (Productos) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(productos);
			em.getTransaction().commit();
			resultado = "1";
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
		// TODO Auto-generated method stub
		productos = (Productos) ob;
		Productos productodb = em.find(Productos.class, productos.getProductoId());
		String r = null;
		em.getTransaction().begin();
		try {
			productodb.setDepto_id(productodb.getDepto_id());
			productodb.setNombre(productodb.getNombre());
			productodb.setFecha_cad(productodb.getFecha_cad());
			productodb.setPrecio_compra(productodb.getPrecio_compra());
			productodb.setPrecio_venta(productodb.getPrecio_venta());
			productodb.setRefrigerado(productodb.getRefrigerado());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r="1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		String r = null;
		productos = em.find(Productos.class, id );
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
			System.out.println("Se he eliminad el registro ");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		productos = em.find(Productos.class, id );
		return productos;
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		List<Productos> ls = em.createQuery("from Productos").getResultList();
		return ls;
	}

}
