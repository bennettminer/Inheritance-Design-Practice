public class ClassTester{
    public static void main(String[] args) {
        Class_1 testclass = new Class_1();
        testclass.Print();
        System.out.println(testclass.toString());
        testclass.Set(1, 2);
        testclass.Print();
        System.out.println(testclass.toString());

        System.out.println("-------------");

        Class_1 testclass2 = new Class_1(1, 1);
        testclass2.Print();
        System.out.println(testclass2.toString());
        testclass2.Set(2, 2);
        testclass2.Print();
        System.out.println(testclass2.toString());

        System.out.println("-------------");

        Class_2 testclass3 = new Class_2();
        testclass3.Print();
        System.out.println(testclass3.toString());
        testclass3.Set(1, 2, 3);
        testclass3.Print();
        System.out.println(testclass3.toString());

        System.out.println("-------------");

        Class_2 testclass4 = new Class_2(1, 1, 1);
        testclass4.Print();
        System.out.println(testclass4.toString());
        testclass4.Set(2, 2, 2);
        testclass4.Print();
        System.out.println(testclass4.toString());
    }
}