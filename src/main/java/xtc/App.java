package xtc;
public class App 
{
    public static void main( String[] args )
    {
        var s = "Hello, Alexei";
        System.out.println(s);

        Tester tester = new Tester("Alexei", "Rubets", 3, 'B', 1420.2);
        System.out.printf(tester.showInfo("Alexei", "Rubets", 3, 'B', 42140.0));
        Tester.write();
    }

}
