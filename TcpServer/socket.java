package socket;

import java.io.*;
import java.net.*;
import java.until.*;

public class scoket {
       public static void main(String[] args) throws IOException {
       	try (var s = new Socket("time-a.nist.gov",13);
			var in = new Scanner(s.getInputStream()))
	{
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
	}
       }
}       
