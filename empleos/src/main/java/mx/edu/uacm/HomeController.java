package mx.edu.uacm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String mostrarHome() {
		
		return "home"; //Nombre de la vista que es de tipo html, gracias al uso de Thymeleaf
		
	}

}
