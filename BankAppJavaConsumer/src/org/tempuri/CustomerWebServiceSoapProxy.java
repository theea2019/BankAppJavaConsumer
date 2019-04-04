package org.tempuri;

public class CustomerWebServiceSoapProxy implements org.tempuri.CustomerWebServiceSoap {
  private String _endpoint = null;
  private org.tempuri.CustomerWebServiceSoap customerWebServiceSoap = null;
  
  public CustomerWebServiceSoapProxy() {
    _initCustomerWebServiceSoapProxy();
  }
  
  public CustomerWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerWebServiceSoapProxy();
  }
  
  private void _initCustomerWebServiceSoapProxy() {
    try {
      customerWebServiceSoap = (new org.tempuri.CustomerWebServiceLocator()).getCustomerWebServiceSoap();
      if (customerWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerWebServiceSoap != null)
      ((javax.xml.rpc.Stub)customerWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CustomerWebServiceSoap getCustomerWebServiceSoap() {
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap;
  }
  
  public boolean insertCustomer(org.tempuri.Customers entity) throws java.rmi.RemoteException{
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap.insertCustomer(entity);
  }
  
  public boolean updateCustomer(org.tempuri.Customers entity) throws java.rmi.RemoteException{
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap.updateCustomer(entity);
  }
  
  public boolean deleteCustomer(int id) throws java.rmi.RemoteException{
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap.deleteCustomer(id);
  }
  
  public org.tempuri.Customers[] selectAllCustomers() throws java.rmi.RemoteException{
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap.selectAllCustomers();
  }
  
  public org.tempuri.Customers selectCustomerById(int id) throws java.rmi.RemoteException{
    if (customerWebServiceSoap == null)
      _initCustomerWebServiceSoapProxy();
    return customerWebServiceSoap.selectCustomerById(id);
  }
  
  
}