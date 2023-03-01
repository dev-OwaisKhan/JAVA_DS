import java.util.*;
class Main
{

    //  Static variables and Scanner object for input.
    static Scanner scan = new Scanner (System.in);
    static int main_choice;

    // Method for main-menu choice input.
    public static void main_menu()
    {
        // Try and catch for in case user enter a invalid character 
        try{
            
            System.out.println("--------------------Main Menu--------------------");
            System.out.println("               Enter 1: For Array");
            System.out.println("               Enter 2: For Array-List");
            System.out.println("               Enter 3: For Linked-List");
            System.out.println("               Enter 4: For Queue");
            System.out.println("               Enter 5: For Stack");
            System.out.println("               Enter 0: To Exit");

            main_choice = Integer.parseInt(scan.nextLine().trim());
        }
        catch(Exception e)
        {
            main_choice = 6;
        }
    }

    public static void main(String[] args) {
        
        // Initial 
        main_menu();
        switch (main_choice)
        {
            case 0:
            {

            } break;

            case 1:
            {

            } break;

            case 2:
            {

            } break;

            case 3:
            {

                System.out.println("CASE3");

            } break;

            case 4:
            {

            } break;

            case 5:
            {

            } break;

            default:
            {
                System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n");
                main_menu();
            }


        }

    }
}