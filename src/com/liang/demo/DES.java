package com.liang.demo;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.security.Security;

public class DES {
    public static void main(String[] args) throws Exception  {

        //KeyGenerator提供对称密钥生成器的功能，支持各种算法

        KeyGenerator keygen;

        //SecretKey负责保存对称密钥

        SecretKey deskey;

        //Cipher负责完成加密或解密工作

        Cipher c;

//        Security.addProvider(new com.sun.crypto.provider.SunJCE());

        //实例化支持3DES算法的密钥生成器，算法名称用DESede

        keygen = KeyGenerator.getInstance("DESede");

        //生成密钥

        deskey = keygen.generateKey();

        final String TRANSFORMATION_CBC = "DESede/CBC/NoPadding";
        byte[] doubleLenKey = new byte[]{0x73, 0x7A, 0x35, 0x7D, 0x7B, 0x12, 0x4C, 0x51, 0x70,
                0x79, 0x24, 0x7A, 0x7C, 0x7D, 0x25, 0x79, 0x73, 0x7A, 0x35, 0x7D, 0x7B, 0x12, 0x4C, 0x51};
        DESedeKeySpec desKey = new DESedeKeySpec(doubleLenKey);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
        SecretKey secureKey =  keyFactory.generateSecret(desKey);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION_CBC);
        cipher.init(Cipher.ENCRYPT_MODE, secureKey);

        //生成Cipher对象，指定其支持3DES算法

        c = Cipher.getInstance("DESede/CBC/NoPadding");

        String msg = "郭克华_安全编程技术";

        System.out.println("明文是：" + msg);

        //根据密钥，对Cipher对象进行初始化,ENCRYPT_MODE表示加密模式

        c.init(Cipher.ENCRYPT_MODE, secureKey);

        byte[] src = msg.getBytes();

        //加密，结果保存进enc

        byte[] enc = cipher.doFinal(new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00});

        System.out.println("密文是：" + new String(enc));

        //根据密钥，对Cipher对象进行初始化,ENCRYPT_MODE表示加密模式

        cipher.init(Cipher.DECRYPT_MODE, secureKey);

        //解密，结果保存进dec

        byte[] dec = cipher.doFinal(enc);

        System.out.println("解密后的结果是："+ new String(dec));

    }
}
