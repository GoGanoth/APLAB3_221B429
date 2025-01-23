class One {
    // Parameterized constructor for class One
    One(int x) {
        System.out.println("One class constructor called with value: " + x);
    }
}

/* 
We get this error 

class Two extends One {
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
