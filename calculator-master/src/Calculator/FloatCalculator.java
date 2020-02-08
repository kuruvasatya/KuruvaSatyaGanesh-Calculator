package Calculator;

public class FloatCalculator extends Calculator {

    private float firstValue;

    private float secondValue;

    public FloatCalculator(float firstValue, float secondValue, char operatorsChar){
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.operation=Operations.parseOperation(operatorsChar);
    }

    @Override
    public Object execute(){
        return operation.executeOperation(firstValue,secondValue);
    }

}
