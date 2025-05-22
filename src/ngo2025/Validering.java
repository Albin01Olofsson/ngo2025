/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2025;

/**
 *
 * @author albin
 */
public class Validering {
    
    // Kontrollerar att texten inte är tom eller bara blanksteg
    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    } 

// Validerar datum i format yyyy-MM-dd
    public static boolean isValidDate(String date) {
        return date != null && date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    // Validerar e-postadress
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,}$");
    }

// Validerar telefonnummer (siffror, mellanslag eller bindestreck)
    public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("^[0-9\\-\\s]+$");
    }



}
