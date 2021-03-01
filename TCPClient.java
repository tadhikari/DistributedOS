import java.net.*;
import java.io.*;
public class TCPClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 7896);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = br.readLine();
            dout.writeUTF(str);

        }
        dout.flush();
        dout.close();
        s.close();
    }
}
