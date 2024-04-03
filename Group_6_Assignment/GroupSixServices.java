package Group_6_Assignment;



import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

import Group_6_Assignment.GroupSixServices;

public class GroupSixServices {
  
    private static Map<Integer, String> guestRecords = new HashMap<>();

    public void createGuestRecord(int id, String name) {
        guestRecords.put(id, name);
    }

    public String readGuestRecord(int id) {
        return guestRecords.getOrDefault(id, "Guest not found");
    }

    public void updateGuestRecord(int id, String newName) {
        if (guestRecords.containsKey(id)) {
            guestRecords.put(id, newName);
        }
    }
    public void deleteGuestRecord(int id) {
        guestRecords.remove(id);
    }

    public void displayAllGuestRecords() {
        System.out.println("All Guest Records:");
        for (Map.Entry<Integer, String> entry : guestRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GroupSixServices manager = new GroupSixServices();
        Scanner scanner = new Scanner(System.in);


        int createId = 0;
        String createName;
        int choice;
        do {
            System.out.println("\n1: Pig Latin Translator" +
                    "\n2: Hotel Guest Record Manager!"
                    + "\n3: Word Search"
                    + "\n4: Armstrong"
                    + "\n5: Link Shortner");
            System.out.print("\nChoice: " );
            choice = scanner.nextInt();
            switch (choice) {

                case 1:

                
                    break;

                case 2:
                    System.out.println("\n\nWelcome to the Hotel Guest Record Manager!");

                    do {
                        System.out.println("\n1: Create A Guest Record" +
                                "\n2: Update Existed user" +
                                "\n3: Delete User " +
                                "\n4: Display User");
                        System.out.print("\nChoice: " );
                        choice = scanner.nextInt();
                        switch (choice) {

                            case 1:

                                System.out.print("\nNumber of People: ");
                                choice = scanner.nextInt();
                                // Create a guest record
                                for (int i = 0; i < choice; i++) {
                                    System.out.print("Enter guest ID to create: ");
                                    createId = scanner.nextInt();
                                    scanner.nextLine(); // Consume newline
                                    System.out.print("Enter guest name: ");
                                    createName = scanner.nextLine();
                                    manager.createGuestRecord(createId, createName);
                                }
                                System.out.println("Guest Record Created: " + manager.readGuestRecord(createId));
                                break;
                            case 2:
                                // Update the guest record
                                System.out.print("Enter guest ID to update: ");
                                int updateId = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.print("Enter new guest name: ");
                                String updateName = scanner.nextLine();
                                manager.updateGuestRecord(updateId, updateName);
                                System.out.println("Guest Record Updated: " + manager.readGuestRecord(updateId));
                                break;
                            case 3:
                                // Delete the guest record
                                System.out.print("Enter guest ID to delete: ");
                                int deleteId = scanner.nextInt();
                                manager.deleteGuestRecord(deleteId);
                                System.out.println("Guest Record Deleted");


                                break;
                            case 4:
                                // Display all guest records
                                manager.displayAllGuestRecords();

                        }
                        
                    }while (choice!=0);
                    break;
                    
                case 3:
                	
                	break;
                	
                	
                case 4: 
                	
                	break; 
                case 5:
                	
            }

        }while (choice!=0);




    }}