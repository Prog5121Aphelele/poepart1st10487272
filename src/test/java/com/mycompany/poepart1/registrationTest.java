package com.mycompany.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class registrationTest {

    // ✅ Username Tests
    @Test
    public void testValidUsername() {
        // Username should contain underscore and be <= 5 characters
        assertTrue(isValidUsername("ab_cd"));
    }

    @Test
    public void testInvalidUsername_NoUnderscore() {
        assertFalse(isValidUsername("abcde"));
    }

    @Test
    public void testInvalidUsername_TooLong() {
        assertFalse(isValidUsername("abcdef_"));
    }

    // ✅ Password Tests
    @Test
    public void testValidPassword() {
        // At least 8 chars, uppercase, number, special char
        assertTrue(isValidPassword("Passw0rd!"));
    }

    @Test
    public void testInvalidPassword_NoUppercase() {
        assertFalse(isValidPassword("password1!"));
    }

    @Test
    public void testInvalidPassword_NoNumber() {
        assertFalse(isValidPassword("Password!"));
    }

    @Test
    public void testInvalidPassword_NoSpecialChar() {
        assertFalse(isValidPassword("Password1"));
    }

    @Test
    public void testInvalidPassword_TooShort() {
        assertFalse(isValidPassword("P@1a"));
    }

    // ✅ Cell Number Tests
    @Test
    public void testValidCellNumber() {
        assertTrue(isValidCellNumber("+271234567890"));
    }

    @Test
    public void testInvalidCellNumber_NoCountryCode() {
        assertFalse(isValidCellNumber("0123456789"));
    }

    @Test
    public void testInvalidCellNumber_WrongLength() {
        assertFalse(isValidCellNumber("+27123"));
    }

    // ----------------------------
    // Helper methods for testing
    // (replicating validation logic without JOptionPane)
    // ----------------------------

    private boolean isValidUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    private boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$";
        return password.matches(regex);
    }

    private boolean isValidCellNumber(String cellnumber) {
        return cellnumber.length() == 12 && cellnumber.startsWith("+27");
    }
}


