package advanced;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Networking {

	public static void main(String[] args) {
		
		String sito = "http://www.mauro.bogliaccino.it/public/java/spring";
		
		try {
			URL url = new URL(sito);
			
			InputStream input = url.openStream();
			BufferedInputStream buffer = new BufferedInputStream(input);
			
			PrintWriter scrittore = new PrintWriter(new File("files/sitoMau.html"));
			
			while(true) {
				int data = buffer.read();
				
				if (data == -1) {
					break;
				} else {
					System.out.print( (char) data);
					scrittore.print((char) data);
				}
				
			}
			scrittore.close();
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
