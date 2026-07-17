package Calculator;
import models.BirthChart.Element;
import models.BirthChart;
import models.CompatibilityResults;
import models.BirthChart.ZodiacSign;
import models.NumerologyResult;
import models.Person;

public class CompatibilityCalculator {
   
public boolean CompareElements(Element element1, Element element2){
// check if two elements are considered compatible
if (element1 == element2)
    return true;

if ((element1 == Element.Fire && element2==Element.Air) || (element1== Element.Air && element2== Element.Fire))
    return true;

if ((element1 == Element.Earth && element2== Element.Water) || (element1==Element.Water && element2== Element.Earth))
    return true;

return false;
    }// end CompareElements method 


public boolean CompareLifePathNumbers(int num1, int num2){
//returns the difference used for scoring 
 if (num1 == num2)
    return true;

if ((num1 == 1 && num2 == 1)){
System.out.println("Compability Vibe: Identical Vibe (High)");
return true;
}

if ((num1 == 1 && num2 == 4) || (num1 == 4 && num2 == 1)){
System.out.println("Compability Vibe: Identical Vibe (High)");
return true;
}

if ((num1 == 1 && num2 == 2) || (num1== 2 && num2 == 1)){
System.out.println("Compability Vibe: Adjacent/Flowing");
return true;
}

if ((num1 == 4 && num2 == 5) || (num1== 5 && num2 == 4)){
System.out.println("Compability Vibe: Adjacent/Flowing");
return true;
}

if ((num1 == 2 && num2 == 4) || (num1== 4 && num2 == 2)){
System.out.println("Compability Vibe: Supportive");
return true;
}

if ((num1 == 3 && num2 == 5) || (num1== 5 && num2 == 3)){
System.out.println("Compability Vibe: Supportive");
return true;
}

if ((num1 == 3 && num2 == 6) || (num1== 6 && num2 == 3)){
System.out.println("Compability Vibe: Complementary");
return true;
}

if ((num1 == 1 && num2 == 5) || (num1== 5 && num2 == 1)){
System.out.println("Compability Vibe: Challenging");
return true;
}

if ((num1 == 5 && num2 == 9) || (num1== 9 && num2 == 5)){
System.out.println("Compability Vibe: Challenging");
return true;
}

if ((num1 == 1 && num2 == 6) || (num1== 6 && num2 == 1)){
System.out.println("Compability Vibe: Friction & Growth");
return true;
}

if ((num1 == 2 && num2 == 7) || (num1== 7 && num2 == 2)){
System.out.println("Compability Vibe: Friction & Growth");
return true;
}

return false;    
}// end ComapreLifePathNumbers method 


public int OverAllScore(boolean CompareElements, Boolean ComapreLifePathNumbers, BirthChart Partner1, BirthChart Partner2, NumerologyResult num1, NumerologyResult num2){
// combune the comparisons into a final point total
  int score = 0;

    Element element1 = Partner1.getElement();
    Element element2 = Partner2.getElement();
    if (CompareElements(element1, element2)) {
        score += 40;
    }
    int lifePath1 = num1.getLifePathNumber();
    int lifePath2 = num2.getLifePathNumber();
    int difference = Math.abs(lifePath1 - lifePath2);

    if (difference == 0) {
        score += 30;
    } else if (difference <= 2) {
        score += 15;
    }
    

    return score;
}// end OverAllScore method 


public static String GetSummary (int score){
    //convert the score into a text label
if (score >= 80) {
        return "Highly Compatible";
    } else if (score >= 60) {
        return "Moderately Compatible";
    } else if (score >= 40) {
        return "Some Challenges";
    } else {
        return "Challenging Match";
    }
}// end GetSummmary Method

public  CompatibilityResults Calculate(Person Partner1, Person Partner2, Element element1, int score,Element element2, int num1, int num2,boolean CompareElements, Boolean ComapreLifePathNumbers, BirthChart Partner1, BirthChart Partner2, NumerologyResult num1, NumerologyResult num2){
// runs all the comparisons and return yhe funished result object
    boolean ElementCompatible = CompareElements(element1,element2);
    int lifePathNumber = CompareLifePathNumbers(num1,num2);
    int OverAllScore = OverAllScore(CompareElements, ComapreLifePathNumbers,Partner1,Partner2,num1,num2);
    String CompatibilitySummary = GetSummary (score);

    return new CompatibilityResults(null, null, ElementCompatible, OverAllScore, CompatibilitySummary);
} // end Calculate method 

} // end CompatibilityCalculator class 
