import java.util.Stack;

public class Infix {

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public static int getPrecedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String infixInPostfix(String infix) {
        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) <= getPrecedence(c)
                        && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        return postfix.toString();
    }

    public static int hasil(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else if (isOperator(c)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (c) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    case '%':
                        result = a % b;
                        break;
                    case '^':
                        result = (int) Math.pow(a, b);
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("Infix: " + infix);
        String postfix = infixInPostfix(infix);
        System.out.println("Postfix: " + postfix);
        int result = hasil(postfix);
        System.out.println("Hasil: " + result);
    }
}
