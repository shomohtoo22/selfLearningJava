import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {



    public int evaluate(final String input) {
        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");

        for (String token : tokens) {
            stack.add(token);
        }

        while (stack.size() > 1) {
            final int left = Integer.parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = Integer.parseInt(stack.pop());

            int result = 0;
            switch (operator){
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
            }

            stack.push(String.valueOf(result));
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.evaluate("4 + 5 - 3"));
    }
}
