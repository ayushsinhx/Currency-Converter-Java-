import java.util.Scanner;

public class Currency {
    public static void print_detail()
    {
        System.out.println("1. INR To DOLLAR\n 2. INR To EURO\n 3. INR To SWISS FRANCE\n 4. INR To POUND STERLING\n 5. INR To GIBRALTAR POUND");
    }
    public static void main(String[] args) {
        float takeNumber;
        float result;
        System.out.println("\nWelcome To The Currency Converter Concept");
        print_detail();
        System.out.println("Select Any One Of Them: ");
        Scanner sc=new Scanner(System.in);
        int takeInput;
        takeInput=sc.nextInt();
        switch (takeInput) {
            case 1:
                System.out.println("Enter Rupees To Covert INR To DOLLAR");
                takeNumber=sc.nextFloat();
                result=(float) (takeNumber* 0.011);
                System.out.printf("%2f INR is Equal to %.2f DOLLAR %n", takeNumber,result);
                break;
                case 2:
                System.out.println("Enter Rupees To Covert INR To EURO");
                takeNumber=sc.nextFloat();
                result=(float) (takeNumber* 0.011);
                System.out.printf("%2f INR is Equal to %.2f EURO %n", takeNumber,result);
                break;
                case 3:
                System.out.println("Enter Rupees To Covert INR To SWISS FRANCE");
                takeNumber=sc.nextFloat();
                result=(float) (takeNumber* 0.010);
                System.out.printf("%2f INR is Equal to %.2f SWISS FRANCE %n", takeNumber,result);
                break;
                case 4:
                System.out.println("Enter Rupees To Covert INR To POUND STERLING");
                takeNumber=sc.nextFloat();
                result=(float) (takeNumber* 0.0095);
                System.out.printf("%2f INR is Equal to %.2f POUND STERLING %n", takeNumber,result);
                break;
               case 5:
                System.out.println("Enter Rupees To Covert INR To GIBRALTAR POUND");
                takeNumber=sc.nextFloat();
                result=(float) (takeNumber* 0.00969);
                System.out.printf("%2f INR is Equal to %.2f GIBRALTAR POUND %n", takeNumber,result);
                break;
        
        
            default:
            System.out.println("OOPS SomeThing Went Wrong May Be You Entered Invalid Input");
                break;
        }
    }
}
