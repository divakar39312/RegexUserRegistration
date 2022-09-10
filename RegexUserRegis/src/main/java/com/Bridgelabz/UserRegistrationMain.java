package com.Bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int choose;
            System.out.print("Press \n1.First Name\n2.Last Name\n3.Email id\n4.Phone number\n5.Password\n6.EXIT ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    UserRegistration.validFirstName("Divakar");
                    break;
                case 2:
                    UserRegistration.validLastName("Kumar");
                    break;
                case 3:
                    UserRegistration.validEmailAddress("divakarkumar@gmail.com");
                    break;
                case 4:
                    UserRegistration.validMobileNumber("91 9902322610");
                    break;
                case 5:
                    UserRegistration.validPassword("Divakar%kumar786");
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
            }
        }

    }
