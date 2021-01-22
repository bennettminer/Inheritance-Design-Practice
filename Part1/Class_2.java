public class Class_2 extends Class_1{
    int z;

    public Class_2(){
        super();
        z = 0;
    }

    public Class_2(int x1, int y1, int z1){
        super(x1, y1);
        z = z1;
    }

    public void Print() {
        System.out.println(x + " " + y + " " + z + " ");
    }

    public String toString(){
        return x + " " + y + " " + z + " ";
    }

    public void Set(int x1, int y1, int z1){
        x = x1;
        y = y1;
        z = z1;
    }
}