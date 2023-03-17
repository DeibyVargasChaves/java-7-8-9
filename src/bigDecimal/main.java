package bigDecimal;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        BigDecimal result = valorA.add(valorB);

        System.out.println(result.toString());

    }
}
