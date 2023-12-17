package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conta")
public class Conta {
	
	@Id     												 		// Definir primary kay no banco (Não deixa duplicar)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="data_recebida")
	private String dataRecebida;
	
	@Column(name="data_vencimento")
	private String dataVencimento;	
	
	@Column(name="data_pagamento")
	private String dataPagamento;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataRecebida() {
		return dataRecebida;
	}

	public void setDataRecebida(String dataRecebida) {
		this.dataRecebida = dataRecebida;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
