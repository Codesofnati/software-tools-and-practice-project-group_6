package Group_6_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Group_6_Assignment.GroupSixServices.LinkShortener;

class GroupSixServicesTest {

    @Test
      public void testCreateGuestRecord() {
      GroupSixServices manager = new GroupSixServices();
          manager.createGuestRecord(1, "Abebe Mare");
          assertEquals("Abebe Mare", manager.readGuestRecord(1));
      }

      @Test
      public void testUpdateGuestRecord() {
        GroupSixServices manager = new GroupSixServices();
          manager.createGuestRecord(1, "Abebe Mare");
          manager.updateGuestRecord(1, "Chane Gemeda");
          assertEquals("Chane Gemeda", manager.readGuestRecord(1));
         
      }

	    @Test
	    public void testDeleteGuestRecord() {
	    	GroupSixServices manager = new GroupSixServices();
	        manager.createGuestRecord(1, "Abebe Mare");
	        manager.deleteGuestRecord(1);
	        assertEquals("Guest not found", manager.readGuestRecord(1));
	    }
	    
      @Test
      void testWordFound() {
          String paragraph = "This is a sample paragraph for testing.";
          String word = "sample";
          assertTrue(paragraph.contains(word));
      }

      @Test
      void testWordNotFound() {
          String paragraph = "This is a sample paragraph for testing.";
          String word = "missing";
          assertFalse(paragraph.contains(word));
      }
      @Test
      void testIsArmstrongNumber() {
          // Test case for an Armstrong number
          assertTrue(GroupSixServices.isArmstrongNumber(153));

          // Test case for a non-Armstrong number
          assertFalse(GroupSixServices.isArmstrongNumber(123));

          // Additional test cases can be added here
    }
    
    
    @Test
    public void testTranslateToPigLatinStartingWithVowel() {
        String translated = GroupSixServices.translateToPigLatin("apple");
        assertEquals("appleway", translated);
    }

    @Test
    public void testTranslateToPigLatinStartingWithConsonant() {
        String translated = GroupSixServices.translateToPigLatin("hello");
        assertEquals("ellohay", translated);
    }
    @Test
    public void testIsVowel() {
        boolean result1 = GroupSixServices.isVowel('a');
        boolean result2 = GroupSixServices.isVowel('b');

        assertEquals(true, result1);
        assertEquals(false, result2);
    }
    


    private LinkShortener linkShortener;

    @BeforeEach
    void setUp() {
        linkShortener = new LinkShortener();
    }

    @Test
    void testShortenAndExpand() {
        String longUrl = "https://www.example.com";
        String shortUrl = linkShortener.shorten(longUrl);

        assertEquals(longUrl, linkShortener.expand(shortUrl));
    }

    @Test
    void testExpandNonexistentShortUrl() {
        String nonexistentShortUrl = "nonexistent";
        String expectedMessage = "Short URL not found.";

        assertEquals(expectedMessage, linkShortener.expand(nonexistentShortUrl));
    } 
}