
//: Write a Java Program to demonstrate a Generic Class.
class Test<T> {
T obj;
Test(T obj) { this.obj = obj; } // constructor
public T getObject() { return this.obj; }
}
class Main {
public static void main(String[] args)
{
// instance of Integer type
Test<Integer> iObj = new Test<Integer>(169593);
System.out.println(iObj.getObject());
// instance of String type
Test<String> sObj
= new Test<String>("Pratibha");
System.out.println(sObj.getObject());
}
}






// Aim : Write a Java Program to demonstrate a Generic methods.
class Test<T> {
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
    }
    class Main {
    public static void main(String[] args)
    {
    // instance of Integer type
    Test<Integer> iObj = new Test<Integer>(169593);
    System.out.println(iObj.getObject());
    // instance of String type
    Test<String> sObj
    = new Test<String>("Pratibha");
    System.out.println(sObj.getObject());
    }
    }
    
