
package PYQ2021;

public class Q4_DevideF2 extends Q4_Eleven {

    
    public Q4_DevideF2(String file) {
        super(file);
    }
    
    @Override
    public String divide() {
        String result = "Divisibility Rule(Formula 2)\n";
        
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            result += num + ", : ";
            //int resultOfSubtraction = 0;
            while(num > 100) {
                int lastDigit = num % 10;
                num /= 10;
                result += num + " - ";
                num = num - lastDigit;
                result += lastDigit + " * 1 = " + num + ", ";
            }
            result += "x = " + num;
            if(num % 11 == 0) {
                result += "\n" + num + " modulus 11 = 0, " + arr[i] + " is divisible by 11\n\n";
            } else {
                result += "\n" + num + " modulus 11 is not equal to 0, " + arr[i] + " is not divisible by 11\n\n";
            }
        }
        
        return result;
        
    }        
    
}
