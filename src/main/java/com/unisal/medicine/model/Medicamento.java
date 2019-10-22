package com.unisal.medicine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "PRINCIPIO_ATIVO")
	private String principioAtivo;
	
	@Column(name = "LABORATORIO")
	private String laboratorio;
	
	@Column(name = "CODIGO_GGREM")
	private String codigoGgrem;
	
	@Column(name = "REGISTRO")
	private String registro;
	
	@Column(name = "EAN_1")
	private String ean1;
	
	@Column(name = "PRODUTO")
	private String produto;
	
	@Column(name = "APRESENTACAO")
	private String apresentacao;
	
	@Column(name = "CLASSE_TERAPEUTICA")
	private String classeTerapeutica;
	
	@Column(name = "TIPO_PRODUTO")
	private String tipoProduto;
	
	@Column(name = "REGIME_PRECO")
	private String regimePreco;
	
	@Column(name = "PF_S_IMPOSTO")
	private String pfSImposto;
	
	@Column(name = "TARJA")
	private String tarja;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getCodigoGgrem() {
		return codigoGgrem;
	}
	public void setCodigoGgrem(String codigoGgrem) {
		this.codigoGgrem = codigoGgrem;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getEan1() {
		return ean1;
	}
	public void setEan1(String ean1) {
		this.ean1 = ean1;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getApresentacao() {
		return apresentacao;
	}
	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}
	public String getClasseTerapeutica() {
		return classeTerapeutica;
	}
	public void setClasseTerapeutica(String classeTerapeutica) {
		this.classeTerapeutica = classeTerapeutica;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getRegimePreco() {
		return regimePreco;
	}
	public void setRegimePreco(String regimePreco) {
		this.regimePreco = regimePreco;
	}
	public String getPfSImposto() {
		return pfSImposto;
	}
	public void setPfSImposto(String pfSImposto) {
		this.pfSImposto = pfSImposto;
	}
	public String getTarja() {
		return tarja;
	}
	public void setTarja(String tarja) {
		this.tarja = tarja;
	}
	
	
	
}
