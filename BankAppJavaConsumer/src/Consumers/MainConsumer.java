package Consumers;

import java.rmi.RemoteException;

import org.tempuri.CustomerWebServiceSoap;
import org.tempuri.CustomerWebServiceSoapProxy;
import org.tempuri.Customers;

public class MainConsumer {

	public static void main(String[] args) {
		// Create SOAP Client
		CustomerWebServiceSoap cws = new CustomerWebServiceSoapProxy();
		
		try {
			// Select Customer By Id
			Customers c = cws.selectCustomerById(1);
			
			// Print Customer informations to the console
			System.out.println("Müþteri Bilgileri: "+c.getCustomerName()+" "+c.getCustomerSurname());
			System.out.println("Bakiye: "+c.getBalance().toString()+" TL");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
