package com.example.documentprocessing.service;

public class ExcelDocumentServiceImpl extends DocumentServiceAB{
	
//This method comes from parent.
//	@Override
//	public void readDataFromDb() {
//		// TODO Auto-generated method stub
//		System.out.println("Read Data from DB");
//	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for Excel");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print Excel");
		return "excel";
	}

}
