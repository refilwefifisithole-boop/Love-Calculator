//Purpose: Stores the results of comparing two people.
package models;
public class CompatibilityResults {
    private BirthChart Partner1;
    private BirthChart Partner2;
    private boolean ElementCompatible;
    private double OverAllScore;
    private String CompatibilitySummary;

    // constructor
    public CompatibilityResults(BirthChart Partner1, BirthChart Partner2,
                                boolean ElementCompatible, double OverAllScore,
                                String CompatibilitySummary) {
        this.Partner1 = Partner1;
        this.Partner2 = Partner2;
        this.ElementCompatible = ElementCompatible;
        this.OverAllScore = OverAllScore;
        this.CompatibilitySummary = CompatibilitySummary;
    }

    // getters
    public BirthChart getPerson1() {
        return Partner1;
    }

    public BirthChart getPerson2() {
        return Partner2;
    }

    public boolean isElementsCompatible() {
        return ElementCompatible;
    }

    public double getOverallScore() {
        return OverAllScore;
    }

    public String getCompatibilitySummary() {
        return CompatibilitySummary;
    }

    @Override
    public String toString() {
        return "Compatibility Result:\n" +
               "  Overall Score: " + OverAllScore + "/100\n" +
               "  Summary: " + CompatibilitySummary + "\n" +
               "  Elements Compatible: " + ElementCompatible;
    }
}