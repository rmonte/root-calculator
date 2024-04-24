import java.util.Scanner;

public class Calculator {

    private String getMenu() {
            String menu;

            menu = "-------- CALCULADORA RAÍZ --------\n";
            menu += "1. Adição\n";
            menu += "2. Subtração\n";
            menu += "3. Multiplicação\n";
            menu += "4. Divisão\n";
            menu += "5. Sair\n";

            return menu;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.getMenu());
        System.out.print("Digite o número da operacao desejada: ");
        int operationCode = scanner.nextInt();

        // End the program
        if (operationCode == 5) {
            System.out.println("-------------- FIM --------------");
            return;
        }

        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double number2 = scanner.nextDouble();

        double result = this.calculate(number1, number2, operationCode);

        System.out.println("Resultado: " + result);
        System.out.println("");

        // Show menu again
        this.showMenu();
    }

    public double calculate(double number1, double number2, int operationCode) {
        Operation operation;

        switch (operationCode) {
            case 1:
                operation = new Addition();
                break;
            case 2:
                operation = new Subtraction();
                break;
            case 3:
                operation = new Multiplication();
                break;
            case 4:
                operation = new Division();
                break;
            default:
                System.out.println("Opção inválida!");
                return Double.NaN;
        }

        return operation.calculate(number1, number2);
    }
}