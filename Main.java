/**
 * DataStructure to add
 * Queue
 * Stack
 * List - ArrayList, LinkedList
 * Set - HashSet, Linked-HashSet, TreeSet.
 * Map - HashMap, TreeMap
 */
import java.util.*;
class Main
{

    //  Static variables and Scanner object for input.
    static Scanner scan = new Scanner (System.in);
    static int main_choice, size;
    static String datatype;
    static String datastructure;
    static boolean condition = true;
    

    // Method for main-menu choice input.
    public static void main_menu()
    {
        // Try and catch for in case user enter a invalid character 
        while (true)
       { 
            try{
                
                System.out.println("--------------------Main Menu--------------------");
                System.out.println("\n\t\tEnter 1: For List");
                System.out.println("\t\tEnter 2: For Map");
                System.out.println("\t\tEnter 3: For Queue");
                System.out.println("\t\tEnter 4: For Set");
                System.out.println("\t\tEnter 5: For Stack");
                System.out.println("\t\tEnter 0: To Exit");

                main_choice = Integer.parseInt(scan.nextLine().trim());
                break;
            }
            catch(Exception e)
            {
                System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n");
                continue;
            }
        }
        data_structure();
    }

    
    // Function to input of the type of DS and the size of the ds

    public static void size_and_datatype()
    {
        boolean conti = false;
        while (true)
        {
            System.out.println("Enter :\tS for String, I for Integer, D for Double, 0 To Go Back To Main Menu\n\nChoose the Datatype of the "+datastructure);
            datatype =  scan.nextLine().trim().toLowerCase();
            System.out.println(datatype);
            if (datatype.equals("s") || datatype.equals("i") || datatype.equals("d"))
            {
                conti = true;
                break;
            }
            else if(datatype.equals("0"))
            {
                main_menu();
                break;
            }
            else{
                System.out.println("INVALID DATATYPE!! TRY AGAIN\n");
                continue;
            }
        }
        while (conti)
        {    
            System.out.println("Enter the size of "+datastructure+" (1-20)");     
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

    public static void data_structure()
    {
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
                    System.out.println("--------------------List--------------------");
                    System.out.println("\n\t\tEnter 1: For ArrayList");
                    System.out.println("\t\tEnter 2: For LinkedList");
                    System.out.println("\t\tEnter 0: For Back To Main Menu");
                    int choice = Integer.parseInt(scan.nextLine().trim());
                    switch (choice)
                    {
                        case 0:
                        {
                            System.out.println("\t    ----Back To Main Menu----\n");
                            main_menu();
                        }break;
                        case 1:
                        {
                            datastructure = "ArrayList";
                            size_and_datatype();
                        }break;
                        case 2:
                        {
                            datastructure = "LinkedList";
                            size_and_datatype();
                        }break;
                        default:
                        {
                            System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n"); 
                        }
                    }
                } break;

                case 2:
                {
                    System.out.println("--------------------Map--------------------");
                    System.out.println("\n\t\tEnter 1: For HashMap");
                    System.out.println("\t\tEnter 2: For TreeMap");
                    System.out.println("\t\tEnter 0: For Back To Main Menu");
                    int choice = Integer.parseInt(scan.nextLine().trim());
                    switch(choice)
                    {
                        case 0:
                        {
                            System.out.println("\t    ----Back To Main Menu----\n");
                            main_menu();
                        }break;
                        case 1:
                        {
                            datastructure = "HaspMap";
                            size_and_datatype();
                        }break;
                        case 2:
                        {
                            datastructure = "TreeMap";
                            size_and_datatype();
                        }break;
                        default:
                        {
                            System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n"); 
                        }
                    }
                    
                } break;

                case 3:
                {

                    System.out.println("--------------------Queue--------------------");
                    datastructure = "Queue";
                    size_and_datatype();

                } break;

                case 4:
                {
                    System.out.println("--------------------Set--------------------");
                    System.out.println("\n\t\tEnter 1: For HashSet");
                    System.out.println("\t\tEnter 2: For Treeset");
                    System.out.println("\t\tEnter 3: For LinkedHashSet");
                    System.out.println("\t\tEnter 0: For Back To Main Menu");   
                    int choice = Integer.parseInt(scan.nextLine().trim());
                    switch(choice)
                    {
                        case 0:
                        {
                            System.out.println("\t    ----Back To Main Menu----\n");
                            main_menu();
                        }break;
                        case 1:
                        {
                            datastructure = "HashSet";
                            size_and_datatype();
                        }break;
                        case 2:
                        {
                            datastructure = "TreeSet";
                            size_and_datatype();
                        }break;
                        case 3:
                        {
                            datastructure = "LinkedHashSet";
                            size_and_datatype();
                        }break;
                        default:
                        {
                            System.out.println("INVALID CHOICE!, ENTER A VALID NUMBER. \n"); 
                        }
                    }
                } break;

                case 5:
                {
                    System.out.println("--------------------Stack--------------------");
                    datastructure = "Stack";
                    size_and_datatype();
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


    public static void main(String[] args) {
        
        // Initial Start Menu 
        main_menu();
    }
}