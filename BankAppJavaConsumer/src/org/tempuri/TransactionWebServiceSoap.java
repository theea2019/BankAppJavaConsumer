/**
 * TransactionWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface TransactionWebServiceSoap extends java.rmi.Remote {
    public boolean deposit(int senderId, java.math.BigDecimal amount) throws java.rmi.RemoteException;
    public boolean withdraw(int senderId, java.math.BigDecimal amount) throws java.rmi.RemoteException;
    public boolean transfer(int senderId, int receiverId, java.math.BigDecimal amount) throws java.rmi.RemoteException;
}
