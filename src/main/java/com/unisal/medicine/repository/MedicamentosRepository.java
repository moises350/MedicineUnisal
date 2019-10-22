package com.unisal.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisal.medicine.model.Medicamento;

public interface MedicamentosRepository extends JpaRepository<Medicamento, Long>
{
	
}
