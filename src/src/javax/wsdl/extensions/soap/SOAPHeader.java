/*
 * (c) Copyright IBM Corp 2001, 2005 
 */

package javax.wsdl.extensions.soap;

import java.util.*;
import javax.wsdl.extensions.*;
import javax.xml.namespace.*;

/**
 * @author Matthew J. Duftler (duftler@us.ibm.com)
 */
public interface SOAPHeader extends ExtensibilityElement, java.io.Serializable
{
  /**
   * Set the message for this SOAP header.
   *
   * @param message the desired message
   */
  public void setMessage(QName message);

  /**
   * Get the message for this SOAP header.
   */
  public QName getMessage();

  /**
   * Set the part for this SOAP header.
   *
   * @param part the desired part
   */
  public void setPart(String part);

  /**
   * Get the part for this SOAP header.
   */
  public String getPart();

  /**
   * Set the use for this SOAP header.
   *
   * @param use the desired use
   */
  public void setUse(String use);

  /**
   * Get the use for this SOAP header.
   */
  public String getUse();

  /**
   * Set the encodingStyles for this SOAP header.
   *
   * @param encodingStyles the desired encodingStyles
   */
  public void setEncodingStyles(List encodingStyles);

  /**
   * Get the encodingStyles for this SOAP header.
   */
  public List getEncodingStyles();

  /**
   * Set the namespace URI for this SOAP header.
   *
   * @param namespaceURI the desired namespace URI
   */
  public void setNamespaceURI(String namespaceURI);

  /**
   * Get the namespace URI for this SOAP header.
   */
  public String getNamespaceURI();

  public void addSOAPHeaderFault(SOAPHeaderFault soapHeaderFault);

  public List getSOAPHeaderFaults();
}