
package thuchanh;
import java.io.*;
import java.util.ArrayList;

public class BinaryConverter {
    
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("DATA.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            ArrayList<String> binaryStrings = (ArrayList<String>) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            for (String binaryString : binaryStrings) {
                long decimalValue = convertBinaryToDecimal(binaryString);
                System.out.println(binaryString + " " + decimalValue);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static long convertBinaryToDecimal(String binaryString) {
        long decimalValue = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char bit = binaryString.charAt(i);
            if (bit == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }

        return decimalValue;
    }
}
