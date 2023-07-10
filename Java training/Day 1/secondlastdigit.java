 public class secondlastdigit {
        public static int getSecondLastDigit(int number) {
            // Convert the number to a positive value if it's negative
            number = Math.abs(number);
    
            // Divide the number by 10 and modulo by 10 to get the second last digit
            int secondLastDigit = (number / 10) % 10;
    
            return secondLastDigit;
        }
    
        public static void main(String[] args) {
            int number = 123456789;
            int secondLastDigit = getSecondLastDigit(number);
    
            System.out.println("Second last digit: " + secondLastDigit);
        }
    }
    

