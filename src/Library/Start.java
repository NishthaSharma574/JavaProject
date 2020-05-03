package Library;

import java.io.*;

public class Start {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Service service = new BookService();
        while (true)
        {
            System.out.println("LIBRARY MANAGEMENT SYSTEM");
            System.out.println("To perform create operation : press 1");
            System.out.println("To perform Read operation : press 2");
            System.out.println("To perform delete operation : press 3");
            System.out.println("To Perform Update operation : press 4");
            System.out.println("Exit Library Management Project : press 5");

            System.out.println("\t \t Print Number");

            int ans =(Integer.parseInt(br.readLine().trim()));
            int id ;
            String name;
            String name2;

            switch(ans)
            {
                case 1:
                     service.create();
                     break;

                case 2:
                      service.viewAll();
                      break;

                case 3:
                      service.delete();
                       break;

                case 4:
                      service.update();
                      break;

                case 5:
                       System.out.println("Exiting Project");
                      break;

                default:
                      System.out.println("  " +  "Please Enter Valid key from 1 to 5"  + " ");
                       break;
            }

        }
    }
    }

