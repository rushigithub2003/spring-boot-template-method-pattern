package com.example.documentprocessing.service;

public class PdfDocumentServiceImpl extends DocumentServiceAB {

	//this method comes from parent.
//	@Override
//	public void readDataFromDb() {
//		// TODO Auto-generated method stub
//		System.out.println("Read data from Db");
//	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for pdf");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print pdf");
		return "pdf";
	}

}
