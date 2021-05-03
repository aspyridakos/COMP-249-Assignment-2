// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------
 
/**
 * This class implements the constructors, setters/getters, methods for the GeographicAddress class which is a child of the Address class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package3;

import Package1.Address;

public class GeographicAddress extends Address {
    protected String addressLine;
    protected String city;
    protected String regionOrState;
    protected String zipOrPostCode;
    protected Locale loc;

    /**Default Constructor*/
    public GeographicAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        loc = new Locale();
    }

    /**
     * Parameterized Constructor
     * @param validFrom String
     * @param validTo String
     * @param addressLine String
     * @param city String
     * @param regionOrState String
     * @param zipOrPostCode String
     * @param loc1 Locale
     */
    public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1) {
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        loc = new Locale(loc1);
    }

    /**
     * Copy Constructor
     * @param someGeoAddress GeographicAddress
     */
    public GeographicAddress(GeographicAddress someGeoAddress) {
        this(someGeoAddress.validFrom, someGeoAddress.validTo, someGeoAddress.addressLine, someGeoAddress.city, someGeoAddress.regionOrState, someGeoAddress.zipOrPostCode, someGeoAddress.loc);
    }

    // Accessors and Mutators
    /**
     * Getter for addressline
     * @return String addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Getter for city
     * @return String city 
     */
    public String getCity(){
        return city;
    }

    /**
     * Getter for regionOrState
     * @return String regionOrState
     */
    public String getRegionOrState(){
        return regionOrState;
    }

    /**
     * Getter for zipOrPostCode
     * @return String zipOrPostCode
     */
    public String getZipOrPostCode(){
        return zipOrPostCode;
    }

    /**
     * Getter for loc
     * @return Locale loc 
     */
    public Locale getLocale(){
        Locale copyLoc = new Locale(this.loc);
        return copyLoc;
    }

    /**
     * Sets addressLine to new value
     * @param addressLine String
     */
    public void setAddressLine(String addressLine){
        this.addressLine = addressLine;
    }

    /**
     * Sets city to new value
     * @param city String
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Sets regionOrState to new value
     * @param regionOrState String
     */
    public void setRegionOrState(String regionOrState){
        this.regionOrState = regionOrState;
    }

    /**
     * Sets zipOrPostCode to new value
     * @param zipOrPostCode String 
     */
    public void setZipOrPostCode(String zipOrPostCode){
        this.zipOrPostCode = zipOrPostCode;
    }

    /**
     * Sets loc to new value
     * @param loc Locale
     */
    public void setLocale(Locale loc){
        Locale newLoc = new Locale(loc);
        this.loc = newLoc;
    }

    /**Converts object attributes to a printable String format
     * @return String
     */
    public String toString() { 
        return ("The GEOGRAPHIC ADDRESS:\n" + addressLine + ", " + city + ", " + regionOrState + " " + zipOrPostCode + loc + " \nis valid from " + validFrom + " to " + validTo);
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
            GeographicAddress otherGeographicAddress = (GeographicAddress)otherObject;
            return (validTo.equals(otherGeographicAddress.validTo) && validFrom.equals(otherGeographicAddress.validFrom) 
            && addressLine.equals(otherGeographicAddress.addressLine) && city.equals(otherGeographicAddress.city) 
            && zipOrPostCode.equals(otherGeographicAddress.zipOrPostCode) && regionOrState.equals(otherGeographicAddress.regionOrState) 
            && loc.equals(otherGeographicAddress.loc));
        }
    }
}
