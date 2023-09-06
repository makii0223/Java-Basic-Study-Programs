// Here is the code related to the do-while loop for menu selection
// #Java Basic Code Command
// Mayank Singh 
// Connect with me you using Github @makii0223, Discord @makii0223
public class menu_selection 
{
    public static void main(String args[])
    throws java.io.IOException
    {
        char choice;
        do
        {
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for \n");
            System.out.println("choose one");
            choice = (char) System.in.read();
        }while(choice <'1' || choice >'5');
    System.out.println("\n");

    switch(choice)
    {
        case '1':
            System.out.println("The if : \n");
            System.out.println("if(conditon) statement;");
            System.out.println("else statement;");
        break;
        case '2':
            System.out.println("the switch :\n");
            System.out.println("switch(expression){");
            System.out.println("case constant :");
            System.out.println("statement sequence");
            System.out.println("break ;");
            System.out.println("//......");
            System.out.println("}");
        break;
        case '3':
            System.out.println("The While:\n");
            System.out.println("while(condition) statement;");
        break;
        case '4':
            System.out.println("The Do-While: \n");
            System.out.println("do{");
            System.out.println("statement");
            System.out.println("}while(condition);");
        break;
        case '5':
            System.out.println("The for: \n");
            System.out.println("for(init;condition;iteration)");
            System.out.println("statement;");
        break;
    }
    }
}