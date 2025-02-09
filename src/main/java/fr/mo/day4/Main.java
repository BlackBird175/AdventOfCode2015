package fr.mo.day4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Main {
    private static final String PREFIX = "bgvyzdsv";

    public static void main(String[] args) throws NoSuchAlgorithmException {

        AtomicBoolean found = new AtomicBoolean(false);
        MessageDigest md = MessageDigest.getInstance("MD5");

        IntStream.iterate(0, i -> i + 1)
                .parallel()
                .filter(i -> !found.get())
                .forEach(i -> {
                    String message = PREFIX + i;
                    byte[] digest = md.digest(message.getBytes());

                    String hash = bytesToHex(digest);
                    if (hash.startsWith("000000")) {
                        found.set(true);
                        System.out.println("Hash trouvé : " + hash + " pour i = " + i);
                    }
                });
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder out = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            out.append(String.format("%02X", b));
        }
        return out.toString();
    }
}
