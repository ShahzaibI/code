/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_statement_exp;
import java.util.Scanner;

/**
 *
 * @author Shahzaib Islam
 */
public class Switch_statement_exp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int day;
        Scanner in = new Scanner(System.in);
        
        boolean x=true;
        while(x==true)
        {
            System.out.print("Enter one day:");
            day=in.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Monday");
                    x=false;
                    break;
                case 2:
                    System.out.println("Tusday");
                    x=false;
                    break;
                case 3:
                    System.out.println("Wednesday");
                    x=false;
                    break;
                case 4:
                    System.out.println("Thursday");
                    x=false;
                    break;
                case 5:
                    System.out.println("Friday");
                    x=false;
                    break;
                case 6:
                    System.out.println("Saturday");
                    x=false;
                    break;
                case 7:
                    System.out.println("Sunday");
                    x=false;
                    break;
                default:
                    System.out.println("You enter Wrong number please enter number in ranga 1 to 7");
            }
        }
    }
    
}
