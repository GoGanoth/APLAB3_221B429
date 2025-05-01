class CrowAdapter implements Swan {
    Crow crow;
    
    CrowAdapter(Crow c) {
        crow = c;
    }
    
    public void swim() {
        crow.fly();
    } 
    
    public void sing() {
        crow.cry();
    } 
    
    public void eat() {
        crow.eat();
    } 
}