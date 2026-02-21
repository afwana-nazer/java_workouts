import java.io.*;
import java.net.*;
class serverchat {
		public static void main(String args[]) {
		ServerSocket ss;
		Socket as;
		DataInputStream sin,kin;
		DataOutputStream sout;
		try {
			ss = new ServerSocket(1234);
			as= ss.accept();
			kin = new DataInputStream(System.in);
			sin = new DataInputStream(as.getInputStream());
			sout = new DataOutputStream(as.getOutputStream());
			String str = "welcome";
			while(true) {
			sout.writeUTF(str);
			if(str.equals("quits"))
				break;
		
			str=sin.readUTF();
			if(str.equals("quits"))
				break;
			System.out.println("client says:" +str);
			System.out.println("enter data/quit");
			str = kin.readLine();
		}
	}

	catch(Exception e) {
		System.out.println("Error" +e);
	 }
	}
	}
 
		
