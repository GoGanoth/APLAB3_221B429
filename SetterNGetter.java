public class SetterNGetter
{
    private String name;
    private int age;
    
    void SetName(String name) {
        this.name = name;    
    }
    
    String GetName() {
        return this.name;
    }
    
    void SetAge(int age) {
        this.age = age;
    }   
    
    int GetAge() {
        return this.age;
    }
    
	public static void main(String[] args) {
		SetterNGetter m = new SetterNGetter();
		
		m.SetName("vaidik");
		m.SetAge(20);
		
		System.out.println(m.GetName() + " " + m.GetAge());
	}
}
