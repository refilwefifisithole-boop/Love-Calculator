//Purpose: Stores planetary positions.
package models;
import java.time.LocalDate;
import java.util.Scanner;

public class BirthChart {

//The enum keyword in Java is used to define a set of named constants.

    public enum ZodiacSign {
        Aries, Taurus, Gemini, Cancer, Leo, virgo,
        Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
    }

    public enum Element {
        Fire, Earth, Air, Water
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth month (number): ");
        int month = scanner.nextInt();

        System.out.println("Enter your birth day: ");
        int day = scanner.nextInt();
       
        LocalDate birthDate = LocalDate.of(2000, month, day); // year doesn't matter for sign calc

        ZodiacSign sign = getZodiacSign(birthDate);
        Element element = getElement(sign);

        System.out.println("Your zodiac sign is: " + sign);
        System.out.println("Your element is: " + element);
        
    }// end main 

    public static ZodiacSign getZodiacSign(LocalDate birthDate) {
         
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();
        

        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)){
            return ZodiacSign.Capricorn;
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)){
            return ZodiacSign.Pisces;
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return ZodiacSign.Aries;
         } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)){
            return ZodiacSign.Taurus;
         } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)){
            return ZodiacSign.Gemini;
         } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)){
            return ZodiacSign.Cancer;
         } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)){
            return ZodiacSign.Leo;
         } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)){
            return ZodiacSign.virgo;
         } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)){
            return ZodiacSign.Libra;
         }else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)){
            return ZodiacSign.Scorpio;
         }else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)){
            return ZodiacSign.Sagittarius;
         }else {
        throw new IllegalStateException("Invalid date: " + birthDate);
    }
        
        }// end getZodiacSign method 



    public static Element getElement(ZodiacSign sign) {
    
    switch (sign) {
        case Aries:
        case Leo:
        case Sagittarius:
            return Element.Fire;

        case Taurus:
        case virgo:
        case Capricorn:
            return Element.Earth;

        case Gemini:
        case Libra:
        case Aquarius:
            return Element.Air;

        case Cancer:
        case Scorpio:
        case Pisces:
            return Element.Water;

        default:
            throw new IllegalArgumentException("Unknown sign: " + sign);
    }
}







    }// end class BirthChart
 