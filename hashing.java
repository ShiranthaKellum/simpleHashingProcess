/* shiarantha
             Kellum J */

import java.security.*;

public class hashing {
    public static void main(String[] args) {
        try {
            String message = "I'm shirantha";                               // sender's message
            byte messageByte [] = message.getBytes();                       // convert message into a byte array

            MessageDigest md_1 = MessageDigest.getInstance("SHA1");         // hashing algorithm
            md_1.update (messageByte);                                      // input argument for update () is a byte type
            byte sendHashValue [] = md_1.digest();                          // hash value of the message

            for (byte b : sendHashValue) {
                System.out.format("%02x", b);                               // print hash value

            }
            System.out.println("");

            String receiveMessage = "I'm shirantha";                        // recipient's message
            byte receiveMessageByte [] = receiveMessage.getBytes();

            MessageDigest md_2 = MessageDigest.getInstance("SHA1");
            md_2.update(receiveMessageByte);
            byte receiveHashValue [] = md_2.digest();

            for (byte b : receiveHashValue) {
                System.out.format ("%02x", b);

            }
            System.out.println("");

            if (md_2.isEqual(sendHashValue, receiveHashValue)) {            // input for isEqual () is 2 byte type arguments
                System.out.println("Verified"); 

            } else {
                System.out.println("Verification falied");

            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
