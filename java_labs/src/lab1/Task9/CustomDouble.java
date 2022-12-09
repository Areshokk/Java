package lab1.Task9;

public class CustomDouble {

    private final int first;
    private final double second;

    public CustomDouble(final int first, final double second) {
        this.first = first;
        this.second = second;
    }

    public CustomDouble(final double number) {
        this.first = (int) number;
        this.second = number - first;
    }


    public CustomDouble division(final CustomDouble customDouble) throws ArithmeticException {//метод ділення із перевіркою
        if(customDouble.second==0 && customDouble.first==0){
            throw new ArithmeticException ("No zero");
        }
        final double result = this.toDouble () / customDouble.toDouble ();
        return new CustomDouble(result);
    }

    public CustomDouble addition(final CustomDouble customDouble) {// метод суми
        final double result = this.toDouble() + customDouble.toDouble();

        return new CustomDouble(result);
    }

    public CustomDouble subtraction(final CustomDouble second) {
        final double result = this.toDouble() - second.toDouble();

        return new CustomDouble(result);
    }

    public CustomDouble multiplication(final CustomDouble second) {
        final double result = this.toDouble() * second.toDouble();

        return new CustomDouble(result);
    }

    public void comparison(final CustomDouble customDouble) {
        final double result = this.toDouble() - customDouble.toDouble();

        if(result > 0){
            System.out.println("First number larger than the second");
        }else if (result == 0){
            System.out.println("numbers are equal");
        }else{
            System.out.println("Second number larger than the first");
        }
    }


    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final CustomDouble that = (CustomDouble) object;

        if (first != that.first) {
            return false;
        }
        return Double.compare(that.second, second) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        final long temp;
        result = first;
        temp = Double.doubleToLongBits(second);
        result = (int) (42 * result +Math.pow (temp,2));
        return result;
    }

    @Override
    public String toString() {
        return this.toDouble() + "";
    }

    public double toDouble() {
        return (double) this.first + this.second;
    }
}
