package calculator.operations;

import java.util.function.DoubleBinaryOperator;

/**
 *
 * @author Michael Syme
 */
public enum SingleOperations implements DoubleBinaryOperator {
    PLUS    ("+", (o1, o2) -> o1 + o2),
    MINUS   ("-", (o1, o2) -> o1 - o2),
    MULTIPLY("*", (o1, o2) -> o1 * o2),
    DIVIDE  ("/", (o1, o2) -> o1 / o2),
    SQUARE  ("^", (o1, o2) -> Math.pow(o1, o2));

    private final String symbol;
    private final DoubleBinaryOperator func;

    private SingleOperations(final String symbol, final DoubleBinaryOperator func) {
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
