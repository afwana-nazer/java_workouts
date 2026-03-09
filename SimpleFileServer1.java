import java.io.*;
import java.net.*;

public class SimpleFileServer1 {
	public static void main(String args[]) throws Exception {
	
	ServerSocket ss = new ServerSocket(1234);
	System.out.println("server started");

	Socket sc= ss.accept();
	System.out.println("client connected");

	DataInputStream in = new DataInputStream(sc.getInputStream());
	DataOutputStream out = new DataOutputStream(sc.getOutputStream());
		
	String filename = in.readUTF();
	
	File file= new File(filename);

	if(file.exists()) {
	out.writeUTF("FOUND");

	FileInputStream fis = new FileInputStream(file);
	int data;

	while((data = fis.read()) != -1) {
	out.write(data);

	}

	fis.close();
	System.out.println("file sent");

	}
	else {

	out.writeUTF("not found");
	System.out.println("file not found");
}

ss.close();
sc.close();
}
}
	


