//Purpose: Represents one person in the compatibility calculation.
package models;
import java.time.LocalDate;

public class Person {
    private String Name;
    private LocalDate BirthDate;
    private BirthChart birthChart;
    private int lifePathNumber;

 public Person(String name, LocalDate birthDate, BirthChart birthChart,int lifePathNumber) {
        this.Name = name;
        this.BirthDate = birthDate;
        this.birthChart = birthChart;
        this.lifePathNumber = lifePathNumber;
    }

public String getName() {
    return Name;
}

public void setName(String name) {
    this.Name = name;
}

public LocalDate getBirthDate() {
    return BirthDate;
}

public void setBirthDate(LocalDate birthDate) {
    this.BirthDate = birthDate;
}

public BirthChart getBirthChart() {
    return birthChart;
}

public void setBirthChart(BirthChart birthChart) {
    this.birthChart = birthChart;
}
public int getLifePathNumber(){
    return lifePathNumber;
}
public void setlifepathNumber(int lifePathNumber){
    this.lifePathNumber = lifePathNumber;
}

@Override
public String toString() {
    return "Person{" +
           "name='" + Name + '\'' +
           ", birthDate=" + BirthDate +
           ", birthChart=" + birthChart + 
           ",life Path Number=" + lifePathNumber +
           '}';
}

}
