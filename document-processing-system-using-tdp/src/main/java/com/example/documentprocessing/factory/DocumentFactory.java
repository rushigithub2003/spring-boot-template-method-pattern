package com.example.documentprocessing.factory;

import com.example.documentprocessing.service.DocumentService;
import com.example.documentprocessing.service.ExcelDocumentServiceImpl;
import com.example.documentprocessing.service.PdfDocumentServiceImpl;
import com.example.documentprocessing.service.WordDocumentServiceImpl;

public class DocumentFactory {

	public static DocumentService getObject(String type) {
		
		if (type.equals("pdf"))
			return new PdfDocumentServiceImpl();

		if (type.equals("excel"))
			return new ExcelDocumentServiceImpl();

		if (type.equals("word"))
			return new WordDocumentServiceImpl();

		return null;
	}

}
