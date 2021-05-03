// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the GeneralDeliveryAddress class which is a child of the Address class and inherits attributes from the TelecomAddress class in Package2.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */
package Package1;

public class Address {
    protected String validFrom;
    protected String validTo;

    /**Default Constructor*/
    public Address() {
        validFrom = "0000-00-00"; 
        validTo = "0000-00-00"; 
    }

    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     */
    public Address(String validFrom, String validTo) {
        // Assign earliest date to validFrom and furthese date to validTo
        if (checkValidDateOrder(validFrom, validTo)){
            this.validFrom = validFrom;
            this.validTo = validTo; 
        } 
        else {
            this.validFrom = validTo;
            this.validTo = validFrom; 
        }      
    }

    /**
     * Copy Constructor
     * @param someAddress Address
     */
    public Address(Address someAddress) {
        this(someAddress.validFrom, someAddress.validTo);
    }

    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return ("This address is valid from " + validFrom + " to " + validTo);
    } 
    
    /** Checks equality of objects
     * @param otherAddress of type Address
     * @return boolean
     */
    public boolean equals(Object otherObject) {

        if (otherObject == null){
            return false;
        }

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString();
        
        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Address otherAddress = (Address) otherObject; 
            return (validTo.equals(otherAddress.validTo) && validFrom.equals(otherAddress.validFrom));
        }
    }

    //Accessors and Mutators

    /** Getter for validFrom
     * @return String validFrom
     */
    public String getValidFrom(){
        return validFrom;
    }

    /**
     * Sets validFrom to a new value
     * @param validFrom String
     */
    public void setValidFrom(String validFrom){
        this.validFrom = validFrom;
    }
    
    /** Getter for validTo
     * @return String validTo
     */
    public String getValidTo(){
        return validTo;
    }

    /**
     * Sets validTo to a new value
     * @param validTo String
     */
    public void setValidTo(String validTo){
        this.validTo = validTo;
    }

    /**
     * Check if validFrom <= ValidTo
     * @param validFrom String
     * @param validTo String
     * @return boolean
     */
    public boolean checkValidDateOrder(String validFrom, String validTo){
        if (validFrom.compareTo(validTo)<=0){
            return true;
        } else {
            return false;
        }
    }
}
