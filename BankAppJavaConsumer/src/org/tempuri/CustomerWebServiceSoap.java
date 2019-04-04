/**
 * CustomerWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CustomerWebServiceSoap extends java.rmi.Remote {
    public boolean insertCustomer(org.tempuri.Customers entity) throws java.rmi.RemoteException;
    public boolean updateCustomer(org.tempuri.Customers entity) throws java.rmi.RemoteException;
    public boolean deleteCustomer(int id) throws java.rmi.RemoteException;
    public org.tempuri.Customers[] selectAllCustomers() throws java.rmi.RemoteException;
    public org.tempuri.Customers selectCustomerById(int id) throws java.rmi.RemoteException;
}
