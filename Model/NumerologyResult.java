//Purpose: Stores numerology information.

public class NumerologyResult {
    private int lifePathNumber;
    private String description;
    private int destinyNumber;  

    public NumerologyResult() {
    }

    public NumerologyResult(int lifePathNumber, String description, int destinyNumber) {
        this.lifePathNumber = lifePathNumber;
        this.description = description;
        this.destinyNumber = destinyNumber;
    }

    //getters 
    public int getLifePathNumber() {
        return lifePathNumber;
    }
    public String getDescription() {
        return description;
    }
    public int getdestinyNumber(){
        return destinyNumber;
    }
// tostring
@Override
public String toString() {
    return "NumerologyResult{" +
           "lifePathNumber=" + lifePathNumber +
           ", destinyNumber=" + destinyNumber +
           ", description='" + description + '\'' +
           '}';
}
    public static void main(String[] args) {
        // Candidate main method
    }// end main
}// end class