// -----------------------------------------------------------------------------
// Part: 1 & 2
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

/**
 * This class implements the driver class and the methods traceObsoleteAddress and copyAddresses it will use.
 * @author Anne Bastien, 40133471 and Alexandra Spyridakos, 40175280
 * @version 1.0 & 2.0
 * COMP249
 * Assignment 2
 * March 8th, 2021
 */

package Package1;
import Package2.*;
import Package3.*;

public class driver {
    
    // ----------------Part 2------------------

    /** Copies array of addresses into a new array 
     * ======DISPLAYS INCORRECT INFORMATION=======
     * EXPLANATION:
     *   This method is incorrect because it does not check for the object types before adding them to the array of addresses. 
     *   This means that the child class methods will never be called so every object will be of type Address instead of it's expected subclass name (ex:TelecomAddress, EmailAddress, etc.)
     * @param arr an Address[]
     */
    public static void copyAddresses(Address[] arr) {
        Address[] arr_copy = new Address[arr.length];
        for (int i=0; i<arr.length; i++) {
            arr_copy[i] = new Address(arr[i]);  
            System.out.println(arr_copy[i]);    
        }
    }
	// ----------------End of Part 2------------------

    /** Main driver method that tests address object values according to desired conditions
     * @param args 
     */
    public static void main(String[] args) {
        Locale loc1 = new Locale ("CA", 124, "Canada");
        Locale loc2 = new Locale();


        WebPageAddress web1 = new WebPageAddress ("2000-12-20", "1980-04-13", "", ""); //Testing that if wrong order, still works;
        WebPageAddress web2 = new WebPageAddress(web1);

        EmailAddress em1 = new EmailAddress("2002-12-20", "2021-11-30", "kingscross", "warnerbros", "com");
        EmailAddress em2 = new EmailAddress("2004-01-21", "2004-01-21", "destroyPC", "virus", "scam");

        TelecomAddress telec1 = new TelecomAddress("2005-06-27", "2018-05-14", 1, "(0)", 450, 6892347, 122, "mobile");
        TelecomAddress telec2 = new TelecomAddress(telec1);
        TelecomAddress telec3 = new TelecomAddress();

        GeographicAddress geo1 = new GeographicAddress("2013-02-11", "2013-03-24", "1034 martian Rd", "Olympus", "Mars", "K2W M4R", loc1);
        GeographicAddress geo2 = new GeographicAddress(geo1);
        GeographicAddress geo3 = new GeographicAddress();

        PostOfficeBoxAddress postOff1 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc2, 282);
        PostOfficeBoxAddress postOff2 = null;
        PostOfficeBoxAddress postOff3 = new PostOfficeBoxAddress();

        Address a1 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc1, 282);

        GeneralDeliveryAddress genD1 = new GeneralDeliveryAddress("2004-10-21", "2100-03-03", "145 Wolfe Crescent", "PineCity", "Colorado", "M8Y 3R5", telec1);
        GeneralDeliveryAddress genD2 = new GeneralDeliveryAddress(genD1);

        GeographicAddress geo4 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc1, 282);

        Address a2 = new Address();
        Address a3 = new Address("2001-05-14", "2088-12-06");

        System.out.println("Testing equality of objects...");

        //TESTING .equals() METHOD
        if (postOff1.equals(geo4)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        if (geo4.equals(postOff1)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        if (postOff1.equals(a1)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        //testing null object in equals() method
        if (postOff1.equals(postOff2)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }
        
        //initializing array of Address objects
        Address[] arr = {web1, em1, telec1, geo1, postOff1, genD1, web2, genD2, a1, telec2, a2, telec3, geo2, a3, geo3, em2, geo4, postOff3};

        System.out.println("\n\n\n========Checking for Obsolete Addresses========\n\n");
        traceObsoleteAddress(arr, 2004, 1, 21);
        traceObsoleteAddress(arr, 1989, 8, 16); 
        traceObsoleteAddress(arr, 2006, 12, 31);

        // --------------------Part 2----------------------

        System.out.println("\n\n\n=========Printing array 'arr' and its copy made by the copyAddresses method=========");
        System.out.println("\n\nPrinting arr:");

        for (int i=0; i<arr.length; i++)
            System.out.println("\n"+arr[i]+"\n");

        System.out.println("\nPrinting arr_copy:");
        copyAddresses(arr);

        //// ----------------End of Part 2------------------

        System.out.println("\nProgram has ended.");
    }

    /** 
     * Checks if dates are obsolete and print obsolete address messages 
     * @param arr an Address[]
     * @param year an int
     * @param month an int
     * @param day an int
     */
    public static void traceObsoleteAddress(Address[] arr, int year, int month, int day) {
        String yearString = Integer.toString(year);
        String monthString = Integer.toString(month);
        String dayString = Integer.toString(day);

        //Add a 0 before single digit months or day (necessary for proper comparison)
        if(monthString.length()==1)
            monthString = "0" + monthString;

        if(dayString.length() == 1)
            dayString = "0" + dayString;

        String date = yearString + "-" + monthString + "-" + dayString;
        System.out.println("Comparing the addresses validity period to "+ date + "...\n\n");
        boolean obsolete = true;
        for (int i=0; i<arr.length; i++){  
            obsolete = (arr[i].getValidFrom().compareTo(date)<=0 && arr[i].getValidTo().compareTo(date)>=0)? false:true;
            System.out.println(obsolete? arr[i] + " and therefore is obsolete on " + date + ". Found at index " + i + ".\n": arr[i] + " and therefore is valid on " + date + ". Found at index " + i + ".\n");
        }
    }
}