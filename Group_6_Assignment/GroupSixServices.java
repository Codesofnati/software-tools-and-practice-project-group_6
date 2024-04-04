
package Group_6_Assignment;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GroupSixServices {
  
   
    
    public static String translateToPigLatin(String word) {
        char firstLetter = word.charAt(0);
        if (isVowel(firstLetter)) {
            return word + "way";
        } else {
            return word.substring(1) + firstLetter + "ay";
        }
    }

    public static boolean isVowel(char letter) {
        return "aeiouAEIOU".indexOf(letter) != -1;
    }
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

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == number;
    }
    public class LinkShortener {
        private Map<String, String> shortToLong = new HashMap<>();
        private Map<String, String> longToShort = new HashMap<>();

        public String shorten(String longUrl) {
            if (longToShort.containsKey(longUrl)) {
                return longToShort.get(longUrl);
            }

            String shortUrl = generateShortUrl();
            shortToLong.put(shortUrl, longUrl);
            longToShort.put(longUrl, shortUrl);
            return shortUrl;
        }
        public String expand(String shortUrl) {
            return shortToLong.getOrDefault(shortUrl, "Short URL not found.");
        }

        private String generateShortUrl() {
            // Generate a random short URL
            return "shorturl" + (int)(Math.random() * 1000);
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
                
                Scanner scann = new Scanner(System.in);


                System.out.println("Welcome to the Pig Latin Translator!");
                System.out.println("Enter a sentence to translate to Pig Latin:");

                String input = scann.nextLine();
                String[] words = input.split(" ");

                System.out.println("Translated to Pig Latin:");
                for (String word : words) {
                    System.out.print(translateToPigLatin(word) + " ");
                }
                
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


                  Scanner scannerr = new Scanner(System.in);

                    System.out.println("Enter a paragraph:");
                    String paragraph = scannerr.nextLine();

                    System.out.println("Enter the word you want to search for:");
                   
                    String word = scannerr.next();

                    if (paragraph.contains(word)) {
                        System.out.println("The word '" + word + "' was found in the paragraph.");
                    } else {
                        System.out.println("The word '" + word + "' was not found in the paragraph.");
                    }
                 
                  break;
                  
                  
                case 4: 
            

                    
                    System.out.print("Enter Any Number: ");// Change this number to check for different numbers

                    int number=scanner.nextInt();
                      if(isArmstrongNumber(number)) {
                          System.out.println(number + " is an Armstrong number.");
                      } else {
                          System.out.println(number + " is not an Armstrong number.");
                      }
                	
                	break; 
             
                case 5:
                    public static void main(String[] args) {
                    LinkShortener linkShortener = new LinkShortener();

                    String longUrl = "https://www.google.com";
                    String shortUrl = linkShortener.shorten(longUrl);
                    System.out.println("Shortened URL: " + shortUrl);

                    String expandedUrl = linkShortener.expand(shortUrl);
                    System.out.println("Expanded URL: " + expandedUrl);
                }
                  
            }

        }while (choice!=0);




    }}