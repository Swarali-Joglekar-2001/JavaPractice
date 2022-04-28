package SwaraliPractice;

class stud{
    String name;
    int age;

    stud(){   // non-parameterised

        //System.out.println("constructor called");
    }
    stud(String name, int age){  // parametrised constructor
        this.name=name;
        this.age=age;
    }

    stud(stud s){ // copy constructor
        this.name= s.name;
        this.age=s.age;
       // this.age=15;
    }
    public void printInfo(){
        System.out.println(this.name+" "+this.age);
    }

}

// Java has no destructor
// It uses automatic garbage collector that deallocates memory automatically



public class Code_1_Constructors {
    public static void main(String[] args) {
            stud s1 = new stud("XYZ",20);
            s1.printInfo();

            stud s2 = new stud(s1);
            s2.printInfo();

            stud s3= new stud();
            s3.name="Jim";
            s3.age=27;
            s3.printInfo();
    }
}
