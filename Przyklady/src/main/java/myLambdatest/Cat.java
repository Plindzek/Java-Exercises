package myLambdatest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Cat {

    private String name;
    private double weight;
    private double age;
    private Sex gender;
    enum Sex {HE, SHE}


    public void printCat() {
        System.out.println(this.toString());
    }






}