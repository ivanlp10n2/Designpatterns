package ar.empanada.learning.designpatterns.keypair;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) {
        try {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(2048);
            KeyPair keyPair = kpg.generateKeyPair();
            PublicKey pubKey = keyPair.getPublic();
            PrivateKey priKey = keyPair.getPrivate();

            byte[] challenge = new byte[10000];
            ThreadLocalRandom.current().nextBytes(challenge);

            Signature sig = Signature.getInstance("SHA256withRSA");
            sig.initSign(priKey);
            sig.update(challenge);
            byte[] signature = sig.sign();

            sig.initVerify(pubKey);
            sig.update(challenge);

            System.out.println("Las keys corresponden" + sig.verify(signature));

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String encrypt (String restMessage, PublicKey pubKey) throws Exception{
        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] cipherText = encryptCipher.doFinal(restMessage.getBytes(UTF_8));

        return Base64.getEncoder().encodeToString(cipherText);
    }

    private static String decrypt (String encryptedMessage, PrivateKey privKey) throws Exception{
        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privKey);
        byte[] cipherText = Base64.getDecoder().decode(encryptedMessage);

        return new String(decryptCipher.doFinal(cipherText), UTF_8);
    }
}

//    File pvFile = new File(outPath + "privKey.key");
//    FileOutputStream out = new FileOutputStream(pvFile, false);
//            out.write(priKey.getEncoded());
//                    out.close();
//
//                    File pbFile = new File(outPath + "pubKey.pub");
//                    out = new FileOutputStream(pbFile, false);
//                    out.write(pubKey.getEncoded());
//                    out.close();
