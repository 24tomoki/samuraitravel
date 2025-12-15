package com.example.samuraitravel.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "password"; // ログインに使いたいパスワード
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword); // これが新しいハッシュ値
		return "index";
	}

}
