/*Chubaasiny Eswararao
Date: 26th April 2024
Title : Inventory and Sales Management System for Retail Shop
*/

/*package retailSale; */

import java.util.Scanner;
import java.util.Arrays;


public class sale {
    
    public static void main(String[] args) 
    {
        Scanner abc = new Scanner(System.in);
        int choice;
        char cont;

        //3 brands (Padini |Uniqlo |Brands Outlet)
        String[] brand = { "Padini", "Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini",
                           "Padini", "Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini","Padini",
                           "Padini","Padini","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo",
                           "Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo","Uniqlo",
                           "Uniqlo","Uniqlo","Uniqlo","Uniqlo","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet",
                           "Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet",
                           "Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet",
                           "Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet","Brands Outlet",
                           "Brands Outlet","Brands Outlet"};
        
        //4 Types of T-Shirt (Polo |Long Sleeve |Half Sleeve |Long Sleeve)
        String[] type = {"Polo","Polo","Polo","Polo","Polo","Polo","Long Sleeve","Long Sleeve","Long Sleeve","Long Sleeve",
                         "Long Sleeve","Long Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve",
                         "Half Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve",
                         "Polo","Polo","Polo","Polo","Polo","Polo","Long Sleeve","Long Sleeve","Long Sleeve","Long Sleeve",
                         "Long Sleeve","Long Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve",
                         "Half Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve",
                         "Polo","Polo","Polo","Polo","Polo","Polo","Long Sleeve","Long Sleeve","Long Sleeve","Long Sleeve",
                         "Long Sleeve","Long Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve","Half Sleeve",
                         "Half Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve","Short Sleeve"};
                         
        String[] size = {"S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L",  //Padini
                         "S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L",  //Uniqlo
                         "S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L","S","S","M","M","L","L"}; //Brands Outlet
            
        String[] colour = {"White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black",   //Padini
                            "White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black",  //Padini
                            "White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black",  //Uniqlo
                            "White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black",  //Uniqlo
                            "White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black",  //Brands Outlet
                            "White", "Black", "White", "Black", "White", "Black","White", "Black", "White", "Black", "White", "Black"}; //Brands Outlet
        
        // INITIAL PRODUCT STOCK VARIABLE DECLARATION AND STOCK LIMIT BEFORE PURCHASE
        int[] stockProduct = {30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30,   //Padini
                              30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30,   //Uniqlo
                              30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30, 30, 30, 40, 40, 30, 30};  //Brands Outlet
        
        double[] price = {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, // padini
                          40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, // uniqlo
                          50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50}; // brands
       
        /*CART VARIABLE DECLARATION
          Initially I have assign the number into '0' because intially before purchase
          the cart are always empty*/
        int[] qtyProduct = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      

              
        //pass this value to admin

        // VARIABLE FOR MONTHLY REPORT
        int[] monthlySales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // VARIABLE FOR YEARLY REPORT
        int[] yearlySales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        do 
        {
            // Welcoming message
            System.out.println();
            System.out.printf("%130s %n","************************************************************");
            System.out.printf("%130s %n","**             Welcome to Urbanaura Clothing!             **");
            System.out.printf("%130s %n","************************************************************");
            System.out.println();
            System.out.println("Dear valued customer,");
            System.out.println();
            System.out.println("We are thrilled to welcome you to Urbanaura Clothing, your ultimate destination for stylish and affordable apparel. At Urbanaura, we pride ourselves on offering a curated selection of high-quality");
            System.out.println("clothing from renowned brands such as Padini, Uniqlo, and Brand Outlet.");
            System.out.println();
            System.out.println("Our collection features a variety of sizes to ensure the perfect fit for everyone, ranging from S to L. Plus, our prices are designed to be budget-friendly without compromising on style or quality.");
            System.out.println();
            System.out.println("Whether you're looking for classic polo shirts or trendy long sleeves, Urbanaura has you covered. Our designs come in timeless black and white, ensuring versatility and sophistication in every piece.");
            System.out.println();
            System.out.println("We are committed to providing you with a seamless shopping experience and exceptional customer service. Feel free to explore our collection and discover your signature style with Urbanaura Clothing.");
            System.out.println();
            System.out.println("Thank you for choosing Urbanaura Clothing. We look forward to serving you!");
            System.out.println();
            System.out.println("Warm regards,");
            System.out.println("URBANAURA CLOTHING.");
            System.out.println("******************************************************************************************************************************************************************************************************");
            System.out.println();

            System.out.println("Please select your user type:");
            System.out.println("1. Admin");
            System.out.println("2. Sales Staff");
            System.out.println("3. Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
 
            choice = abc.nextInt();

            while (choice < 1 || choice > 4) 
            {
                System.out.print("Invalid input. Please enter again (1-4): ");
                choice = abc.nextInt();
            }

            if (choice == 1) 
            {
                adminPage(brand,type,size,colour,stockProduct,price,qtyProduct, monthlySales, yearlySales);
            } 
            else if (choice == 2) 
            {
                salesStaffPage(brand,type,size,colour,stockProduct, price);                        
            } 
            else if (choice == 3) 
            {
                customerPage(brand,type,size,colour,stockProduct,price,qtyProduct,monthlySales,yearlySales);                       
            } 
            else // choice 4
            {
                System.out.println("End the program");
            }

            System.out.print("Return to login page (admin/sales staff/customer) ? : ");
            cont = abc.next().charAt(0);

        } while (cont == 'y' || cont == 'Y');

        System.out.println("End of entire program.");
    }

    ////////////////////
    ////////////////////
    
    private static void adminPage(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct, double[]price, int[]qtyProduct, int[] monthlySales, int[] yearlySales) 
    {
        Scanner abc = new Scanner(System.in);
        int choice;
        boolean cont = true; 
        String username, password; // Declare userType variable outside the loop
        boolean loggedIn = true; // Use to make a condition to check validity of the username and password
        
        // Arrays for usernames and passwords
        String[] adminUsernames = {"admin1", "admin2"};
        String[] adminPasswords = {"abc", "xyz"};

        do 
        {
            System.out.print("Enter your username: "); // Prompt admin enter username 
            username = abc.nextLine();
            System.out.print("Enter your password: "); // Prompt admin enter password
            password = abc.nextLine();

            // Loop to check validity of the admin username and password
            for (int i = 0; i < adminUsernames.length; i++) 
            {
                if (username.equals(adminUsernames[i]) && password.equals(adminPasswords[i])) 
                {
                    // Assign true to use for do while loop, it shows true username or password, can proceed to admin page
                    loggedIn = true; 
                    break; // break from this loop when found the correct username and password
                } 
                else 
                {
                    // Assign false to use for do while loop, it shows false username or password, need to reenter
                    loggedIn = false;                 }
            }

            if (loggedIn == false) 
            {
                System.out.println("Invalid admin name or password. Please enter again.");
            }

        } while (loggedIn == false); //Loop to prompt user reenter admin username and password

        do 
        {
            //Login successfully
            System.out.println();
            System.out.println("Welcome to the Admin Page!");
            System.out.println("Select an option:");
            System.out.println("1. Generate Monthly Report");
            System.out.println("2. Generate Yearly Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = abc.nextInt();

            /* Loop to check input of the user, if enter value other than 1-3, print invalid message 
               and prompt user to reenter choice until get a valid input*/
            while (choice != 1 && choice != 2 && choice != 3) 
            {
                System.out.print("Invalid input. Please enter a number (1-3) : ");
                choice = abc.nextInt();
            }

            if (choice == 1) 
            {
                // Monthly report
                generateMonthlyReport(brand,type,size,colour,stockProduct,price,qtyProduct,monthlySales);
                cont = true; // Assign true to continue in admin page
            } 
            else if (choice == 2) 
            {
                // Yearly report
                generateYearlyReport(brand,type,size,colour,stockProduct,price,qtyProduct,yearlySales,monthlySales);                 
                cont = true; // Assign true to continue in admin page
            }

            else // (choice == 3)
            {
                System.out.println("Exit from admin page ");
                cont = false; // Assign false not to continue in admin page
            }
            
        } while (cont == true); // Loop to continue in admin page
    }


    /////////////////////
    /////////////////////
    
    private static void salesStaffPage(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,
                                     double[]price) 
    {
        Scanner abc = new Scanner(System.in);
        int choice;
        boolean cont,loggedIn = true;
        String username, password; // Declare userType variable outside the loop
        
        String[] salesStaffUsernames = {"salesstaff1", "salesstaff2"};
        String[] salesStaffPasswords = {"abc", "xyz"};

        do 
        {
            System.out.print("Enter your username: ");
            username = abc.nextLine();
            System.out.print("Enter your password: ");
            password = abc.nextLine();

            for (int i = 0; i < salesStaffUsernames.length; i++) 
            {
                if (username.equals(salesStaffUsernames[i]) && password.equals(salesStaffPasswords[i])) 
                {
                    loggedIn = true;
                    break; // break from this loop when found the correct username and password
                } 
                else 
                {
                    loggedIn = false;
                }
            }

            if (loggedIn == false) 
            {
                System.out.println("Invalid admin name or password. Please enter again.");
            }

        } while (loggedIn == false);

        do 
        {
            // Login successfully
            System.out.println();
            System.out.println("Welcome to the Sales Staff Page!");
            System.out.println("Select an option:");
            System.out.println("1. Display Updated Stock");
            System.out.println("2. Update Available Stocks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = abc.nextInt();

            while (choice != 1 && choice != 2 && choice != 3) 
            {
                System.out.print("Invalid input. Please enter a number (1-3) : ");
                choice = abc.nextInt();
            }

            if (choice == 1) 
            {
                // viewProduct
                AvailabilityTShirt(brand,type,size,colour,stockProduct,price);
                cont = true;
            } 
            else if (choice == 2) 
            {
                updateNewStock(stockProduct); 
                cont = true;
            }

            else // (choice == 3)
            {
                System.out.println("Exit from sales staff page");
                cont = false;
            }

        } while (cont == true);
    }

    /////////////////////
    /////////////////////
    
    private static void customerPage(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,
                                     double[]price,int[]qtyProduct, int[] monthlySales, int[] yearlySales)                                                          
    {
        Scanner abc = new Scanner(System.in);
        int choice;
        boolean cont,loggedIn = true;
        String username, password; // Declare userType variable outside the loop
        
        //Assign 5 customers usernames and passwords
        String[] customerUsernames = {"customer1", "customer2", "customer3", "customer4", "customer5"};
        String[] customerPasswords = {"abc", "xyz", "000", "111", "222"};
        
        do 
        {
            System.out.print("Enter your username: ");
            username = abc.nextLine();
            System.out.print("Enter your password: ");
            password = abc.nextLine();
            
            for (int i = 0; i < customerUsernames.length; i++) 
            {
                if (username.equals(customerUsernames[i]) && password.equals(customerPasswords[i])) 
                {
                    loggedIn = true;
                    break; // break from this loop when found the correct username and password               
                } 
                else 
                {
                    loggedIn = false;
                }
            }

            if (loggedIn == false) 
            {
                System.out.println("Invalid admin name or password. Please enter again.");
            }

        } while (loggedIn == false);

        do 
        {
            //Login successfully
            System.out.println();
            System.out.println("Welcome to the Customer Page!");
            System.out.println("Select an option:");
            System.out.println("1. View Product");
            System.out.println("2. Purchase and Generate Purchasing Invoice");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = abc.nextInt();

            while (choice != 1 && choice != 2 && choice != 3) 
            {
                System.out.print("Invalid input. Please enter a number (1-3) : ");
                choice = abc.nextInt();
            }

            if (choice == 1) 
            {
                //ViewProduct
                AvailabilityTShirt(brand,type,size,colour,stockProduct,price);
                cont = true;
            } 
            else if (choice == 2) 
            { 
                //Purchase product and billing
                purchase(brand,type,size,colour,stockProduct,price,qtyProduct);
                bill (brand, type, size, colour, stockProduct, price, qtyProduct, monthlySales, yearlySales);
                cont = true;
            }
            else // (choice == 3)
            {
                //Exit
                System.out.println("Exit from customer page");
                cont = false;
            }
            
        } while (cont == true);
    }

    /////////////////////
    /////////////////////
    
    //METHOD TO VIEW PRODUCT
    public static void AvailabilityTShirt(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,double[]price)
    {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("|%-16s |%-20s |%-12s |%-12s |%-12s |%-12s |%n","BRAND ","TYPE OF T-SHIRT ","SIZE ","COLOUR ","QUANTITY ","PRICE ");
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Padini Polo details
        for(int i = 0; i <= 5; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }

        System.out.println("-------------------------------------------------------------------------------------------------");                                           
        
        //Padini Long Sleeve details
        for(int i = 6; i <= 11; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }

        System.out.println("-------------------------------------------------------------------------------------------------");     
        
        
        //Padini Half Sleeve details
        for(int i = 12; i <= 17; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
       
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Padini Short Sleeve details
        for(int i = 18; i <= 23; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
    
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Uniqlo Polo details
        for(int i = 24; i <= 29; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
      
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Uniqlo Long Sleeve details
        for(int i = 30; i <= 35; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
       
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Uniqlo Half Sleeve details
        for(int i = 36; i <= 41; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
      
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Uniqlo Short Sleeve details
        for(int i = 42; i <= 47; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
    
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Brands Outlet Polo details
        for(int i = 48; i <= 53; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
      
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Brands Outlet Long Sleeve details
        for(int i = 54; i <= 59; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
      
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Brands Outlet Half Sleeve details
        for(int i = 60; i <= 65; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
       
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        //Brands Outlet Short Sleeve details
        for(int i = 66; i <= 71; i++)
        {
           System.out.printf(" %-16s |%-20s |%-12s |%-12s |%-12s |%-2s %.2f %n", brand[i], type[i], size[i], colour[i],stockProduct[i], "RM ", price[i]);  
        }
       
        System.out.println("-------------------------------------------------------------------------------------------------");
    }


    /////////////////////
    /////////////////////
    
    //METHOD TO PURCHASE THE PRODUCT
    public static void purchase(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,double[]price,int[]qtyProduct)                                   
    {
        Scanner abc = new Scanner(System.in);
        int quantity;
        char option;

        do 
        {
            // CHOOSE BRAND
            System.out.println("Enter your brand (1=Padini, 2=Uniqlo, 3=Brands Outlet): ");
            int Brand = abc.nextInt();

            while (Brand != 1 && Brand != 2 && Brand != 3) 
            {
                System.out.println("Invalid input. Please enter (1-3):");
                Brand = abc.nextInt();
            }

            if (Brand == 1) 
            {

                // CHOOSE TYPE
                System.out.println("You chose Padini");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int Type = abc.nextInt();

                while (Type != 1 && Type != 2 && Type != 3 && Type != 4) 
                {
                    System.out.println("Invalid input. Please enter (1-4):");
                    Type = abc.nextInt();
                }

                if (Type == 1) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }
                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[0]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");         
                                quantity = abc.nextInt();
                            }

                            stockProduct[0] -= quantity; // CALCULATED to update the stock

                            qtyProduct[0] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else// (Colour == 2)
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[1]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");           
                                quantity = abc.nextInt();
                            }

                            stockProduct[1] -= quantity; // CALCULATED to update the stock

                            qtyProduct[1] += quantity; // CALCULATED to give the data to the bill section
                        }

                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[2]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");   
                                quantity = abc.nextInt();
                            }

                            stockProduct[2] -= quantity; // CALCULATED to update the stock

                            qtyProduct[2] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[3]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");        
                                quantity = abc.nextInt();
                            }

                            stockProduct[3] -= quantity; // CALCULATED to update the stock

                            qtyProduct[3] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }

                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[4]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[4] -= quantity; // CALCULATED to update the stock

                            qtyProduct[4] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[5]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");  
                                quantity = abc.nextInt();
                            }

                            stockProduct[5] -= quantity; // CALCULATED to update the stock

                            qtyProduct[5] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }

                } 
                else if (Type == 2) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[6]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");  
                                quantity = abc.nextInt();
                            }

                            stockProduct[6] -= quantity; // CALCULATED to update the stock

                            qtyProduct[6] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[7]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");          
                                quantity = abc.nextInt();
                            }

                            stockProduct[7] -= quantity; // CALCULATED to update the stock

                            qtyProduct[7] += quantity; // CALCULATED to give the data to the bill section
                        }

                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[8]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                     
                                quantity = abc.nextInt();
                            }

                            stockProduct[8] -= quantity; // CALCULATED to update the stock

                            qtyProduct[8] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[9]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");  
                                quantity = abc.nextInt();
                            }

                            stockProduct[9] -= quantity; // CALCULATED to update the stock

                            qtyProduct[9] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } 
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[10]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");     
                                quantity = abc.nextInt();
                            }

                            stockProduct[10] -= quantity; // CALCULATED to update the stock

                            qtyProduct[10] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[11]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                        
                                quantity = abc.nextInt();
                            }

                            stockProduct[11] -= quantity; // CALCULATED to update the stock

                            qtyProduct[11] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                } 
                else if (Type == 3) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[12]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");      
                                quantity = abc.nextInt();
                            }

                            stockProduct[12] -= quantity; // CALCULATED to update the stock

                            qtyProduct[12] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else// (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[13]) 
                            {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[13] -= quantity; // CALCULATED to update the stock

                            qtyProduct[13] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[14]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");             
                                quantity = abc.nextInt();
                            }

                            stockProduct[14] -= quantity; // CALCULATED to update the stock

                            qtyProduct[14] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else if (Colour == 2) 
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[15]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[15] -= quantity; // CALCULATED to update the stock

                            qtyProduct[15] += quantity; // CALCULATED to give the data to the bill section
                        }

                    } 
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[16]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");             
                                quantity = abc.nextInt();
                            }

                            stockProduct[16] -= quantity; // CALCULATED to update the stock

                            qtyProduct[16] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else if (Colour == 2) 
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[17]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");     
                                quantity = abc.nextInt();
                            }

                            stockProduct[17] -= quantity; // CALCULATED to update the stock

                            qtyProduct[17] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                } 
                else // (Type == 4)
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }
                    if (Size == 1) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[18]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[18] -= quantity; // CALCULATED to update the stock

                            qtyProduct[18] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[19]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                      
                                quantity = abc.nextInt();
                            }

                            stockProduct[19] -= quantity; // CALCULATED to update the stock

                            qtyProduct[19] += quantity; // CALCULATED to give the data to the bill section

                        }
                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[20]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                     
                                quantity = abc.nextInt();
                            }

                            stockProduct[20] -= quantity; // CALCULATED to update the stock

                            qtyProduct[20] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[21]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[21] -= quantity; // CALCULATED to update the stock

                            qtyProduct[21] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } 
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[22]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");        
                                quantity = abc.nextInt();
                            }

                            stockProduct[22] -= quantity; // CALCULATED to update the stock

                            qtyProduct[22] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[23]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");     
                                quantity = abc.nextInt();
                            }

                            stockProduct[23] -= quantity; // CALCULATED to update the stock

                            qtyProduct[23] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                }
            } 
            else if (Brand == 2) 
            {
                // CHOOSE TYPE
                System.out.println("You chose Padini");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int Type = abc.nextInt();

                while (Type != 1 && Type != 2 && Type != 3 && Type != 4) 
                {
                    System.out.println("Invalid input. Please enter (1-4):");
                    Type = abc.nextInt();
                }

                if (Type == 1) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }
                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[24]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");      
                                quantity = abc.nextInt();
                            }

                            stockProduct[24] -= quantity; // CALCULATED to update the stock

                            qtyProduct[24] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else// (Colour == 2)
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[25]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                      
                                quantity = abc.nextInt();
                            }

                            stockProduct[25] -= quantity; // CALCULATED to update the stock

                            qtyProduct[25] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[26]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");                                      
                                quantity = abc.nextInt();
                            }

                            stockProduct[26] -= quantity; // CALCULATED to update the stock

                            qtyProduct[26] += quantity; // CALCULATED to give the data to the bill section;

                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[27]) 
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");    
                                quantity = abc.nextInt();
                            }

                            stockProduct[27] -= quantity; // CALCULATED to update the stock

                            qtyProduct[27] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) 
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[28]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[28] -= quantity; // CALCULATED to update the stock

                            qtyProduct[28] += quantity; // CALCULATED to give the data to the bill section
                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[29]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[29] -= quantity; // CALCULATED to update the stock

                            qtyProduct[29] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }

                } 
                else if (Type == 2) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[30]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[30] -= quantity; // CALCULATED to update the stock

                            qtyProduct[30] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[31]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[31] -= quantity; // CALCULATED to update the stock

                            qtyProduct[31] += quantity; // CALCULATED to give the data to the bill section
                        }

                    } else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[32]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[32] -= quantity; // CALCULATED to update the stock

                            qtyProduct[32] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[33]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[33] -= quantity; // CALCULATED to update the stock

                            qtyProduct[33] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[34]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[34] -= quantity; // CALCULATED to update the stock

                            qtyProduct[34] += quantity; // CALCULATED to give the data to the bill section
                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[35]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[35] -= quantity; // CALCULATED to update the stock

                            qtyProduct[35] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                } else if (Type == 3) {
                    // CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[36]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[36] -= quantity; // CALCULATED to update the stock

                            qtyProduct[36] += quantity; // CALCULATED to give the data to the bill section

                        } else// (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[37]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[37] -= quantity; // CALCULATED to update the stock

                            qtyProduct[37] += quantity; // CALCULATED to give the data to the bill section
                        }

                    } else if (Size == 2) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[38]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[38] -= quantity; // CALCULATED to update the stock

                            qtyProduct[38] += quantity; // CALCULATED to give the data to the bill section

                        } else if (Colour == 2) {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[39]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[39] -= quantity; // CALCULATED to update the stock

                            qtyProduct[39] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[40]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[40] -= quantity; // CALCULATED to update the stock

                            qtyProduct[40] += quantity; // CALCULATED to give the data to the bill section

                        } else if (Colour == 2) {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[41]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[41] -= quantity; // CALCULATED to update the stock

                            qtyProduct[41] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                } else // (Type == 4)
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }
                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[42]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[42] -= quantity; // CALCULATED to update the stock

                            qtyProduct[42] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[43]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[43] -= quantity; // CALCULATED to update the stock

                            qtyProduct[43] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } else if (Size == 2) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[44]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[44] -= quantity; // CALCULATED to update the stock

                            qtyProduct[44] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[45]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[45] -= quantity; // CALCULATED to update the stock

                            qtyProduct[45] += quantity; // CALCULATED to give the data to the bill section
                        }
                    } else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[46]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[46] -= quantity; // CALCULATED to update the stock

                            qtyProduct[46] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[47]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[47] -= quantity; // CALCULATED to update the stock

                            qtyProduct[47] += quantity; // CALCULATED to give the data to the bill section
                            
                        }
                    }
                }
            } 
            else // (Brand == 3)
            {
                // CHOOSE TYPE
                System.out.println("You chose Padini");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int Type = abc.nextInt();

                while (Type != 1 && Type != 2 && Type != 3 && Type != 4) {
                    System.out.println("Invalid input. Please enter (1-4):");
                    Type = abc.nextInt();
                }

                if (Type == 1) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }
                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[48]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[48] -= quantity; // CALCULATED to update the stock

                            qtyProduct[48] += quantity; // CALCULATED to give the data to the bill section

                        } else// (Colour == 2)
                        {
                            // CHOOSE QUANTITY
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[49]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[49] -= quantity; // CALCULATED to update the stock

                            qtyProduct[49] += quantity; // CALCULATED to give the data to the bill section

                        }

                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[50]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[50] -= quantity; // CALCULATED to update the stock

                            qtyProduct[50] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[51]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[51] -= quantity; // CALCULATED to update the stock

                            qtyProduct[51] += quantity; // CALCULATED to give the data to the bill section
                        }
                    }
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[52]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[52] -= quantity; // CALCULATED to update the stock

                            qtyProduct[52] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[53]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[53] -= quantity; // CALCULATED to update the stock

                            qtyProduct[53] += quantity; // CALCULATED to give the data to the bill section

                        }
                    }

                } 
                else if (Type == 2) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[54]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[54] -= quantity; // CALCULATED to update the stock

                            qtyProduct[54] += quantity; // CALCULATED to give the data to the bill section


                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[55]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[55] -= quantity; // CALCULATED to update the stock

                            qtyProduct[55] += quantity; // CALCULATED to give the data to the bill section

                        }

                    } else if (Size == 2) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[56]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[56] -= quantity; // CALCULATED to update the stock

                            qtyProduct[56] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[57]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[57] -= quantity; // CALCULATED to update the stock

                            qtyProduct[57] += quantity; // CALCULATED to give the data to the bill section

                        }
                    } else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[58]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[58] -= quantity; // CALCULATED to update the stock

                            qtyProduct[58] += quantity; // CALCULATED to give the data to the bill section

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[59]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[59] -= quantity; // CALCULATED to update the stock

                            qtyProduct[59] += quantity; // CALCULATED to give the data to the bill section

                        }
                    }
                } 
                else if (Type == 3) 
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }

                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[60]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[60] -= quantity; // CALCULATED to update the stock

                            qtyProduct[60] += quantity; // CALCULATED to give the data to the bill section

                        } 
                        else// (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[61]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[61] -= quantity; // CALCULATED to update the stock

                            qtyProduct[61] += quantity; // CALCULATED to give the data to the bill section

                        }

                    } 
                    else if (Size == 2) 
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[62]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[62] -= quantity; // CALCULATED to update the stock

                            qtyProduct[62] += quantity; // CALCULATED to give the data to the bill section
                           

                        } else if (Colour == 2) {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[63]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[63] -= quantity; // CALCULATED to update the stock

                            qtyProduct[63] += quantity; // CALCULATED to give the data to the bill section
                            
                        }
                    } 
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[64]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[64] -= quantity; // CALCULATED to update the stock

                            qtyProduct[64] += quantity; // CALCULATED to give the data to the bill section
                            

                        } 
                        else if (Colour == 2) 
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[65]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[65] -= quantity; // CALCULATED to update the stock

                            qtyProduct[65] += quantity; // CALCULATED to give the data to the bill section
                            
                        }
                    }
                } 
                else // (Type == 4)
                {
                    // CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int Size = abc.nextInt();

                    while (Size != 1 && Size != 2 && Size != 3) {
                        System.out.println("Invalid input. Please enter (1-3):");
                        Size = abc.nextInt();
                    }
                    if (Size == 1) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[66]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[66] -= quantity; // CALCULATED to update the stock

                            qtyProduct[66] += quantity; // CALCULATED to give the data to the bill section
                            

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[67]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[67] -= quantity; // CALCULATED to update the stock

                            qtyProduct[67] += quantity; // CALCULATED to give the data to the bill section
                           
                        }
                    } else if (Size == 2) {
                        // CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[68]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[68] -= quantity; // CALCULATED to update the stock

                            qtyProduct[68] += quantity; // CALCULATED to give the data to the bill section
                            

                        } else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[69]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[69] -= quantity; // CALCULATED to update the stock

                            qtyProduct[69] += quantity; // CALCULATED to give the data to the bill section
                           
                        }
                    } 
                    else // (Size == 3)
                    {
                        // CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int Colour = abc.nextInt();

                        while (Colour != 1 && Colour != 2) {
                            System.out.println("Invalid input. Please enter (1-2):");
                            Colour = abc.nextInt();
                        }

                        if (Colour == 1) {
                            // CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[70]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[70] -= quantity; // CALCULATED to update the stock

                            qtyProduct[70] += quantity; // CALCULATED to give the data to the bill section


                        } 
                        else // (Colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            quantity = abc.nextInt();

                            // Limit product quantity
                            while (quantity < 0 || quantity > stockProduct[71]) {
                                System.out.println(
                                        "The quantity you've entered is invalid. Please enter another quantity: ");
                                quantity = abc.nextInt();
                            }

                            stockProduct[71] -= quantity; // CALCULATED to update the stock

                            qtyProduct[71] += quantity; // CALCULATED to give the data to the bill section

                        }
                    }
                }
            }
            do {
                System.out.println("Do you want to continue adding T-Shirt to your cart? (Y/N): ");
                option = abc.next().charAt(0);

                if (option != 'Y' && option != 'y' && option != 'N' && option != 'n') {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }

            } while (option != 'Y' && option != 'y' && option != 'N' && option != 'n');

        } while (option == 'Y' || option == 'y');
    }
    
    /////////////////////
    ////////////////////
    
    //METHOD TO UPDATE NEW STOCK
    public static void updateNewStock(int[] stockProduct)
    {
        Scanner abc = new Scanner(System.in);
        char option;

        do
        {
            //CHOOSE BRAND 
            System.out.println("Enter the brand (1=Padini, 2=Uniqlo, 3=Brands Outlet): ");
            int brand = abc.nextInt();
        
            while (brand != 1 && brand != 2 && brand != 3) 
            {
                System.out.println("Invalid input. Please enter (1-3):");
                brand = abc.nextInt();
            }
                
            if (brand == 1)
            {
                //CHOOSE TYPE
                System.out.println("You chose Padini");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int type = abc.nextInt();
                    
                while (type != 1 && type != 2 && type != 3 && type != 4) 
                {
                    System.out.println("Invalid input. Please enter (1-4):");
                    type = abc.nextInt();
                }
                    
                if (type == 1)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {                            
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                        
                        if (colour == 1)
                        {
                            //Add in stock QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the stock quantity: ");
                            int stock = abc.nextInt(); 
        
                            //Update product stock 
                            while (stock + stockProduct[0] < 0 || stock + stockProduct[0] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stockProduct[0] = abc.nextInt(); 
                            }
        
                            stockProduct[0] += stock;
                        }
                        else//(colour == 2)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 		
                            while (stock + stockProduct[1] < 0 || stock + stockProduct[1] > 30)
                            {
                                System.out.println("The quantity you've entered is invalid. Please enter another quantity: ");
                                stockProduct[1] = abc.nextInt(); 
                            }
        
                            stockProduct[1] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                       
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
        
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                            
                            //Update product stock 	
                            while (stock + stockProduct[2] < 0 || stock + stockProduct[2] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stockProduct[2] = abc.nextInt(); 
                            }
        
                            stockProduct[2] += stock;      
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[3] < 0 || stock + stockProduct[3] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[3] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
        
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                            
                            //Update product stock 	
                            while (stock + stockProduct[4] < 0 || stock + stockProduct[4] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[4] += stock;
                        }
                        else //(colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[5] < 0 || stock + stockProduct[5] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[5] += stock;
                        }
                    }
                }
                else if (type == 2)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
        
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[6] < 0 || stock + stockProduct[6] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[6] += stock;              
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[7] < 0 || stock + stockProduct[7] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[7] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[8] < 0 || stock + stockProduct[8] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[8] += stock;                   
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[9] < 0 || stock + stockProduct[9] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[9] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[10] < 0 || stock + stockProduct[10] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[10] += stock;     
                        }
                            
                        else //(colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[11] < 0 || stock + stockProduct[11] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[11] += stock;
                        }
                    }
                }
                else if (type == 3)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                    
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                            
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[12] < 0 || stock + stockProduct[12] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }

                            stockProduct[12] += stock;
                        }
                        else// (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[13] < 0 || stock + stockProduct[13] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }

                            stockProduct[13] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[14] < 0 || stock + stockProduct[14] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[14] += stock;              
                        }
                            
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[15] < 0 || stock + stockProduct[15] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[15] += stock; 
                        }
                    }
                    else //(size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[16] < 0 || stock + stockProduct[16] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[16] += stock;       
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                       
                            //Update product stock 	
                            while (stock + stockProduct[17] < 0 || stock + stockProduct[17] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[17] += stock;
                        }
                    }
                }    
                else // (type == 4)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                        
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                    
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose White");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[18] < 0 || stock + stockProduct[18] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[18] += stock;            
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[19] < 0 || stock + stockProduct[19] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[19] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[20] < 0 || stock + stockProduct[20] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[20] += stock;         
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[21] < 0 || stock + stockProduct[21] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
                            
                            stockProduct[21] += stock;          
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                       
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                               
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[22] < 0 || stock + stockProduct[22] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[22] += stock;    
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[23] < 0 || stock + stockProduct[23] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[23] += stock;
                        }
                    }
                }
            }    
            else if (brand == 2)
            {
                //CHOOSE TYPE
                System.out.println("You chose Uniqlo");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int type = abc.nextInt();
                   
                while (type != 1 && type != 2 && type != 3 && type != 4) 
                {
                    System.out.println("Invalid input. Please enter (1-4):");
                    type = abc.nextInt();
                }
                    
                if (type == 1)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                        
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                               
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[24] < 0 || stock + stockProduct[24] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[24] += stock;      
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[25] < 0 || stock + stockProduct[25] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[25] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[26] < 0 || stock + stockProduct[26] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[26] += stock;    
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[27] < 0 || stock + stockProduct[27] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[27] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[28] < 0 || stock + stockProduct[28] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[28] += stock;     
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[29] < 0 || stock + stockProduct[29] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                             stockProduct[29] += stock;
                        }
                    }
                }
                
                else if (type == 2)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[30] < 0 || stock + stockProduct[30] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[30] += stock;
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[31] < 0 || stock + stockProduct[31] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[31] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                       
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                               
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[32] < 0 || stock + stockProduct[32] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[32] += stock;   
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[33] < 0 || stock + stockProduct[33] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[33] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                      
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[34] < 0 || stock + stockProduct[34] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[34] += stock;
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[35] < 0 || stock + stockProduct[35] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[35] += stock;
                        }
                    }
                }
                else if (type == 3)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                       
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                       
                            //Update product stock 	
                            while (stock + stockProduct[36] < 0 || stock + stockProduct[36] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[36] += stock;         
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[37] < 0 || stock + stockProduct[37] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[37] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                      
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                               
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[38] < 0 || stock + stockProduct[38] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[38] += stock;
                        }
                        
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[39] < 0 || stock + stockProduct[39] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
     
                            stockProduct[39] += stock;
                        }
                    }
                        
                    else if (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[40] < 0 || stock + stockProduct[40] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[40] += stock;    
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[41] < 0 || stock + stockProduct[41] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[41] += stock;
                        }
                    }
                }
                else // (type == 4)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                        
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[42] < 0 || stock + stockProduct[42] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[42] += stock;              
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[43] < 0 || stock + stockProduct[43] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[43] += stock;
                        }
                    }
                        
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[44] < 0 || stock + stockProduct[44] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
                            
                            stockProduct[44] += stock;              
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[45] < 0 || stock + stockProduct[45] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[45] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[46] < 0 || stock + stockProduct[46] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[46] += stock;     
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[47] < 0 || stock + stockProduct[47] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[47] += stock;
                        }
                    }
                }
            }
            else // (brand == 3)
            {
                //CHOOSE TYPE
                System.out.println("You chose Brands Outlet");
                System.out.println("Enter your type (1=Polo, 2=Long Sleeve, 3=Half Sleeve, 4=Short Sleeve): ");
                int type = abc.nextInt();
                    
                while (type != 1 && type != 2 && type != 3 && type != 4) 
                {
                    System.out.println("Invalid input. Please enter (1-4):");
                    type = abc.nextInt();
                }
                                
                if (type == 1)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Polo");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[48] < 0 || stock + stockProduct[48] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[48] += stock;                 
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[49] < 0 || stock + stockProduct[49] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[49] += stock;
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[50] < 0 || stock + stockProduct[50] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[50] += stock;                             
                        }
                            
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[51] < 0 || stock + stockProduct[51] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[51] += stock;
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                               
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[52] < 0 || stock + stockProduct[52] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[52] += stock;    
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[53] < 0 || stock + stockProduct[53] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt();
                            }
        
                             stockProduct[53] += stock;    
                        }
                    }    
                }
                else if (type == 2)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Long Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                       
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                       
                            //Update product stock 	
                            while (stock + stockProduct[54] < 0 || stock + stockProduct[54] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[54] += stock;    
                        }    
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[55] < 0 || stock + stockProduct[55] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[55] += stock;    
                            }
                        }
                        else if (size == 2)
                        {
                            //CHOOSE COLOUR
                            System.out.println("You chose size M");
                            System.out.println("Enter your colour (1=White, 2=Black): ");
                            int colour = abc.nextInt(); 
                        
                            while (colour != 1 && colour != 2) 
                            {
                                System.out.println("Invalid input. Please enter (1-2):");
                                colour = abc.nextInt();
                            }
                                                
                            if (colour == 1)
                            {
                                //CHOOSE QUANTITY
                                System.out.println("You chose white");
                                System.out.println("Enter the quantity: ");
                                int stock = abc.nextInt(); 
                        
                                //Update product stock 	
                                while (stock + stockProduct[56] < 0 || stock + stockProduct[56] > 40)
                                {
                                    System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                    stock = abc.nextInt(); 
                                }
        
                                stockProduct[56] += stock;    
                            }
                            else // (colour == 2)
                            {
                                System.out.println("You chose Black");
                                System.out.println("Enter the quantity: ");
                                int stock = abc.nextInt(); 
                        
                                //Update product stock 	
                                while (stock + stockProduct[57] < 0 || stock + stockProduct[57] > 40)
                                {
                                    System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                    stock = abc.nextInt(); 
                                }
        
                                stockProduct[57] += stock;    
                            }
                        }
                        else // (size == 3)
                        {
                            //CHOOSE COLOUR
                            System.out.println("You chose size L");
                            System.out.println("Enter your colour (1=White, 2=Black): ");
                            int colour = abc.nextInt(); 
                        
                            while (colour != 1 && colour != 2) 
                            {
                                System.out.println("Invalid input. Please enter (1-2):");
                                colour = abc.nextInt();
                            }
                                                
                            if (colour == 1)
                            {
                                //CHOOSE QUANTITY
                                System.out.println("You chose white");
                                System.out.println("Enter the quantity: ");
                                int stock = abc.nextInt(); 
                        
                                //Update product stock 	
                                while (stock + stockProduct[58] < 0 || stock + stockProduct[58] > 30)
                                {
                                    System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                    stock = abc.nextInt(); 
                                }
       
                                stockProduct[58] += stock;                
                            }
                            else // (colour == 2)
                            {
                                System.out.println("You chose Black");
                                System.out.println("Enter the quantity: ");
                                int stock = abc.nextInt(); 
                        
                                //Update product stock 	
                                while (stock + stockProduct[59] < 0 || stock + stockProduct[59] > 30)
                                {
                                    System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                    stock = abc.nextInt(); 
                                }
       
                                stockProduct[59] += stock;    
                            }
                        }
                    }
                else if (type == 3)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Half Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                    
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[60] < 0 || stock + stockProduct[60] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
       
                            stockProduct[60] += stock;                                 
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[61] < 0 || stock + stockProduct[61] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[61] += stock;    
                        }
                        }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[62] < 0 || stock + stockProduct[62] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[62] += stock;      
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[63] < 0 || stock + stockProduct[63] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
       
                            stockProduct[63] += stock;    
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[64] < 0 || stock + stockProduct[64] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[64] += stock;                
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[65] < 0 || stock + stockProduct[65] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[65] += stock;    
                        }
                    }
                }
                else //(type == 4)
                {
                    //CHOOSE SIZE
                    System.out.println("You chose Short Sleeve");
                    System.out.println("Enter your size (1=S, 2=M, 3=L): ");
                    int size = abc.nextInt(); 
                        
                    while (size != 1 && size != 2 && size != 3) 
                    {
                        System.out.println("Invalid input. Please enter (1-3):");
                        size = abc.nextInt();
                    }
                                        
                    if (size == 1)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size S");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[66] < 0 || stock + stockProduct[66] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                                stockProduct[66] += stock;               
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[67] < 0 || stock + stockProduct[67] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[67] += stock;    
                        }
                    }
                    else if (size == 2)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size M");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[68] < 0 || stock + stockProduct[68] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[68] += stock;             
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[69] < 0 || stock + stockProduct[69] > 40)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[69] += stock;    
                        }
                    }
                    else // (size == 3)
                    {
                        //CHOOSE COLOUR
                        System.out.println("You chose size L");
                        System.out.println("Enter your colour (1=White, 2=Black): ");
                        int colour = abc.nextInt(); 
                        
                        while (colour != 1 && colour != 2) 
                        {
                            System.out.println("Invalid input. Please enter (1-2):");
                            colour = abc.nextInt();
                        }
                                                
                        if (colour == 1)
                        {
                            //CHOOSE QUANTITY
                            System.out.println("You chose white");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[70] < 0 || stock + stockProduct[70] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[70] += stock;                             
                        }
                        else // (colour == 2)
                        {
                            System.out.println("You chose Black");
                            System.out.println("Enter the quantity: ");
                            int stock = abc.nextInt(); 
                        
                            //Update product stock 	
                            while (stock + stockProduct[71] < 0 || stock + stockProduct[71] > 30)
                            {
                                System.out.println("The stock number you've entered is invalid. Please enter another stock number: ");
                                stock = abc.nextInt(); 
                            }
        
                            stockProduct[71] += stock;    
                        }
                    }
                }
            }
   
            do
            {
                System.out.println("Do you want to continue adding T-Shirt stocks? (Y/N): ");
                option = abc.next().charAt(0);
                    
                if(option != 'Y' && option != 'y' && option != 'N' && option != 'n')
                {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'."); 
                }
                    
            }while(option != 'Y' && option != 'y' && option != 'N' && option != 'n');
  
        }while (option == 'Y' || option == 'y');
    }

    ////////////////////
    ////////////////////
    
    //BILLING AND SALES
    //METHOD TO GENERATE INVOICE/BILL
    public static void bill (String[]brand, String[]type, String[]size, String[]colour, int[]stockProduct, double[]price, int[] qtyProduct, int[] monthlySales, int[] yearlySales)
    {
        System.out.printf("%90s %n","********************************************************************");
        System.out.printf("%90s %n","**                Thank you to Urbanaura Clothing!                **");
        System.out.printf("%90s %n","********************************************************************");

        // further details of the shop phonenumber etc
        System.out.println("==========================================================================================================");
        System.out.printf("%65s %n ","About our Shop");
        System.out.printf("%68s %n ","Main Street, City, Country");
        System.out.printf("%67s %n ","Phone No.: +60123456789");
        System.out.printf("%85s %n ","Facebook(Urbanaura): Urbanaura, Instagram(Urbanaura): @Urbanaura");
        System.out.printf("%80s %n ","Mon-Fri: 9am - 6pm, Sat: 9am - 3pm, Sun: Closed");
        System.out.printf("%65s %n ","10 Years of Operation");
        System.out.printf("%80s %n ","Available brands: Padini, Uniqlo, Brands Outlet");
        System.out.println("==========================================================================================================");
        System.out.println("Your Bill:");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        // not great at string format, may need to change
        // idCount is just listing multiple products, if ordered 5, itll list 1,2,3,4,5
        double subTotal = 0.0; // Initialize subTotal
        int idCount = 1;

        for(int i = 0; i <= 71; i++)
        {
            if (qtyProduct[i] > 0) 
            {
                double total = qtyProduct[i] * price[i];
                System.out.printf("%-2s %-15s %-15s %-2s %-7s %-3s %-1s %-3s %.2f %-8s %.2f %n",
                                 idCount,brand[i],type[i],size[i],colour[i],qtyProduct[i],"x","RM",price[i],"RM", total);            
                subTotal += total;
                idCount++;

                // Update monthly sales
                monthlySales[i] += qtyProduct[i];
                yearlySales[i] += monthlySales[i];
            }  
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");                
        System.out.printf("%-16s %.2f","Grand Total: RM ",subTotal);
        System.out.println();
 
        // Reset qtyProduct after billing
        for (int i = 0; i < qtyProduct.length; i++) 
        {
            qtyProduct[i] = 0;
        }
    }

    /////////////////////
    /////////////////////
    
    //SALES REPORT
    //METHOD TO GENERATE MONTHLY REPORT
    public static void generateMonthlyReport(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,
                                             double[]price, int[]qtyProduct, int[] monthlySales)
    {
        System.out.println();
        System.out.println("------------------------------------------ MONTHLY REPORT 2024 -------------------------------------------");
        System.out.println();
        System.out.println(" Month : January");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        double subTotal = 0.0; //Initial sale is 0
        int index = 0; //Sequence of the product sales
        
        //Loop to display the quantity product buy and calculate the Sub Total
        for(int i = 0; i < qtyProduct.length; i++)
        {
            if (monthlySales[i] > 0) 
            {
                index++;
                double total = monthlySales[i] * price[i]; 
                System.out.printf(" %-2s %-30s %-15s %-5s %-10s %-3s %-1s %4s %.2f %10s %.2f %n",
                                  index,brand[i],type[i],size[i],colour[i],monthlySales[i],"x","RM",price[i],"RM",total);
                subTotal += total; //Calculate the total sales
            }
        }
        
        System.out.printf("%n %-13s %-1s %.2f %n","Sub Total",": RM ",subTotal); 
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
    
    /////////////////////
    /////////////////////
    
    //METHOD TO GENERATE YEARLY REPORT
    public static void generateYearlyReport(String[]brand,String[]type,String[]size,String[]colour,int[]stockProduct,
                                            double[]price, int[]qtyProduct, int[] yearlySales, int[] monthlySales) 
    {
        System.out.println();
        System.out.println("------------------------------------------ YEARLY REPORT 2024 --------------------------------------------");
        System.out.println();
        System.out.println(" Year : 2024");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        double subTotal = 0.0; //Initial sale is 0
        int index = 0; //Sequence of the product sales

        //Loop to display the quantity product buy and calculate the Sub Total
        for(int i = 0; i < qtyProduct.length; i++)
        {
            if (yearlySales[i] > 0) 
            {
                index++;
                double total = monthlySales[i] * price[i];
                System.out.printf(" %-2s %-30s %-15s %-5s %-10s %-3s %-1s %4s %.2f %10s %.2f %n",
                                  index,brand[i],type[i],size[i],colour[i],monthlySales[i],"x","RM",price[i],"RM", total);
                subTotal += total;  //Calculate the total sales
            }
        }
            
        System.out.printf("%n %-13s %-1s %.2f %n","Sub Total",": RM ",subTotal);
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }      

}
