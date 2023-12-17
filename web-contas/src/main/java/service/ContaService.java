package service;

import java.util.List;

import dao.ContaDAO;
import hibernate.util.HibernateUtil;
import model.Conta;

public class ContaService {
	private ContaDAO contaDAO = new ContaDAO();
	
	public List<Conta> getContas() {
		return contaDAO.getContas();
	}
}
