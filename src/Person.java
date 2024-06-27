public class Person {
    public static void main(String[] args) {
        System.out.println("i am out of the execution");
        Person mahesh = new Person();
        int numberofsteps = mahesh.walk();
        System.out.println("number of steps" + numberofsteps);
        }

        int walk() {
        {
                        System.out.println("I am in Walk Method");
                         int numberofsteps = 0;
                         for (int i = 1; i <= 10; i++) {
                          System.out.println("I am inside for loop"+i);
                            numberofsteps++;

                    }
            System.out.println("I am out of the loop");
            return numberofsteps;
        }
    }
}



