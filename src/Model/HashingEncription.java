package Model;

import java.security.MessageDigest;

public class HashingEncription {

    public static String getEncription(String input) throws Exception {
        String text = null;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(input.getBytes("UTF-8"));
        byte[] hash = digest.digest();
        text = bytesToHex(hash);

        return text;
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
