// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the constructors, setters/getters, methods for the Locale class.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package3;
public class Locale {
    String alphaCountryCode;   
    int numCountryCode;
    String countryName;

    /**
     * Default Constructor 
     */
    public Locale() {
        alphaCountryCode = "UN";
        numCountryCode = 000;
        countryName = "Unknown";
    }

    /**
     * Parameterized Constructor
     * @param alphaCountryCode String
     * @param numCountryCode int
     * @param countryName String
     */
    public Locale(String alphaCountryCode, int numCountryCode, String countryName) {
        this.alphaCountryCode = alphaCountryCode.substring(0, 2); 
        this.numCountryCode = numCountryCode; // check that its 3 integers 
        this.countryName = countryName; 
    }

    /**
     * Copy Constructor
     * @param some_locale Locale
     */
    public Locale(Locale some_locale) {
        this(some_locale.alphaCountryCode, some_locale.numCountryCode, some_locale.countryName);
    }
    
    /** 
     * Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return (alphaCountryCode + " " + numCountryCode + " " + countryName);
    }
    
    /** Checks equality of objects
     * @param locale of type Locale
     * @return boolean
     */
    public boolean equals(Locale locale) {
        if (locale == null)
            return false;

        String thisClass = getClass().toString(), otherClass = locale.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Locale otherLocale = (Locale) locale;
            return (alphaCountryCode.equals(otherLocale.alphaCountryCode) && numCountryCode == otherLocale.numCountryCode && countryName.equals(otherLocale.countryName));
        }
    }
    
    //Accessors and Mutators
    /**
     * Getter for alphaCountryCode
     * @return alphaCountryCode
     */
    public String getAlphaCountryCode(){
        return alphaCountryCode;
    }  

    /**
     * Getter for numCountryCode
     * @return int numCountryCode
     */
    public int getNumCountryCode(){
        return numCountryCode;
    }

    /**
     * Getter for countryName
     * @return String countryName
     */
    public String getCountryName() {
        return countryName; 
    }
    
    /**
     * Sets alphaCountryCode to new value
     * @param alphaCountryCode String
     */
    public void setAlphaCountryCode(String alphaCountryCode){
        this.alphaCountryCode = alphaCountryCode;
    }       

    /**
     * Sets numCountryCode to new value
     * @param numCountryCode int
     */
    public void setNumCountryCode(int numCountryCode){
        this.numCountryCode = numCountryCode;
    }

    /**
     * Sets countryName to new value
     * @param countryName String
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName; 
    }

}
