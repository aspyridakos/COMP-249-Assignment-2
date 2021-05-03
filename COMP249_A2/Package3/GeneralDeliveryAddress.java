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

package Package3;

import Package2.TelecomAddress;
import Package1.Address;

public class GeneralDeliveryAddress extends Address{ 
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private TelecomAddress telecomAddress; 

    
    /** Default Constructor*/
    public GeneralDeliveryAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        telecomAddress = new TelecomAddress();
    }

    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     * @param addressLine String
     * @param city String
     * @param regionOrState String
     * @param zipOrPostCode String
     * @param telecomAddress TelecomAddress
     */
    public GeneralDeliveryAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, TelecomAddress telecomAddress) {
        super(validFrom, validTo);
        this.telecomAddress = new TelecomAddress(telecomAddress);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
    }

    /**
     * Copy Constructor
     * @param anAddress GeneralDeliveryAddress
     */
    public GeneralDeliveryAddress(GeneralDeliveryAddress anAddress) {
        this.validFrom = anAddress.validFrom;
        this.validTo = anAddress.validTo;
        this.addressLine = anAddress.addressLine;
        this.city = anAddress.city;
        this.regionOrState = anAddress.regionOrState;
        this.zipOrPostCode = anAddress.zipOrPostCode;
        this.telecomAddress = new TelecomAddress(anAddress.telecomAddress);
    }

    //Accessors and Mutators

    /**
     * Getter for addressLine
     * @return addressLine
     */
    public String getAddressLine(){
        return addressLine;
    } 

    /**
     * Getter for city
     * @return city
     */
    public String getCity(){
        return city;
    }

    /**
     * Getter for regionOrState
     * @return regionOrState
     */
    public String getRegionOrState(){
        return regionOrState;
    }

    /**
     * Getter for zipOrPostCode
     * @return zipOrPostCode
     */
    public String getZipOrPostCode(){
        return zipOrPostCode;
    }

    /**
     * Getter for telecomAddress
     * @return telecomAddress
     */
    public TelecomAddress getTelecomAddress(){
        TelecomAddress copyTelecomAddress = new TelecomAddress(telecomAddress);
        return copyTelecomAddress;
    }

    /**
     * Sets addressLine to a new value
     * @param addressLine String
     */
    public void setAddressLine(String addressLine){
        this.addressLine = addressLine;
    }

    /**
     * Sets city to a new value
     * @param city String
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Sets regionOrState to a new value
     * @param regionOrState String
     */
    public void setRegionOrState(String regionOrState){
        this.regionOrState = regionOrState;
    }

    /**
     * Sets zipOrPostCode to a new value
     * @param zipOrPostCode String
     */
    public void setZipOrPostCode(String zipOrPostCode){
        this.zipOrPostCode = zipOrPostCode;
    }

    /**
     * Sets telecomAddress to a new value
     * @param telecomAddress TelecomAddress
     */
    public void setTelecomAddress(TelecomAddress telecomAddress){
        TelecomAddress copyOfTelecomAddress = new TelecomAddress(this.telecomAddress);
        this.telecomAddress = copyOfTelecomAddress;
    }

    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {  //finish later
        return "The GENERAL DELIVERY ADDRESS:\n" + addressLine + ", " + city + ", " 
        + regionOrState + ", " + zipOrPostCode + ", " + telecomAddress.display() + " is valid from " 
        + validFrom + " to " + validTo;
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
            GeneralDeliveryAddress otherGeneralDeliveryAddress = (GeneralDeliveryAddress)otherObject;
            return (validTo.equals(otherGeneralDeliveryAddress.validTo) && validFrom.equals(otherGeneralDeliveryAddress.validFrom) 
            && addressLine.equals(otherGeneralDeliveryAddress.addressLine) && city.equals(otherGeneralDeliveryAddress.city) &&
            regionOrState.equals(otherGeneralDeliveryAddress.regionOrState) && zipOrPostCode.equals(otherGeneralDeliveryAddress.zipOrPostCode) &&
            telecomAddress.equals(otherGeneralDeliveryAddress.telecomAddress)); // check that telecomAddress comparison works
        }
    }
}
