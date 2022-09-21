import java.util.Scanner;
public class Datatypevalues {
    public static void main(String[] args) {
        System.out.print("Enter data type name = ");
        Scanner sc = new Scanner (System.in);
        String defaultValue = sc.nextLine();

        switch (defaultValue)  {

            case "int":
            System.out.println("default value is = 0");
            break;

            case "byte":
            System.out.println("default value is = 0");
            break;

            case "short":
            System.out.println("default value is = 0");
            break;

            case "float":
            System.out.println("default value is = 0.0f");
            break;

            case "double":
            System.out.println("default value is = 0.0d");
            break;

            case "char":
            System.out.println("default value is  = u0000 ");
            break;

            case "long":
            System.out.println("default value is = 0L");
            break;

            case "boolean":
            System.out.println("default value is = false");
            break;
        }

    }
}

    
