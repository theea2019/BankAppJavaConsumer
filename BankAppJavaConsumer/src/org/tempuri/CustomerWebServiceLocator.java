/**
 * CustomerWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CustomerWebServiceLocator extends org.apache.axis.client.Service implements org.tempuri.CustomerWebService {

    public CustomerWebServiceLocator() {
    }


    public CustomerWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerWebServiceSoap
    private java.lang.String CustomerWebServiceSoap_address = "http://localhost:59274/CustomerWebService.asmx";

    public java.lang.String getCustomerWebServiceSoapAddress() {
        return CustomerWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerWebServiceSoapWSDDServiceName = "CustomerWebServiceSoap";

    public java.lang.String getCustomerWebServiceSoapWSDDServiceName() {
        return CustomerWebServiceSoapWSDDServiceName;
    }

    public void setCustomerWebServiceSoapWSDDServiceName(java.lang.String name) {
        CustomerWebServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.CustomerWebServiceSoap getCustomerWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerWebServiceSoap(endpoint);
    }

    public org.tempuri.CustomerWebServiceSoap getCustomerWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.CustomerWebServiceSoapStub _stub = new org.tempuri.CustomerWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getCustomerWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerWebServiceSoapEndpointAddress(java.lang.String address) {
        CustomerWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.CustomerWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.CustomerWebServiceSoapStub _stub = new org.tempuri.CustomerWebServiceSoapStub(new java.net.URL(CustomerWebServiceSoap_address), this);
                _stub.setPortName(getCustomerWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerWebServiceSoap".equals(inputPortName)) {
            return getCustomerWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CustomerWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerWebServiceSoap".equals(portName)) {
            setCustomerWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
