package org.lightadmin.boot.web;

import org.lightadmin.boot.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

	@Autowired
	private HotelRepository hotelRepository;

<<<<<<< HEAD
	@RequestMapping("/")
	public String thymeleafIndexPage(Model model) {
		model.addAttribute("hotels", hotelRepository.findAll());
		return "index";
	}
=======
    @RequestMapping("/")
    public String thymeleafIndexPage(Model model) {
        model.addAttribute("hotels", hotelRepository.findAll());
        return "index";
    }
>>>>>>> 3c1f5ad0329bb6bb62f6053a742209290d2f300d
}