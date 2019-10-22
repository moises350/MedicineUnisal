package com.unisal.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisal.medicine.dto.MedicamentoDto;
import com.unisal.medicine.model.Medicamento;
import com.unisal.medicine.repository.MedicamentosRepository;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentosController 
{
	
	@Autowired
	MedicamentosRepository medicamentosRepository;
	
	@GetMapping
	public List<MedicamentoDto> listarTudo()
	{
		List<Medicamento> medicamentos = medicamentosRepository.findAll();
		
		return MedicamentoDto.converter(medicamentos);
	}

}
