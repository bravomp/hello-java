import java.io.UnsupportedEncodingException;

public class HardCodedCredSecret {
    public static void main(String [] args) throws UnsupportedEncodingException {
        String secret = "It's a secret to everybody.";
        javax.crypto.spec.SecretKeySpec keyspec = 
        new javax.crypto.spec.SecretKeySpec(secret.getBytes("UTF-8"), "AES");

    }

}
