/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author SAD
 */
public class MaHoa {
        public static String maHoaMD5(String str){
        byte[] defaultBytes = str.getBytes();
            try {                                                                   
                MessageDigest alogrithm = MessageDigest.getInstance("MD5");
                alogrithm.reset();
                alogrithm.update(defaultBytes);
                byte messageDigest[] = alogrithm.digest();
                StringBuffer hexString  = new StringBuffer();
                for(int i= 0 ;i< messageDigest.length ; i++){
                    String hex = Integer.toHexString(0xFF & messageDigest[i]);
                    if(hex.length() == 1){
                        hexString.append('0');
                        
                    }
                    hexString.append(hex);
                }
                str = hexString +"";
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return str;
    }
}
