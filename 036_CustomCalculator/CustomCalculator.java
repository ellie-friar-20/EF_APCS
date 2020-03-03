public class CustomCalculator {
    static int x;
    int y;

    public void customAdd(final int x, final int y) {

        final int answerAdd = x + y;
    }

    public void customSubtract(final int x, final int y) {
        final int answerSubtract = x - y;
    }

    public void customMultiply(final int x, final int y) {
        final int answerMultiply = x * y;
    }

    public void customDivide(final int x, final int y) {
        final int answerDivide = x / y;
    }

    public static void main(final String[] args) {
        {
            customAdd(x, y);
    }
}
}