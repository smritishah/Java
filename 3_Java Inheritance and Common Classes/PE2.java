import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Get calendar set to current date and time
		Calendar c = Calendar.getInstance();

		// Set the calendar to monday of the current week
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

		// Print dates of the current week starting on Monday
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println("First day of week: "+ df.format(c.getTime()));
		c.add(Calendar.DATE, 6);
		System.out.println("Last day of week: "+ df.format(c.getTime()));
	}
}
