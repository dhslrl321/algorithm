import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Test {

    private static SecretKey genKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

        keyGenerator.init(128);

        SecretKey key = keyGenerator.generateKey();

        return key;
    }

    private static byte[] encrypt(SecretKey key, String msg) throws Exception{
        byte[] iv = {
                0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37,
                0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46
        };

        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
        byte[] ctx = cipher.doFinal(msg.getBytes());

        return ctx;
    }

    public static String bytesToHex(byte[] bytes) {
        final char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for ( int j = 0; j < bytes.length; j++ ) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }


    public static void main(String[] args) throws Exception{

        SecretKey key = genKey();
        byte[] ctx1 = encrypt(key, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(bytesToHex(ctx1));
    }
}
