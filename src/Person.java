public class Person {
    static int  wakeuptime ;
    byte a;
    float f;
    char c;
    double d;
    short s;
    long l;
    String h;
    //global variable or instance variable
    public static void main(String[] args)
    {
        int sleeptime=6;
        //System.out.println(earlywakeuptime);
        System.out.println(wakeuptime );
        System.out.println("start of execution");
        Person pavani=new Person();
        int numberofsteps=pavani.walk();
        System.out.println(numberofsteps);
    }
    int walk()
    {
        //System.out.println(sleeptime);
        int earlywakeuptime=5;//local variable
        System.out.println(a);
        System.out.println(f);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
        System.out.println(wakeuptime);
        System.out.println(earlywakeuptime);
        System.out.println("i am inside walk method");
        int numberofsteps=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("i am inside forloop:"+i);
            numberofsteps++;
            System.out.println(i);
        }
        System.out.println("i am out of forloop");
        return numberofsteps;
    }
}