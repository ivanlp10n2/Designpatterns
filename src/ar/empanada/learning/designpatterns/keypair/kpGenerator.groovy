package ar.empanada.learning.designpatterns.keypair

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.KeyFactory
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec

static void main(String[] args) {

    if(args) {
        Files
        String app_name = args[0];
        String outPath = System.getProperty("user.dir") + "/"

        println "Generando key pairs...."
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA")
        kpg.initialize(2048)

        KeyPair keyPair = kpg.generateKeyPair()
        PublicKey pubKey = keyPair.getPublic()
        PrivateKey priKey = keyPair.getPrivate()

        println "Creando archivos .pub y .key..."

        Base64.Encoder encoder = Base64.getEncoder();
        Writer outW = new FileWriter(outPath + "text_"+app_name + ".key")
        outW.write("\n-----BEGIN RSA PRIVATE KEY-----\n")
        outW.write(encoder.encodeToString(priKey.getEncoded()))
        outW.write("\n-----END RSA PRIVATE KEY-----\n")
        outW.close()

        outW = new FileWriter(outPath + "text_"+app_name + ".pub")
        outW.write("\n-----BEGIN RSA PUBLIC KEY-----\n")
        outW.write(encoder.encodeToString(pubKey.getEncoded()))
        outW.write("\n-----END RSA PUBLIC KEY-----\n")
        outW.close()

        println "Las key "+ app_name + ".pub y "+ app_name + ".key "+ " fueron generadas exitosamente!!"
    }
    else
        println "Ingrese el nombre de las key como parametro: \n" +
                "groovy kpGenerator.groovy \"app_name\" "
}