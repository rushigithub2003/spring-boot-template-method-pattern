package com.example.documentprocessing.service;

public abstract class DocumentServiceAB implements DocumentService {

	@Override
	public void readDataFromDb() {
		// TODO Auto-generated method stub
		System.out.println("Read Data From Db");
	}
	
//	This both methods present in the class.  it comes from documentService and by default this are public abstract.
	
//	public abstract void processData();
//	public abstract String printData();


}
