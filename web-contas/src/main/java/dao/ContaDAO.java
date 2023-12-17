package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.util.HibernateUtil;
import model.Conta;

public class ContaDAO {

	public List<Conta> getContas(){
		Transaction transaction = null;	
		List<Conta> contas = null;
		
		try(Session session = HibernateUtil.getSessao().openSession()){
			transaction = session.beginTransaction();
			
			contas = session.createQuery("FROM Conta c").list();
			
			transaction.commit();
			
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return contas;
	}
	
	
	
}
