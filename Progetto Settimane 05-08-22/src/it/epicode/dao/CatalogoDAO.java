package it.epicode.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.epicode.Program;
import it.epicode.entities.library.Elemento;
import it.epicode.entities.library.Libro;
import it.epicode.utils.JpaUtil;
//gestione del catalogo
public class CatalogoDAO {
	private static final Logger log = LoggerFactory.getLogger(Program.class);
	EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	//aggiunta elemento
	public void aggiuntaDiUnElementoDelCatalogo(Elemento elemento) {
		var em = emf.createEntityManager();

		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(elemento);
			transaction.commit();
		} catch (Exception e) {
			log.error("Error");
		} finally {
			em.close();
		}
	}
	//rimozione elemento
	public void rimozioneDiUnElementoDelCatalogoDatoUnCodiceISBN(String Isbn) {
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Elemento i = em.find(Elemento.class, Isbn);
			em.remove(i);
			transaction.commit();

		} catch (Exception e) {
			log.error("Error");
		} finally {
			em.close();
		}

	}
	//ricerca per isbn
	public Elemento ricercaPerISBN(String Isbn) {
		var em = emf.createEntityManager();
		try {
			var query = em.createNamedQuery(Elemento.QUERY_SELECT_RICERCA_ISBN, Elemento.class);
			query.setParameter("isbn", Isbn);
			Elemento el = query.getSingleResult();
			return el;
		} catch (Exception e) {
			log.error("Error");
			return null;
		} finally {
			em.close();
		}
	}
	//ricerca per anno
	public List<Elemento> ricercaPerAnno(String anno) {
		var em = emf.createEntityManager();
		try {
			var query = em.createNamedQuery(Elemento.QUERY_SELECT_RICERCA_ANNO, Elemento.class);
			query.setParameter("anno", anno);
			List<Elemento> lis = query.getResultList();
			return lis;
		} catch (Exception e) {
			log.error("Error");
			return new ArrayList<Elemento>();
		} finally {
			em.close();
		}
	}
	//ricerca per autore
	public List<Libro> ricercaPerAutore(String autore){
		var em = emf.createEntityManager();
		try {
			var query = em.createNamedQuery(Libro.QUERY_SELECT_RICERCA_AUTORE, Libro.class);
			query.setParameter("autore", autore);
			List<Libro> lis = query.getResultList();
			return lis;
		} catch (Exception e) {
			log.error("Error");
			return new ArrayList<Libro>();
		} finally {
			em.close();
		}
	}
	//ricerca per titolo
	public List<Elemento> ricercaPerTitolo(String titolo){
		var em = emf.createEntityManager();
		try {
			var query = em.createNamedQuery(Elemento.QUERY_SELECT_RICERCA_TITOLO, Elemento.class);
			query.setParameter("titolo", "%"+titolo+"%");
			List<Elemento> lis = query.getResultList();
			return lis;
		} catch (Exception e) {
			log.error("Error");
			return new ArrayList<Elemento>();
		} finally {
			em.close();
		}
	}

}
