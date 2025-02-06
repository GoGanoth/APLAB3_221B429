interface Testable {
    void display();
}

class Test implements Testable {
    @Override
    public void display() {
        System.out.println("display called inside Test");
    }
}

