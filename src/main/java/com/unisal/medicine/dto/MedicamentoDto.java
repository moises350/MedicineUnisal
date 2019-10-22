package com.unisal.medicine.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.unisal.medicine.model.Medicamento;

public class MedicamentoDto 
{
	
	private String principioAtivo;
	
	private String laboratorio;
	
	private String codigoGgrem;
	
	private String registro;
	
	private String ean1;
	
	private String produto;
	
	private String apresentacao;
	
	private String classeTerapeutica;
	
	private String tipoProduto;
	
	private String regimePreco;
	
	private String pfSImposto;
	
	private String tarja;
	
	public MedicamentoDto(Medicamento medicamento)
	{
		this.principioAtivo = medicamento.getPrincipioAtivo();
		this.laboratorio = medicamento.getLaboratorio();
		this.codigoGgrem = medicamento.getCodigoGgrem();
		this.registro = medicamento.getRegistro();
		this.ean1 = medicamento.getEan1();
		this.produto = medicamento.getProduto();
		this.apresentacao = medicamento.getApresentacao();
		this.classeTerapeutica = medicamento.getClasseTerapeutica();
		this.tipoProduto = medicamento.getTipoProduto();
		this.regimePreco = medicamento.getRegimePreco();
		this.pfSImposto = medicamento.getPfSImposto();
		this.tarja = medicamento.getTarja();
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
	
	public static List<MedicamentoDto> converter(List<Medicamento> medicamentos) {
		return medicamentos.stream().map(MedicamentoDto::new).collect(Collectors.toList());
	}

	
}
