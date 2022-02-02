import java.math.BigDecimal;
import java.math.BigInteger;

public class GrainCounter {
    // 1,     2,  4,   8,   16, 32,  64,  128
    // 1^0. 2^1, 2^2, 2^3, 2^4, 2^5, 2^6, 2^7
    public static void main(String[] args) {
        int chessboardSquares = 8 * 8;
        int lastSquarePower = chessboardSquares -1;
        long nbrOfGrainsWithoutLastSquare  = 1L;
        long nbrOfGrainsOnLastSquare =(long) Math.pow(2,lastSquarePower);



        for (int i = 1; i <= chessboardSquares - 2; i++) {
            nbrOfGrainsWithoutLastSquare += (long) Math.pow(2, i);
        }
        String strWithoutLast = String.valueOf(nbrOfGrainsOnLastSquare);
        String last = String.valueOf(nbrOfGrainsOnLastSquare);

        BigInteger finalResult = new BigInteger(strWithoutLast);
        finalResult = finalResult.add(new BigInteger(last));

        System.out.print("Liczba ziaren na szachownicy to: " + finalResult);


    }
}
