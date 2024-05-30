public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        System.err.println("myStack.push(0);");
        System.err.println("myStack.push(1);");
        System.err.println("myStack.push(2);");
        System.err.println("myStack.push(3);");

        myStack.getHeight();
        myStack.getTop();
        myStack.pop();

        myStack.printStack();

    }
}
