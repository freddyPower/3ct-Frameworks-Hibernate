package com.tresc.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tresct.dto.Tramite;
import com.tresct.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		
		// Crear una instancia de Tramite
		Tramite tramite = new Tramite("Credito aprobado", new Timestamp(date.getTime()));
		
		// Salvar el tramite 
		session.save(tramite);	// insert into Tramite (tipoTram, fhcTram) values (?, ?)
		
		//update
		//delete
		//lista
		
		session.getTransaction().commit();
		session.close();

	}

}
