package calculator.operations;

import java.util.function.DoubleBinaryOperator;

/**
 *
 * @author Michael Syme
 */
public enum Operations implements DoubleBinaryOperator {
    PLUS    ("+", (o1, o2) -> o1 + o2),
    MINUS   ("-", (o1, o2) -> o1 - o2),
    MULTIPLY("*", (o1, o2) -> o1 * o2),
    DIVIDE  ("/", (o1, o2) -> o1 / o2),
    SQUARE  ("^", (o1, o2) -> Math.pow(o1, o2));
    // Test document speaks of 'next iteration' using sin, cos, etc...
    //SINE    ("sin", (o1, o2) -> Math.sin(o1)),
    //COSINE  ("cos", (o1, o2) -> Math.cos(o1)),
    //TANGENT ("tan", (o1, o2) -> Math.tan(o1));

    private final String symbol;
    private final DoubleBinaryOperator func;

    private Operations(final String symbol, final DoubleBinaryOperator func) {
        this.symbol = symbol;
        this.func = func;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public double applyAsDouble(final double left, final double right) {
        return func.applyAsDouble(left, right);
    }
}
