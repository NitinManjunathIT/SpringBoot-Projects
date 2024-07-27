package in.pwskills.nitin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.pwskills.nitin.bean.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	/**
	 * 1. METHOD TYPE :: GET 
	 * 2. PATH :: /user/info 
	 * 3. ViewName :: UserHome
	 */
	@GetMapping(value = "/info")
	public String showUserPage(Model model) {

		model.addAttribute("NAME", "sachin");
		model.addAttribute("IPLTEAM", "MI");

		return "UserHome";
	}

	/**
	 * 1. METHOD TYPE  :: GET 
	 * 2. PATH         :: /user/obj
	 * 3. ViewName     :: UserData
	 * @param  : Model
	 * @return : String
	 */

	@GetMapping("/obj")
	public String showUserObject(
			Model model//sending from controller to view
		) {

		User user = new User(7, "dhoni", "captain");
		model.addAttribute("obj", user);
		
		
		List<User> objects = List.of(
					new User(18, "kohli", "batsman"), 
					new User(45,"rohith","batsman"), 
					new User(21,"bumrah","bowler")
				);
		
		model.addAttribute("objList",objects);

		return "UserData";
	}

}
