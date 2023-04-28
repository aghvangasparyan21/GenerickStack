package Stack;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> Stack = new GenericStack(10);
        Stack.push("Create Object");
        System.out.println(Stack.isEmpty());
    }
}