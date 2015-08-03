/**
 * Created by Anastasia on 03.08.2015.
 */
public class Main {
    private static Object E1 = 1;
    private static Object E2 = 2;
    private static Object E3 = 3;
    private static Object E5 = 4;
    private static Object E6 = 5;
    private static Object E7 = 6;

    public static void main(String[] args) throws StackException {
        StackImpl stack = new StackImpl(5);

//       stack.pop();
        stack.push(E1);
        stack.push(E2);
        stack.push(E3);
        stack.push(E5);
        stack.push(E6);
        stack.push(E7);
        stack.push(E7);

        stack.print();
        stack.clear();
        stack.print();
        System.out.println(stack.pop());
    }
}
