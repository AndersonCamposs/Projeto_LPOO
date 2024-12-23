package utils;

import org.mindrot.jbcrypt.BCrypt;

public class EncryptedPasswordUtils {
    public static String generateHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
