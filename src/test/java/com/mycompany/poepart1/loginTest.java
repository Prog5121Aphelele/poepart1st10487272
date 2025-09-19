package com.mycompany.poepart1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class loginTest {

    // ✅ Username tests
    @Test
    void testValidUsername() {
        assertTrue(login.validateUsername("kyl_1"));
        assertTrue(login.validateUsername("kyl_1"));
    }

    @Test
    void testInvalidUsername() {
        assertFalse(login.validateUsername("abcdef")); // too long
        assertFalse(login.validateUsername("abc"));    // missing underscore
    }

    // ✅ Password tests
    @Test
    void testValidPassword() {
        assertTrue(login.validatePassword("Ch&&sec@ke99"));
        assertTrue(login.validatePassword("Ch&&sec@ke99"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(login.validatePassword("abcdefg"));   // too short, no rules met
        assertFalse(login.validatePassword("ABCDEFGH"));  // no number, no special char
        assertFalse(login.validatePassword("abcd1234"));  // no capital, no special char
        assertFalse(login.validatePassword("Abcdefgh"));  // no number, no special char
    }
}

