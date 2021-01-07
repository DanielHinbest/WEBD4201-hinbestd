/**
 * 
 */
package webd4201.hinbestd;

/**
 * Interface object for the College information. This stores the name, as well as the other general college information
 * @author Daniel Hinbest
 * @version 1.0 (2021-01-07)
 * @since 1.0
 */
public interface CollegeInterface {
    /**
     * The class constant for the college name set to Durham College
     */
    public static final String COLLEGE_NAME = "Durham College";    
    /**
     * The class constant for the Durham College phone number
     */
    public static final String PHONE_NUMBER = "(905) 721-2000";    
    /**
     * The class constant for the Minimum ID Number
     */
    public static final long MINIMUM_ID_NUMBER = 100000000;    
    /**
     * The class constant for the Maximum ID Number
     */
    public static final long MAXIMUM_ID_NUMBER = 999999999;    
    /**
     * The class constant for the Minimum Password Length
     */
    public static final byte MINIMUM_PASSWORD_LENGTH = 8;    
    /**
     * The class constant for the Maximum Password Length
     */
    public static final byte MAXIMUM_PASSWORD_LENGTH = 20;
    
    /**
     * The function header for the classes to display the type of user
     * @return {String}
     */
    public String getTypeForDisplay();
}
