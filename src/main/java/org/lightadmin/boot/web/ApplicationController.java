package org.lightadmin.boot.web;

import org.lightadmin.boot.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

    @Autowired
    private HotelRepository hotelRepository;

    @RequestMapping("/")
    public String thymeleafIndexPage(Model model) {
        model.addAttribute("hotels", hotelRepository.findAll());
        return "index";
    }
}