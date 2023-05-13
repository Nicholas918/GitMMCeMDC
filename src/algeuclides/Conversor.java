package algeuclides;

public class Conversor {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int mmc() {
        int a = num1;
        int b = num2;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return (num1 * num2) / a;

    }

    public int mdc() {
        int a = num1;
        int b = num2;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public String obterResultado() {
        return "O MMC de " + num1 + " e " + num2 + " é: " + mmc() + "\nO MDC de " + num1 + " e " + num2 + " é: " + mdc();

    }
}
