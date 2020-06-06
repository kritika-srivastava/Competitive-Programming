import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class SHA256InJava {
 
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String data = sn.nextLine();
         
        SHA256InJava sj = new SHA256InJava();
        String hash = sj.getSHA256Hash(data);
        System.out.println(hash.toLowerCase());
    }
 
    private String getSHA256Hash(String data) {
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash); // make it printable
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    private String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
}
