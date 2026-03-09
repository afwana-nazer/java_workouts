import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class SimpleFileClient1{
	public static void main(String args[] ) throws Exception {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter file name:");
	String filename = sc.nextLine();

	Socket cs = new Socket("localhost" ,1234);
	DataInputStream in = new DataInputStream(cs.getInputStream());
	DataOutputStream out = new DataOutputStream(cs.getOutputStream());

	out.writeUTF(filename);

	String response = in.readUTF();

	if (response.equals("FOUND")) {
	FileOutputStream fos = new FileOutputStream("downloaded_"+filename);
	int data;

	while((data = in.read() ) != -1){
	fos.write(data);
	}

	fos.close();
	System.out.println("file downloaded");
}
else {
System.out.println("file not found on server");
}
	cs.close();
	sc.close();
}
}