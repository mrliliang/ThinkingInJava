package com.liang.demo;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;

public class DES3Utils {

    private static final String Algorithm = "DESede"; //定义 加密算法,可用 DES,DESede,Blowfish
    public final static String IV = "0000000000000000";

    //keybyte为加密密钥，长度为24字节
    //src为被加密的数据缓冲区（源）
    public static byte[] encryptMode(byte[] keybyte, byte[] src) {
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            //加密
            Cipher c1 = Cipher.getInstance("DESede/CBC/NoPadding");
            IvParameterSpec ips = new IvParameterSpec(hexStringToBytes(IV));
            c1.init(Cipher.ENCRYPT_MODE, deskey, ips);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    //keybyte为加密密钥，长度为24字节
    //src为加密后的缓冲区
    public static byte[] decryptMode(byte[] keybyte, byte[] src) {
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            //解密
            Cipher c1 = Cipher.getInstance("DESede/CBC/NoPadding");
            IvParameterSpec ips = new IvParameterSpec(hexStringToBytes(IV));
            c1.init(Cipher.DECRYPT_MODE, deskey, ips);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    //转换成十六进制字符串
    public static String byte2hex(byte[] b) {
        String hs="";
        String stmp="";

        for (int n=0;n<b.length;n++) {
            stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length()==1) hs=hs+"0"+stmp;
            else hs=hs+stmp;
            if (n<b.length-1)  hs=hs+":";
        }
        return hs.toUpperCase();
    }

    //实现String到byte的转换
    public static byte[] hexStringToBytes(String string) {
        String hexString = string.replaceAll(" ", "").toUpperCase();


        if (hexString.length() <= 0)
            return null;


        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (hexcharToByte(hexChars[pos]) << 4 | hexcharToByte(hexChars[pos + 1]));
        }
        return d;
    }

    public static byte hexcharToByte(char ch) {
        if (ch >= '0' && ch <= '9') {
            return (byte)(ch - '0');
        } else if (ch >= 'a' && ch <= 'f') {
            return (byte)(10 + ch - 'a');
        } else if (ch >= 'A' && ch <= 'F') {
            return (byte)(10 + ch - 'A');
        }

        return -1;
    }

    public static String bytesToHexString(byte[] hexBytes) {
        StringBuilder stringBuilder = new StringBuilder();
        byte left = 0;
        byte right = 0;
        for (int i = 0; i < hexBytes.length; i++) {
            left = (byte)((hexBytes[i] & 0xF0) >> 4);
            right = (byte)((hexBytes[i] & 0x0F));
            stringBuilder.append(byteToHexChar(left)).append(byteToHexChar(right));
        }
        return stringBuilder.toString();
    }

    public static char byteToHexChar(byte hex) {
        if (hex >= 0 && hex <= 9) {
            return (char)('0' + hex - 0);
        } else if (hex >= 10 && hex <= 15) {
            return (char)('A' + hex - 10);
        }

        return 0;
    }

    public static void main(String[] args) {
//        //3DES
//        //3DES加密93AA35BDCB124C5180E9249A8CBD25E9
//        String key = "93AA35BDCB124C51"  //K1密钥
//                +"80E9249A8CBD25E9" //K2密钥
//                +"93AA35BDCB124C51";    //K3密钥
//        byte[] result = DES3Utils.encryptMode(hexStringToBytes(key), hexStringToBytes("0000000000000000"));
//        System.out.println("encrypted result:" + bytesToHexString(result));
//
//        //3DES解密
//        byte[] dnresult = DES3Utils.decryptMode(hexStringToBytes(key), result);
//        System.out.println("decrypted result:" + bytesToHexString(dnresult));


        byte[] bytes = hexStringToBytes("BDB02850ED9A983489EC80CBE13F776BC71D38A0");
        System.out.println();

        byte[] bytes1 = "BDB02850ED9A983489EC80CBE13F776BC71D38A0".getBytes();

        try {
            System.out.println(bytesToHexString("桨(P須?夓€酸?wk?8?".getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}