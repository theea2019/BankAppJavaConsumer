package org.tempuri;

public class TransactionWebServiceSoapProxy implements org.tempuri.TransactionWebServiceSoap {
  private String _endpoint = null;
  private org.tempuri.TransactionWebServiceSoap transactionWebServiceSoap = null;
  
  public TransactionWebServiceSoapProxy() {
    _initTransactionWebServiceSoapProxy();
  }
  
  public TransactionWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransactionWebServiceSoapProxy();
  }
  
  private void _initTransactionWebServiceSoapProxy() {
    try {
      transactionWebServiceSoap = (new org.tempuri.TransactionWebServiceLocator()).getTransactionWebServiceSoap();
      if (transactionWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transactionWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transactionWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transactionWebServiceSoap != null)
      ((javax.xml.rpc.Stub)transactionWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.TransactionWebServiceSoap getTransactionWebServiceSoap() {
    if (transactionWebServiceSoap == null)
      _initTransactionWebServiceSoapProxy();
    return transactionWebServiceSoap;
  }
  
  public boolean deposit(int senderId, java.math.BigDecimal amount) throws java.rmi.RemoteException{
    if (transactionWebServiceSoap == null)
      _initTransactionWebServiceSoapProxy();
    return transactionWebServiceSoap.deposit(senderId, amount);
  }
  
  public boolean withdraw(int senderId, java.math.BigDecimal amount) throws java.rmi.RemoteException{
    if (transactionWebServiceSoap == null)
      _initTransactionWebServiceSoapProxy();
    return transactionWebServiceSoap.withdraw(senderId, amount);
  }
  
  public boolean transfer(int senderId, int receiverId, java.math.BigDecimal amount) throws java.rmi.RemoteException{
    if (transactionWebServiceSoap == null)
      _initTransactionWebServiceSoapProxy();
    return transactionWebServiceSoap.transfer(senderId, receiverId, amount);
  }
  
  
}