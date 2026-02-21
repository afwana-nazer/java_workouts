import java.io.*;
import java.net.*;
class ClientChat {
		public static  void main(String args[]) {
		Socket cs;
		DataInputStream sin,kin;
		DataOutputStream sout;
		try {
			cs= new Socket("localhost" , 1234);
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			kin = new DataInputStream(System.in);
			while(true) {
					String str = sin.readUTF();
					if(str.equals("quits"))
						break;
			System.out.println("server says" +str);
			System.out.println("enter data /quit");
			str=kin.readLine();
			if(str.equals("quits"))
				break;

			sout.writeUTF(str);
			if(str.equals("quits"))
				break;

			
			
			}

		}
   		catch(Exception e) {
		System.out.println("Error:" +e);
		}
	}
}