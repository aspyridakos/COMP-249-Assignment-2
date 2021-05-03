// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the PostOfficeBoxAddress class which is a child of the GeographicAddress class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package3;
import Package1.Address;

public class PostOfficeBoxAddress extends GeographicAddress{

    private int boxLobbyDoorCode;

    /**Default Constructor*/
    public PostOfficeBoxAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        boxLobbyDoorCode = 000;
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
     * @param boxLobbyDoorCode int
     */
    public PostOfficeBoxAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1, int boxLobbyDoorCode) {
        super(validFrom, validTo, addressLine, city, regionOrState, zipOrPostCode, loc1); // incorrect way to implement? Address object will be built theoretically before this line no?
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    /**
     * Copy Constructor
     * @param someBox PostOfficeBoxAddress
     */
    public PostOfficeBoxAddress(PostOfficeBoxAddress someBox) {
        this(someBox.validTo, someBox.validFrom, someBox.addressLine, someBox.city, someBox.regionOrState, someBox.zipOrPostCode, someBox.loc, someBox.boxLobbyDoorCode);
    }


    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return ("This P.O. BOX ADDRESS:\n" + addressLine + ", " + city + ", " 
        + regionOrState + ".\n" + zipOrPostCode + "\n" + loc 
        + ".\nWith box pin: " + boxLobbyDoorCode + "\nis valid from " + validFrom + " to " + validTo);
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
            PostOfficeBoxAddress otherPostOfficeBoxAddress = (PostOfficeBoxAddress)otherObject;
            return (validTo.equals(otherPostOfficeBoxAddress.validTo) && validFrom.equals(otherPostOfficeBoxAddress.validFrom) && addressLine.equals(otherPostOfficeBoxAddress.addressLine) && city.equals(otherPostOfficeBoxAddress.city) && city.equals(otherPostOfficeBoxAddress.city) && zipOrPostCode.equals(otherPostOfficeBoxAddress.zipOrPostCode) && loc.equals(otherPostOfficeBoxAddress.loc) && boxLobbyDoorCode == otherPostOfficeBoxAddress.boxLobbyDoorCode);
        }
    }

    /**
     * Setter for boxLobbyDoorCode
     * @param boxLobbyDoorCode int
     */
    public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    /**
     * Getter for boxLobbyDoorCode
     * @return int boxLobbyDoorCode
     */
    public int getBoxLobbyDoorCode() {
        return boxLobbyDoorCode;
    }
}
