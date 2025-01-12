import java.util.Scanner;
public class ConceptJAVA {
    public static void main(String[] args) {
        // * Variable
        // ! type variableName = value;
        char _one = 'J';
        String _str = "osepha";
        int This_Integer = 3;
        float This_Float = 1.66f; // ต้องมี f
        double This_Double = 3.3456456;
        final int Const = 15; // final = const

        // * Print OUTPUT
        // print
        System.out.print(_one);
        // println
        System.out.println(_str);
        System.out.println(This_Integer + Const + This_Double);
        // printf
        System.out.printf("Float ไม่สามารถบวก + Double Flaot = %f ", This_Float);

        // todo [Widening Casting] Automatic Cast
        // Widening Casting (automatically) - converting a smaller type to a larger type
        // size
        // ?byte -> short -> char -> int -> long -> float -> double
        int my_Int = 10;
        double my_Double = my_Int; // Automatic casting: int to double

        System.out.println(my_Int); // Outputs 10
        System.out.println(my_Double); // Outputs 10.0

        // todo [Narrowing Casting] Manual Cast
        // Narrowing Casting (manually) - converting a larger type to a smaller size
        // type
        // ?double -> float -> long -> int -> char -> short -> byte
        double my__Double = 9.21d;
        long my__long = (long) my__Double; // Manual casting: double to long

        System.out.println(my__Double); // Outputs 9.21
        System.out.println(my__long); // Outputs 9

        // ? String
        String alphabetic = "AbCDEFGHiJKLMNOPQRSTUVWXyz";
        System.out.println("The length of the txt string is: " + alphabetic.length());
        System.out.println(alphabetic.toUpperCase());
        System.out.println(alphabetic.toLowerCase());
        System.out.println(alphabetic.indexOf("G"));

        String str12 = "12";
        int int12 = 20;
        String ConcateStr = str12 + int12; // will be 1220 (a String)
        System.out.println(ConcateStr);

        // ? Math
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.printf("Random number is %d\n", randomNum);

        // * Array
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println("Array of cars = " + cars[0] + " " + cars[2]);

        // * Method Calling
        myMethod("JAVA", 69, " -->");

        // Return Method Calling
        int CallRetrun = ReturnMethod(54, 56);
        System.out.println("Calling Retrun = " + CallRetrun);

        // Overloading
        int PmyNum1 = plusMethod(88, 75);
        double PmyNum2 = plusMethod(64.3, 36.26);
        System.out.println("int: " + PmyNum1);
        System.out.println("double: " + PmyNum2);

        // * Scanner
        Scanner myS = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myS.nextLine();
        System.out.println("Username is: " + userName);

    }

    // * Methods
    static void myMethod(String lang, int numoflang, String arrowkak) {
        System.out.println(lang + " kak" + arrowkak + " " + numoflang + " times");
    }

    // Retrun Method
    static int ReturnMethod(int xr, int yr) {
        return xr + yr;
    }

    // Overloading Method
    static int plusMethod(int xp, int yp) {
        return xp + yp;
    }

    static double plusMethod(double xp, double yp) {
        return xp + yp;
    }

}
