package com.Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest {


        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue() {
            boolean result = UserRegistration.validFirstName("Divakar");
            System.out.println(result);
            Assertions.assertTrue(result);
        }
        @Test
        public void givenFirstName_WhenProper_ShouldReturnFalse() {
            boolean result = UserRegistration.validFirstName("divakar");
            System.out.println(result);
            Assertions.assertFalse(result);
        }
        @Test
        public void givenLastName_WhenProper_ShouldReturnTrue() {
            boolean result = UserRegistration.validLastName("Kumar");
            System.out.println(result);
            Assertions.assertTrue(result);
        }
        @Test
        public void givenLastName_WhenProper_ShouldReturnFalse() {
            boolean result = UserRegistration.validLastName("kumar");
            System.out.println(result);
            Assertions.assertFalse(result);
        }
        @Test
        public void givenEmailId_WhenProper_ShouldReturnTrue() {
            boolean result = UserRegistration.validEmailAddress("divakarkumar@gmail.com");
            System.out.println(result);
            Assertions.assertTrue(result);
        }

        @Test
        public void givenEmailId_WhenProper_ShouldReturnFalse() {
            boolean result = UserRegistration.validEmailAddress("divakar");
            System.out.println(result);
            Assertions.assertFalse(result);
        }
        @Test
        public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
            boolean result = UserRegistration.validMobileNumber("91 7878676789");
            System.out.println(result);
            Assertions.assertTrue(result);
        }
        @Test
        public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
            boolean result = UserRegistration.validMobileNumber("91 890675");
            System.out.println(result);
            Assertions.assertFalse(result);
        }
        @Test
        public void givenPassword_WhenProper_ShouldReturnTrue() {
            boolean result = UserRegistration.validPassword("Divakar%kumar678");
            System.out.println(result);
            Assertions.assertTrue(result);
        }
        //Sad test case for Password
        @Test
        public void givenPassword_WhenProper_ShouldReturnFalse() {
            boolean result = UserRegistration.validPassword("divakar0op0");
            System.out.println(result);
            Assertions.assertFalse(result);
        }
    }
