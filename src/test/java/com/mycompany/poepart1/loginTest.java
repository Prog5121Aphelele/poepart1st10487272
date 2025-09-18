package com.mycompany.poepart1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class loginTest {

    // ✅ Username tests
    @Test
    void testValidUsername() {
        assertTrue(login.validateUsername("abc_"));
        assertTrue(login.validateUsername("a_bc"));
    }

    @Test
    void testInvalidUsername() {
        assertFalse(login.validateUsername("abcdef")); // too long
        assertFalse(login.validateUsername("abc"));    // missing underscore
    }

    // ✅ Password tests
    @Test
    void testValidPassword() {
        assertTrue(login.validatePassword("Abcdef1!"));
        assertTrue(login.validatePassword("Xyz123$%"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(login.validatePassword("abcdefg"));   // too short, no rules met
        assertFalse(login.validatePassword("ABCDEFGH"));  // no number, no special char
        assertFalse(login.validatePassword("abcd1234"));  // no capital, no special char
        assertFalse(login.validatePassword("Abcdefgh"));  // no number, no special char
    }
}

