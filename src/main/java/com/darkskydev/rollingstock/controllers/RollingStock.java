package com.darkskydev.rollingstock.controllers;

import java.util.ArrayList;
import java.util.List;

import com.darkskydev.rollingstock.entities.RollingStockEntity;
import com.darkskydev.rollingstock.repositories.RollingStockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RollingStock {
    
	@Autowired
	private RollingStockRepository repository;
	
    @GetMapping("/rollingstock")
	public @ResponseBody String rollingstock(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

		List<RollingStockEntity> list = new ArrayList<>();
		var it = repository.findAll();
		it.forEach(list::add);

		String result = "";
		for (RollingStockEntity record : list) {
			System.out.println(record);
			result += ":"+record.getRoadNumber();
		}

        model.addAttribute("name", name);
		return result;
	}
}
