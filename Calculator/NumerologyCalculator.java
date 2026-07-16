package Calculator;
import java.time.LocalDate;
import models.NumerologyResult;


public class NumerologyCalculator {

public static int CalculateLifePath(LocalDate birthDate){
//sums all digits of the birth date, reduces to a single digit 
        int year = birthDate.getYear();
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();

    int n = year + month + day;  
while (n>= 10) { 
            int sum = 0;
            
            while (n > 0) {
                sum += n % 10; 
                n /= 10;       
            }
            n = sum; 
        }
        return n;
    
    }// end CalculateLifePath method 


public static int reduceToSingleDigit(int number){
//keep adding the digits together until only one digit is left.

while (number >= 9) {
int sum =0;

    while (number>0) {
        sum += number %10;
        number /=10;
}// inner loop 
number=sum;
   
}// outer loop
System.out.println("Final Single sum:" + number);
return number;
}// end ReduceToSingleDigit method


public static int CalculateDestinyNumber(String fullName){
// maps each letter to a number

    String newName = fullName.toUpperCase().replaceAll("[^A-Z]", "");
    int total = 0;

    for (char c : newName.toCharArray()) {
        total += ((c - 'A') % 9) + 1;
    }

    while (total > 9 && total != 11 && total != 22 && total != 33) {
        int sum = 0;
        while (total > 0) {
            sum += total % 10;
            total /= 10;
        }
        total = sum;
    }

    return total;
}// end calculateDestinyNumber method


public static String GetDescription(int lifePathNumber){
// translate a number into meaningful text 
switch (lifePathNumber) {
    case 1:
        return "The Leader: You are ambitious, independent, and fiercely original. Your path involves blazing new trails, acting as a pioneer, and mastering self-reliance.";
    case 2:    
        return "The Diplomat: You are a natural peacemaker who thrives on cooperation, empathy, and harmony. Your destiny is to bring people together and resolve conflict.";
    case 3:
        return "The Communicator: You are creative, socially gifted, and expressive. Your purpose is to uplift others through art, speaking, writing, or simply spreading joy.";
    case 4:
        return "The Builder: You are practical, disciplined, and organized. Your life path focuses on creating solid foundations, working hard, and delivering dependable results.";
    case 5:
        return "The Freedom Seeker: You are adaptable, curious, and adventurous. Your destiny is to experience the world, embrace change, and share your dynamic energy.";
    case 6: 
        return "The Nurturer: You are responsible, loving, and community-minded. Your purpose revolves around service, healing, teaching, and looking after the needs of your loved ones.";    
    case 7:
        return "The Seeker: You are analytical, introspective, and spiritually inclined. Your path involves a deep search for truth, wisdom, and understanding the mysteries of life.";
    case 8:    
        return "he Achiever: You are ambitious, authoritative, and business-minded. Your destiny is to manifest wealth, lead large projects, and achieve material success.";
    case 9:    
        return "The Humanitarian: You are compassionate, idealistic, and artistic. Your life is meant for universal service, philanthropy, and elevating humanity.";
    case 11:    
        return "The Intuitive: A master number representing spiritual depth and heightened perception. You are a visionary and an inspired guide for others.";
    case 22:
        return "The Master Builder: A highly ambitious master number. Your destiny is to turn great, visionary dreams into reality on a massive, global scale.";    
    case 33:
    return "The Master Teacher: A master number representing selfless service and profound healing. You are here to teach, inspire, and uplift on a spiritual level.";
default:
    throw new IllegalArgumentException("Invalid life path number: " + lifePathNumber);
}

}// end GetDescription method 

public  static NumerologyResult calculate(LocalDate birthDate, String fullName) {
//calls the above methods and packages the results into a NumerologyResult object
int lifePathNumber = CalculateLifePath(birthDate);
    int destinyNumber = CalculateDestinyNumber(fullName);
    String description = GetDescription(lifePathNumber);

    return new NumerologyResult(lifePathNumber, description, destinyNumber);
}// end calculate method 








}

