package assessment;

public class Calculator {
    public static void main(String[] args) {
        float a = 2.2222222f;
        double b = 3.3;
        int i=3;
        double operation;
        switch (i) {
            case 1 :
                operation = a+b;
                break;
            case 2:
                operation = a-b;
                break;
            case 3:
                operation = a*b;
                break;
            case 4:
                operation = a/b;
                break;
            default:
                operation = 0;
                break;
        }
                System.out.println("operation:" +operation);
        }
    }

