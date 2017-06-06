package calculator.operations;

import static calculator.common.Common.OPERAND_REGEX;
import static calculator.common.Common.OPERATION_REGEX;

/**
 *
 * @author Michael Syme
 */
public class Process {
    private String[] args;
    
    public Process(final String[] args) {
        this.args = args;
    }
    
    public Double calulateResult() {
        Equation equation = new Equation();
        
        for(String a : args) {
            a = a.trim().toLowerCase();
            
            // store operands
            if(a.matches(OPERAND_REGEX)) {
                if(equation.getOperand1() == null) {
                    equation.setOperand1(Double.parseDouble(a));
                } else {
                    equation.setOperand2(Double.parseDouble(a));
                    
                    // We now have operand1 and operand2.
                    // Loop over the known operations and store calculated 
                    // value into operand1 and repeat for more arguments
                    for(Operations op : Operations.values()) {
                        if(op.getSymbol().equals(equation.getOperation())) {
                            equation.setOperand1(op.applyAsDouble(equation.getOperand1(), equation.getOperand2()));
                            break;
                        }
                    }
                    // Good practice to re-initialise the second operand.
                    equation.setOperand2(null);
                }
            } else if(a.matches(OPERATION_REGEX)) {
                // store operation
                equation.setOperation(a);
            }
        }
        return equation.getOperand1();
    }
}
