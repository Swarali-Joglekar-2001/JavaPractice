// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class A{
    public void print(){
        System.out.println("Calm");
    }
}

class Code_26_AnonymousClasses {
    public static void main(String[] args) {
        A obj1 = new A(){
            // override
            public void print(){
                System.out.println("Happy");
            }
        };
        obj1.print();
        A obj2= new A();
        obj2.print();
       
    }
}