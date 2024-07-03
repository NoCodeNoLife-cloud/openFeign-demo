package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is the controller for handling HTTP requests.
 */
@Slf4j
@Controller
public class HttpController {
	/**
	 * This method handles the HTTP request and returns a ResponseEntity with a status and an information body.
	 * @return The ResponseEntity with the status and body.
	 */
	@RequestMapping("/say")
	@ResponseBody
	public String say() {
		// Create a ResponseEntity with the status and body
		return "hello world";
	}
}