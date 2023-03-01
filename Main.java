import java.util.*;
class Main
{

    static Scanner scan = new Scanner (System.in);
    static int main_choice;

    public static void main_menu()
    {
        try{
            
            System.out.println("--------------------Main Menu--------------------");
            System.out.println("               Enter 1: For Array");
            System.out.println("               Enter 2: For Array-List");
            System.out.println("               Enter 3: For Linked-List");
            System.out.println("               Enter 4: For Queue");
            System.out.println("               Enter 5: For Stack");
            System.out.println("               Enter 0: To Exit");

            main_choice = scan.nextInt();
        }
        catch(Exception e)
        {
            main_choice = 6;
        }
    }

    public static void main(String[] args) {
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

            } break;
            case 4:
            {

            } break;
            case 5:
            {

            } break;
            default:
            {
                System.out.println("!!INVALID CHOICE, Enter a valid Number");
                main_menu();
            }


        }

    }
}