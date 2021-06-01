/**
 * 
 */
package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chandan
 *
 */
@RestController
@RequestMapping("/users")
public class UserSecurityController {

	@GetMapping("/test")
	public String check() {
		return "working";
	}
}
