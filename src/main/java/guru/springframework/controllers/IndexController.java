package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zawadma
 * @date 03/01/2021 18:44
 */
@Controller
public class IndexController {

	@RequestMapping({"/","/index.html","/index"})
	public String getIndex(){
		return "index";
	}
}
