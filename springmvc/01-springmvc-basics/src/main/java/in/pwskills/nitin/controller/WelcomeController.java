package in.pwskills.nitin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //@Component + HTTP METHODS(GET/POST)
public class WelcomeController {
	
	static {
		System.out.println("WelcomeController.class file is loading...()");
	}
	
	public WelcomeController() {
		System.out.println("WelcomeController:: Zero param constructor...");
	}

	/**
	 * 1. REQUEST TYPE :: GET/POST
	 * 2. PATH         :: URL
	 * 3. MODEL   	   :: Sending the data from Controller to View
	 * 4. R.T          :: ViewName(with no technology details)
	 * 
	 */
	//@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping(value="/")
	public String welcomeMsg(Model model) {
		System.out.println("Implementation class is :: "+model.getClass().getName());
		System.out.println("RQ :: WelcomeController.welcomeMsg()");
		
		model.addAttribute("BRAND", "PWSKILLS");
		
		return "welcomepage";
	}
}
