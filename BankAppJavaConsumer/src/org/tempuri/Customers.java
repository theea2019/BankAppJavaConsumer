/**
 * Customers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Customers  implements java.io.Serializable {
    private int customerID;

    private java.lang.String customerName;

    private java.lang.String customerSurname;

    private java.lang.String customerPasskey;

    private java.math.BigDecimal balance;

    private org.apache.axis.types.UnsignedByte balanceType;

    private boolean isActive;

    private org.tempuri.Transactions[] transactions;

    public Customers() {
    }

    public Customers(
           int customerID,
           java.lang.String customerName,
           java.lang.String customerSurname,
           java.lang.String customerPasskey,
           java.math.BigDecimal balance,
           org.apache.axis.types.UnsignedByte balanceType,
           boolean isActive,
           org.tempuri.Transactions[] transactions) {
           this.customerID = customerID;
           this.customerName = customerName;
           this.customerSurname = customerSurname;
           this.customerPasskey = customerPasskey;
           this.balance = balance;
           this.balanceType = balanceType;
           this.isActive = isActive;
           this.transactions = transactions;
    }


    /**
     * Gets the customerID value for this Customers.
     * 
     * @return customerID
     */
    public int getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this Customers.
     * 
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the customerName value for this Customers.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this Customers.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerSurname value for this Customers.
     * 
     * @return customerSurname
     */
    public java.lang.String getCustomerSurname() {
        return customerSurname;
    }


    /**
     * Sets the customerSurname value for this Customers.
     * 
     * @param customerSurname
     */
    public void setCustomerSurname(java.lang.String customerSurname) {
        this.customerSurname = customerSurname;
    }


    /**
     * Gets the customerPasskey value for this Customers.
     * 
     * @return customerPasskey
     */
    public java.lang.String getCustomerPasskey() {
        return customerPasskey;
    }


    /**
     * Sets the customerPasskey value for this Customers.
     * 
     * @param customerPasskey
     */
    public void setCustomerPasskey(java.lang.String customerPasskey) {
        this.customerPasskey = customerPasskey;
    }


    /**
     * Gets the balance value for this Customers.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Customers.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the balanceType value for this Customers.
     * 
     * @return balanceType
     */
    public org.apache.axis.types.UnsignedByte getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this Customers.
     * 
     * @param balanceType
     */
    public void setBalanceType(org.apache.axis.types.UnsignedByte balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the isActive value for this Customers.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Customers.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the transactions value for this Customers.
     * 
     * @return transactions
     */
    public org.tempuri.Transactions[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this Customers.
     * 
     * @param transactions
     */
    public void setTransactions(org.tempuri.Transactions[] transactions) {
        this.transactions = transactions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customers)) return false;
        Customers other = (Customers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.customerID == other.getCustomerID() &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerSurname==null && other.getCustomerSurname()==null) || 
             (this.customerSurname!=null &&
              this.customerSurname.equals(other.getCustomerSurname()))) &&
            ((this.customerPasskey==null && other.getCustomerPasskey()==null) || 
             (this.customerPasskey!=null &&
              this.customerPasskey.equals(other.getCustomerPasskey()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.balanceType==null && other.getBalanceType()==null) || 
             (this.balanceType!=null &&
              this.balanceType.equals(other.getBalanceType()))) &&
            this.isActive == other.isIsActive() &&
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCustomerID();
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerSurname() != null) {
            _hashCode += getCustomerSurname().hashCode();
        }
        if (getCustomerPasskey() != null) {
            _hashCode += getCustomerPasskey().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBalanceType() != null) {
            _hashCode += getBalanceType().hashCode();
        }
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Customers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPasskey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerPasskey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BalanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Transactions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Transactions"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
