public class Lab7PartTwo {
    public static void main(String[] args) {

        String bin = "10111";
        int d = bin.length();
        double result = 0;

        for(int i=0;i<bin.length();i++) {
            if (bin.charAt(i) == '1') {
                result = result + Math.pow(2, bin.length() - 1 - i);
            }
        }

//            result += bin.charAt(d - 1) == '1' ? 1 : 0;
//            result += bin.charAt(d - 2) == '1' ? 2 : 0;
//            result += bin.charAt(d - 3) == '1' ? 4 : 0;
//            result += bin.charAt(d - 4) == '1' ? 8 : 0;
        long finalResult = (long)result;
        System.out.println(finalResult);
        }
    }


