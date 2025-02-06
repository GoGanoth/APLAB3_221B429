abstract class AbsTest implements Testable {
    
}

class TestAbs extends AbsTest {
    @Override
    public void display() {
        System.out.println("display called from TestAbs");
    }
}