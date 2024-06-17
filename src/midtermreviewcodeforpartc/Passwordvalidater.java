/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author alvyt
 */
public class Passwordvalidater {
    
    
    /**
     * Validates the given password based on predefined rules.
     * @param password The password to validate
     * @return true if the password is valid, false otherwise
     */
    public static boolean validate(String password) {
        return isAtLeast8Chars(password) && hasSpecialCharacter(password);
    }

    /**
     * Checks if the password is at least 8 characters long.
     * @param password The password to check
     * @return true if the password is at least 8 characters long, false otherwise
     */
    private static boolean isAtLeast8Chars(String password) {
        return password.length() >= 8;
    }

    /**
     * Checks if the password contains at least one special character.
     * @param password The password to check
     * @return true if the password contains at least one special character, false otherwise
     */
    private static boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}