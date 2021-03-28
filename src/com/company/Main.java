package com.company;

public class Main {

    public static void main(String[] args) {
        
        // instantiating a new object
        Features obj = new Features();
        obj.insertItems();

        do {
            obj.showMenu();
            int option = obj.getOption();



            // user input
            if (option == 1)
                obj.viewItems();
            else if (option == 2)
                obj.addItem();
            else if (option == 3)
                obj.deleteItem();
            else if (option == 4) {
                System.out.println("Exiting.... ");
                break;
            }
        } while(true);
    }
}
