public class Lab7PartTwo {
    public static void main(String[] args) {

        String binary = "11";
        long result = 0;


        for(int i=0;i<binary.length();i++) {
            int reverseIndex = binary.length() - 1 - i;
            char c = binary.charAt(reverseIndex);
            int bit = Character.getNumericValue(c);
            result += bit * (int)Math.pow(2,i); // bit * 2 ^ i
            }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie");
        }


//        System.out.println(result);
        }



