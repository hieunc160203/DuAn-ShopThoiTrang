package com.tam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tam.dao.ProductDAO;
import com.tam.entity.Report;

@Controller
public class ReportController {
	//1. nhớ tiêm ProductDAO vào để gọi hàm
	@Autowired 
	ProductDAO dao;
	
	@RequestMapping("/report/inventory-by-category")
	public String inventory(Model model) {
		List<Report> items = dao.getInventoryByCategory();
		model.addAttribute("items", items);
		return "report/inventory-by-category";
	}

}
