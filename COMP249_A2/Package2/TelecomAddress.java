// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the TelecomAddress class which is a child of the Address class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package2;
import Package1.Address;

public class TelecomAddress extends Address {
    private int countryCode;
    private String nationalDialingPrefix;
    private int areaCode;
    private long number;
    private int extension;
    private String physicalType;

    /**Default Constructor*/
    public TelecomAddress() {
        countryCode = 0;
        nationalDialingPrefix = "(0)";
        areaCode = 0;
        number = 00000000;
        extension = 000;
        physicalType = "type-unknown";
    }

    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     * @param countryCode int
     * @param nationalDialingPrefix String
     * @param areaCode int
     * @param number long
     * @param extension int
     * @param physicalType String
     */
    public TelecomAddress(String validFrom, String validTo, int countryCode, String nationalDialingPrefix, int areaCode, long number, int extension, String physicalType) {
        super(validFrom, validTo);
        this.countryCode =  countryCode;
        this.nationalDialingPrefix = nationalDialingPrefix;
        this.areaCode = areaCode;
        this.number = number;
        this.extension =  extension;
        this.physicalType = physicalType;
    }

    /**
     * Copy Constructor
     * @param an_address TelecomAddress
     */
    public TelecomAddress(TelecomAddress an_address) {
        this(an_address.validFrom, an_address.validTo, an_address.countryCode, an_address.nationalDialingPrefix, an_address.areaCode, an_address.number, an_address.extension, an_address.physicalType);
    }

    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString(){ 
        return ("The TELECOM ADDRESS:\n" + "+" + countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType + " is valid from " + validFrom + " to " + validTo);
    }

    /**
     * alternative to the toString method
     * @return String
     */
    public String display(){
        return (countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType);
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
            TelecomAddress otherTelecomAddress = (TelecomAddress)otherObject;
            return (validTo.equals(otherTelecomAddress.validTo) && validFrom.equals(otherTelecomAddress.validFrom) && countryCode == otherTelecomAddress.countryCode && nationalDialingPrefix.equals(otherTelecomAddress.nationalDialingPrefix) && areaCode == otherTelecomAddress.areaCode && number == otherTelecomAddress.number && extension == otherTelecomAddress.extension && physicalType.equals(otherTelecomAddress.physicalType));
        }
    }

    //Accessors and Mutators
    /**
     * Sets countryCode to a new value
     * @param countryCode int
     */
    public void setCountryCode(int countryCode){
        this.countryCode =  countryCode;
    }

    /**
     * Sets nationalDialingPrefix to a new value
     * @param nationalDialingPrefix String
     */
    public void setNationalDialingPrefix(String nationalDialingPrefix){
        this.nationalDialingPrefix = nationalDialingPrefix;
    }

    /**
     * Sets areaCode to a new value
     * @param areaCode int
     */
    public void setAreaCode(int areaCode){
        this.areaCode = areaCode;
    }
   
    /**
     * Sets number to a new value
     * @param number long
     */
    public void setNumber(long number){
        this.number = number;
    }

    /**
     * Sets extension to a new value
     * @param extension int
     */
    public void setExtension(int extension){
        this.extension =  extension;
    }

    /**
     * Sets physicalTypeto a new value
     * @param physicalType String
     */
    public void setPhysicalType(String physicalType){
        this.physicalType = physicalType;
    }

    /**
     * Getter for countryCode
     * @return countryCode
     */
    public int getCountryCode(){
        return countryCode;
    }

    /**
     * Getter for nationalDialingPrefix
     * @return nationalDialingPrefix
     */
    public String getNationalDialingPrefix(){
        return nationalDialingPrefix;
    }

    /**
     * Getter for areaCode
     * @return areaCode
     */
    public int getAreaCode(){
        return areaCode;
    }
   
    /**
     * Getter for number
     * @return number
     */
    public long getNumber(){
        return number;
    }

    /**
     * Getter for extension
     * @return extension
     */
    public int getExtension(){
        return extension;
    }

    /**
     * Getter for physicalType
     * @return physicalType
     */
    public String getPhysicalType(){
        return physicalType;
    }
}
