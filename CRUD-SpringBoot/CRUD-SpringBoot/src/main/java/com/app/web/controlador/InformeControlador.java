package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Informe;
import com.app.web.servicio.InformeServicio;

@Controller
public class InformeControlador {

	@Autowired
	private InformeServicio servicio;

	@GetMapping({ "/informes", "/" })
	public String listarInformes(Model modelo) {
		modelo.addAttribute("informes", servicio.listarTodosLosInformes());
		return "informes";
	}

	@GetMapping("/informes/nuevo")
	public String mostrarFormularioDeRegistrtarInformes(Model modelo) {
		Informe informe = new Informe();
		modelo.addAttribute("informe", informe);
		return "crear_informe";
	}

	@PostMapping("/informes")
	public String guardarInforme(@ModelAttribute("informe") Informe informe) {
		servicio.guardarInforme(informe);
		return "redirect:/informes";
	}

	@GetMapping("/informes/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("informes", servicio.obtenerInformePorId(id));
		return "editar_informe";
	}

	@PostMapping("/informes/{id}")
	public String actualizarInforme(@PathVariable Long id, @ModelAttribute("informes") Informe informe,
			Model modelo) {
		Informe informeExistente = servicio.obtenerInformePorId(id);
		informeExistente.setId(id);
		informeExistente.setTitulo(informe.getTitulo());
		informeExistente.setDescripcion(informe.getDescripcion());
		informeExistente.setFecha(informe.getFecha());

		servicio.actualizarInforme(informeExistente);
		return "redirect:/informes";
	}

	@GetMapping("/informes/{id}")
	public String eliminarInforme(@PathVariable Long id) {
		servicio.eliminarInforme(id);
		return "redirect:/informes";
	}
}
