import java.sql.SQLOutput;

public class Utensil {

    public static void main(String[] args){

        Utensil bigPlate = new Utensil();
        int noOffruits = bigPlate.feedfood();
        System.out.println("Types of Fruits in plate is " +noOffruits);
    }
        public int feedfood(){
        int fruits=0;
        for(int i =1; i<=10; i++){
            System.out.println("I had plate with "+i);
            fruits++;
        }

        return fruits;
    }
}

