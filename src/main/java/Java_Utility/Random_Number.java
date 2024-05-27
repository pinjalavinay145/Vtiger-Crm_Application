package Java_Utility;

import java.util.Random;

public class Random_Number {
    public int randomNo(){
        Random random= new Random();
        int randomNo = random.nextInt(1000);
        return randomNo;
    }
}
