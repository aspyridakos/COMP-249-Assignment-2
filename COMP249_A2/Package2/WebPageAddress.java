// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the WebPageAddress class which is a child of the Address class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package2;
import Package1.Address;

public class WebPageAddress extends Address{
    private String domainName;
    private String resourceName;

    /**Default Constructor*/
    public WebPageAddress(){
        domainName = "domain-name";
        resourceName = "";
    }

    /**
     * Parametrized Constructor (without date)
     * @param domainName String
     * @param resourceName String
     */
    public WebPageAddress(String domainName, String resourceName){
        domainNameMandatory(domainName);
        this.resourceName = resourceName; 
    }    

    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     * @param domainName String
     * @param resourceName String
     */
    public WebPageAddress(String validFrom, String validTo, String domainName, String resourceName){
        super(validFrom, validTo);
        domainNameMandatory(domainName);
        this.resourceName = resourceName;
    }  

    /**
     * Copy Constructor
     * @param otherWebPageAddress WebPageAddress
     */
    public WebPageAddress(WebPageAddress otherWebPageAddress){
        this(otherWebPageAddress.validFrom, otherWebPageAddress.validTo, otherWebPageAddress.domainName, otherWebPageAddress.resourceName);
    }
    
    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return ("The WEB PAGE ADDRESS:\nwww." + domainName + "/" + resourceName + " is valid from " + validFrom + " to " + validTo);
    }
    
    /** Checks equality of objects
     * @param otherObject of type Address
     * @return boolean
     */
    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;

        else {
            WebPageAddress otherWebPageAddress = (WebPageAddress) otherObject;
            return (validTo.equals(otherWebPageAddress.validTo) && validFrom.equals(otherWebPageAddress.validFrom) && domainName.equals(otherWebPageAddress.domainName) && resourceName.equals(otherWebPageAddress.resourceName));
        }
    }

    /**
     * Verifies if domainName exists
     * @param domainName String
     */
    public void domainNameMandatory(String domainName){
        if (domainName.isEmpty()){
            this.domainName = "unknown-domain-name";
        } 
        else {
            this.domainName = domainName;
        }
    }

    //Accessors and Mutators

    /**
     * Getter for domainName
     * @return domainName
     */
    public String getDomainName(){
        return domainName;
    }

    /**
     * Getter for resourceName
     * @return resourceName
     */
    public String getResourceName(){
        return resourceName;
    }

    /**
     * Getter for validTo
     * @return validTo
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Getter for validFrom
     * @return validFrom
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets domainName to a new value
     * @param domainName String
     */
    public void setDomainName(String domainName){
        this.domainName = domainName;
    }

    /**
     * Sets resourceName to a new value
     * @param resourceName String
     */
    public void setResourceName(String resourceName){
        this.resourceName = resourceName;
    }

    /**
     * Sets validTo to a new value
     * @param validTo String
     */
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * Sets validFrom to a new value
     * @param validFrom String
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
}
