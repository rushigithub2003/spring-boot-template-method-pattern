package com.example.documentprocessing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.documentprocessing.factory.DocumentFactory;
import com.example.documentprocessing.service.DocumentService;

//This project Demonstrating Template Design Pattern.

@RestController
public class DocumentController {

	@GetMapping("print/{type}")
	String printInvoice(@PathVariable String type) {

		DocumentService ds = DocumentFactory.getObject(type);

		ds.readDataFromDb();
		ds.processData();
		return ds.printData();

	}
}
