package continue_statement_exp;

public class Continue_statement_exp
{
    public static void main(String[] args) 
    {
        System.out.println("Odd numbers are.");
        int i;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("i= "+i);
        }
    }
}
