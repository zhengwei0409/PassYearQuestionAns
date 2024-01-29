
package PYQ2021;

public class Q4_DevideF1 extends Q4_Eleven {
    
    public Q4_DevideF1(String file) {
        super(file);
    }

    @Override
    public String divide() {
        String result = "Divisibility Rule(Formula 1)";
        
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            result += "\n" + num + " : | (";
            int odd = 0;
            int even = 0;
            int reverse = 0;
            int tempReverse;
            while(num > 0) {
                int temp = num % 10;
                reverse = reverse * 10 + temp;
                num /= 10;
            }
            tempReverse = reverse;
            tempReverse /= 10;
            while(tempReverse > 0) {
                int oddDigit = tempReverse % 10;
                odd += oddDigit;
                tempReverse /= 100;
                if(tempReverse > 0) {
                    result += oddDigit + " + ";
                } else {
                    result += oddDigit + ") - (";
                }
            }
            tempReverse = reverse;
            while(tempReverse > 0) {
                int evenDigit = tempReverse % 10;
                even += evenDigit;
                tempReverse /= 100;
                if(tempReverse > 0) {
                    result += evenDigit + " + ";
                } else {
                    result += evenDigit + ") | = ";
                }
            }
            int diff = Math.abs(odd - even);
            result += diff + "\n";
            if(diff % 11 == 0) {
                result += diff + " modulus 11 = 0, " + arr[i] + " is divisible by 11\n";
            } else {
                result += diff + " modulus 11 no equal to 0, " + arr[i] + " is not divisible by 11\n";
            }
        }
        
        return result;
    }
}
