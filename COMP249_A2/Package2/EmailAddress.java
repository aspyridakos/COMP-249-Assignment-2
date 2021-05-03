// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the EmailAddress class which is a child of the Address class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package2;
import Package1.Address;

public class EmailAddress extends Address {
    private String userName;
    private String domainName;
    private String tld;

    /**Default Constructor */
    public EmailAddress() {
        userName = "user-name";
        domainName = "domain-name";
        tld = "com";
    }
    
    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     * @param userName String
     * @param domainName String
     * @param tld String
     */
    public EmailAddress(String validFrom, String validTo, String userName, String domainName, String tld) {
        super(validFrom, validTo);
        this.userName = userName;
        this.domainName = domainName;
        this.tld = tld;
    }

    /**
     * Copy Constructor
     * @param someEmail EmailAddress
     */
    public EmailAddress(EmailAddress someEmail) {
        this(someEmail.validFrom, someEmail.validTo, someEmail.userName, someEmail.domainName, someEmail.tld);
    }

    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {  //fix to correct formatting later
        return ("The EMAIL ADDRESS:\n" + userName + "@" + domainName + "." + tld + " is valid from " + validFrom + " to " + validTo);
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
            EmailAddress otherEmailAddress = (EmailAddress) otherObject;
            return (validTo.equals(otherEmailAddress.validTo) && validFrom.equals(otherEmailAddress.validFrom) && userName.equals(otherEmailAddress.userName) && domainName.equals(otherEmailAddress.domainName) && tld.equals(otherEmailAddress.tld));
        }
    }

    //Accessor and mutator methods

    /**
     * Sets userName to a new value
     * @param userName String
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * Sets domainName to a new value
     * @param domainName String
     */
    public void setDomainName(String domainName){
        this.domainName = domainName;
    }

    /**
     * Sets tld to a new value
     * @param tld String
     */
    public void setTld(String tld){
        this.tld = tld;
    }

    /**
     * Getter for userName
     * @return userName
     */
    public String getUserName(){
        return userName;
    }

    /**
     * Getter for domainName
     * @return domainName
     */
    public String getDomainName(){
        return domainName;
    }

    /**
     * Getter for tld
     * @return tld
     */
    public String getTld(){
        return tld;
    }
}