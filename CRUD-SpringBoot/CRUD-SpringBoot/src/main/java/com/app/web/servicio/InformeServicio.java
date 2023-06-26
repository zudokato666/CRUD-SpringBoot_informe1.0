package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Informe;

public interface InformeServicio {

	public List<Informe> listarTodosLosInformes();
	
	public Informe guardarInforme(Informe informe);
	
	public Informe obtenerInformePorId(Long id);
	
	public Informe actualizarInforme(Informe informe);
	
	public void eliminarInforme(Long id);
}
