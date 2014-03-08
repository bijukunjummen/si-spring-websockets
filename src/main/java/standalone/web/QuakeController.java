package standalone.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuakeController {

	@RequestMapping("/quakes")
	public String listQuakes() {
		return "quakes/list";
	}
}
