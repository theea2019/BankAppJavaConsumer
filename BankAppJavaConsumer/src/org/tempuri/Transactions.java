/**
 * Transactions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Transactions  implements java.io.Serializable {
    private int transactionID;

    private java.math.BigDecimal transactionAmount;

    private int transactorAccountNumber;

    private java.lang.Integer receiverAccountNumber;

    private java.util.Calendar transactionDate;

    private boolean isSuccess;

    private org.tempuri.Customers customer;

    public Transactions() {
    }

    public Transactions(
           int transactionID,
           java.math.BigDecimal transactionAmount,
           int transactorAccountNumber,
           java.lang.Integer receiverAccountNumber,
           java.util.Calendar transactionDate,
           boolean isSuccess,
           org.tempuri.Customers customer) {
           this.transactionID = transactionID;
           this.transactionAmount = transactionAmount;
           this.transactorAccountNumber = transactorAccountNumber;
           this.receiverAccountNumber = receiverAccountNumber;
           this.transactionDate = transactionDate;
           this.isSuccess = isSuccess;
           this.customer = customer;
    }


    /**
     * Gets the transactionID value for this Transactions.
     * 
     * @return transactionID
     */
    public int getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this Transactions.
     * 
     * @param transactionID
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the transactionAmount value for this Transactions.
     * 
     * @return transactionAmount
     */
    public java.math.BigDecimal getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this Transactions.
     * 
     * @param transactionAmount
     */
    public void setTransactionAmount(java.math.BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the transactorAccountNumber value for this Transactions.
     * 
     * @return transactorAccountNumber
     */
    public int getTransactorAccountNumber() {
        return transactorAccountNumber;
    }


    /**
     * Sets the transactorAccountNumber value for this Transactions.
     * 
     * @param transactorAccountNumber
     */
    public void setTransactorAccountNumber(int transactorAccountNumber) {
        this.transactorAccountNumber = transactorAccountNumber;
    }


    /**
     * Gets the receiverAccountNumber value for this Transactions.
     * 
     * @return receiverAccountNumber
     */
    public java.lang.Integer getReceiverAccountNumber() {
        return receiverAccountNumber;
    }


    /**
     * Sets the receiverAccountNumber value for this Transactions.
     * 
     * @param receiverAccountNumber
     */
    public void setReceiverAccountNumber(java.lang.Integer receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }


    /**
     * Gets the transactionDate value for this Transactions.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this Transactions.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the isSuccess value for this Transactions.
     * 
     * @return isSuccess
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }


    /**
     * Sets the isSuccess value for this Transactions.
     * 
     * @param isSuccess
     */
    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }


    /**
     * Gets the customer value for this Transactions.
     * 
     * @return customer
     */
    public org.tempuri.Customers getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Transactions.
     * 
     * @param customer
     */
    public void setCustomer(org.tempuri.Customers customer) {
        this.customer = customer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transactions)) return false;
        Transactions other = (Transactions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transactionID == other.getTransactionID() &&
            ((this.transactionAmount==null && other.getTransactionAmount()==null) || 
             (this.transactionAmount!=null &&
              this.transactionAmount.equals(other.getTransactionAmount()))) &&
            this.transactorAccountNumber == other.getTransactorAccountNumber() &&
            ((this.receiverAccountNumber==null && other.getReceiverAccountNumber()==null) || 
             (this.receiverAccountNumber!=null &&
              this.receiverAccountNumber.equals(other.getReceiverAccountNumber()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            this.isSuccess == other.isIsSuccess() &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer())));
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
        _hashCode += getTransactionID();
        if (getTransactionAmount() != null) {
            _hashCode += getTransactionAmount().hashCode();
        }
        _hashCode += getTransactorAccountNumber();
        if (getReceiverAccountNumber() != null) {
            _hashCode += getReceiverAccountNumber().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        _hashCode += (isIsSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transactions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Transactions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TransactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactorAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TransactorAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiverAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Customers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
