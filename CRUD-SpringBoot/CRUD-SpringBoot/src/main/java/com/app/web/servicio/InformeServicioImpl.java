package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Informe;
import com.app.web.repositorio.InformeRepositorio;

@Service
public class InformeServicioImpl implements InformeServicio {

	@Autowired
	private InformeRepositorio repositorio;

	@Override
	public List<Informe> listarTodosLosInformes() {
		return repositorio.findAll();
	}

	@Override
	public Informe guardarInforme(Informe informe) {
		return repositorio.save(informe);
	}

	@Override
	public Informe obtenerInformePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Informe actualizarInforme(Informe informe) {
		return repositorio.save(informe);
	}

	@Override
	public void eliminarInforme(Long id) {
		repositorio.deleteById(id);

	}

}
