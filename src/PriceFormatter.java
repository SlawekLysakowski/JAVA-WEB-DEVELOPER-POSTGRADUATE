public class PriceFormatter {
    String currency = "zł";
    String formatPrice (int value) {
        return String.format("%d,00 %s",value, currency);
    }
    String formatPrice (double value) {
        return String.format("%.2f %s",value, currency);
    }

    String formatPrice (String value) {
//        return String.format("%.2f %s",Double.parseDouble(value), currency);
        return formatPrice(Double.parseDouble(value));
    }

    public static void main(String[] args) {
PriceFormatter pf = new PriceFormatter();
pf.currency = "PLN";
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(89.99));
        System.out.println(pf.formatPrice("550"));

    }
}
