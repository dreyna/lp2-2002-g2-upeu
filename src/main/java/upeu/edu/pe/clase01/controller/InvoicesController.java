package upeu.edu.pe.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.clase01.entity.Invoices;
import upeu.edu.pe.clase01.service.InvoicesService;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {
	@Autowired
	private InvoicesService invoicesService;

	@GetMapping("/all")
	public List<Invoices> all(){
		return invoicesService.readAll();
	}
}
