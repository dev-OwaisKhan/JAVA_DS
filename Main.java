import java.util.*;
class Main
{

    //  Static variables and Scanner object for input.
    static Scanner scan = new Scanner (System.in);
    static int main_choice, size;
    static String datatype;
    static boolean condition = true;
    

    // Method for main-menu choice input.
    public static void main_menu()
    {
        // Try and catch for in case user enter a invalid character 
        while (true)
       { 
            try{
                
                System.out.println("--------------------Main Menu--------------------");
                System.out.println("               Enter 1: For Array");
                System.out.println("               Enter 2: For Array-List");
                System.out.println("               Enter 3: For Linked-List");
                System.out.println("               Enter 4: For Queue");
                System.out.println("               Enter 5: For Stack");
                System.out.println("               Enter 0: To Exit");

                main_choice = Integer.parseInt(scan.nextLine().trim());
                break;
            }
            catch(Exception e)
            {
                System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n");
                continue;
            }
        }
    }

    
    // Function to input of the type of DS and the size of the ds

    public static void size_datatype(String ds)
    {
       
        while (true)
        {
            System.out.println("Enter :\tS for String, I for Integer, D for Double\n\nChoose the Datatype of the "+ds);
            datatype =  scan.nextLine().trim().toLowerCase();
            System.out.println(datatype);
            if (datatype.equals("s") || datatype.equals("i") || datatype.equals("d"))
            {
                break;
            }
            else{
                System.out.println("INVALID DATATYPE!! TRY AGAIN\n");
                continue;
            }
        }
        while (true)
        {    
            System.out.println("Enter the size of "+ds+" (1-20)");     
            try
            {
                size = Integer.parseInt(scan.nextLine().trim());
                if (size < 1 || size > 20)
                {
                    System.out.println("INVALID SIZE ENTER!! TRY AGAIN\n");
                    continue;
                }
                else 
                {
                    break;
                }

            }catch(Exception e)
            {
                System.out.println("INVALID SIZE ENTER!! TRY AGAIN\n");
            }
        }
    }



    public static void main(String[] args) {
        
        // Initial Start Menu 
        main_menu();
        while (condition)
        {
                switch (main_choice)
            {
                case 0:
                {
                    System.out.println("\n\t\t-----Exit-----");
                    break;
                }

                case 1:
                {
                    size_datatype("Array");

                } break;

                case 2:
                {
                    size_datatype("Array-List");
                } break;

                case 3:
                {

                    size_datatype("Linked-List");

                } break;

                case 4:
                {
                    size_datatype("Queue");
                } break;

                case 5:
                {
                    size_datatype("Stack");
                } break;

                default:
                {
                    System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n");
                    main_menu();
                }
            }
            break;

        }
        

    }
}