package Group_6_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	        assertEquals("Guest not  found", manager.readGuestRecord(1));
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
} 
    @Test
    public void testTranslateToPigLatinStartingWithVowel() {
        String translated = HotelGuestRecordManager.translateToPigLatin("apple");
        assertEquals("appleway", translated);
    }

    @Test
    public void testTranslateToPigLatinStartingWithConsonant() {
        String translated = HotelGuestRecordManager.translateToPigLatin("hello");
        assertEquals("ellohay", translated);
    }
    @Test
    public void testIsVowel() {
        boolean result1 = HotelGuestRecordManager.isVowel('a');
        boolean result2 = HotelGuestRecordManager.isVowel('b');

        assertEquals(true, result1);
        assertEquals(false, result2);
    }
    
    @Test
    void testShortenUrl() {
        LinkShortener linkShortener = new LinkShortener();

        // Test case for a valid URL
        String originalUrl = "https://www.example.com";
        String shortUrl = linkShortener.shortenUrl(originalUrl);
        assertNotNull(shortUrl);
        assertNotEquals(originalUrl, shortUrl);

        // Test case for an empty URL
        String emptyUrl = "";
        assertThrows(IllegalArgumentException.class, () -> linkShortener.shortenUrl(emptyUrl));

        // Additional test cases can be added here
    }

    @Test
    void testExpandUrl() {
        LinkShortener linkShortener = new LinkShortener();

        // Test case for expanding a shortened URL
        String originalUrl = "https://www.example.com";
        String shortUrl = linkShortener.shortenUrl(originalUrl);
        String expandedUrl = linkShortener.expandUrl(shortUrl);
        assertEquals(originalUrl, expandedUrl);

        // Test case for expanding an invalid shortened URL
        String invalidShortUrl = "invalid-short-url";
        assertThrows(IllegalArgumentException.class, () -> linkShortener.expandUrl(invalidShortUrl));

        // Additional test cases can be adde
        
        
}