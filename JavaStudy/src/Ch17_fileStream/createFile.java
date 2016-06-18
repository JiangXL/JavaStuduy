package Ch17_fileStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;;
public class createFile {

	  public static void main(String[] args) throws IOException {
		  FileOutputStream file = new FileOutputStream("C:/Users/SHooting/Documents/test.txt");
		  // "\"-->"/" ,change place on your own
		  
		  OutputStreamWriter out = new OutputStreamWriter(file);
		  BufferedWriter output =new BufferedWriter(out);
		  String str = "Code for who I love,code for world ,code for cosmos";
	    
		  output.write(str);
		  //date in Buffer will auto store ?
		  output.close();
	    
		  System.out.println("Done");
	    
	  }
	}


