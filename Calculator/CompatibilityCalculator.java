package Calculator;
import models.BirthChart;
import javax.swing.text.html.parser.Element;

public class CompatibilityCalculator {
   
    public boolean CompareElements(Element element1, Element elemet2){
// check if two elements are considered compatible
if (element1 == elemet2)
return true;

if ((element1 == Element.Fire && elemet2==Element.Air) || (element1== Element.Air && elemet2== Element.Fire))
return true;

if ((element1 == Element.Earth && elemet2== Element.Water) || (element1==Element.Water && elemet2== Element.Earth))
return true;



return false;
    }// end CompareElements method 





} // end CompatibilityCalculator class 
