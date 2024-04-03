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
	        assertEquals("Guest not found", manager.readGuestRecord(1));
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