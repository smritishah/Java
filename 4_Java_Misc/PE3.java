import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PE3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
			InputStream input = new BufferedInputStream(new FileInputStream("file.txt"));
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("File not found");
			System.out.println("Msg from catch block");
		}
		finally {
			System.out.println("Msg from final block");
		}
	}
}
