

class Mother {
    int x;
    static void show() {
        System.out.println("Show function called by mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Show function called by child");
    }
}

class Application {
    public static void main(String[] args) {
        String xStr = args[0];
        int x = Integer.parseInt(xStr);
        System.out.println("Printing table of " + x + " :- ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}