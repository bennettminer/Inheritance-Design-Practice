public class Person{
    String firstName;
    String lastName;
    public Person(){
        firstName = "John";
        lastName = "Doe";
    }

    public Person(String firstName1, String lastName1){
        firstName = firstName1;
        lastName = lastName1;
    }

    public String getFirst(){
        return firstName;
    }

    public String getLast(){
        return lastName;
    }

    public void setName(String firstName1, String lastName1){
        firstName = firstName1;
        lastName = lastName1;
    }
    
    public void printLastFirst(){
        System.out.println(lastName + ", " + firstName + " ");
    }

    public void print(){
        System.out.println(firstName + " " + lastName + " ");
    }

    public String toString(){
        return firstName + " " + lastName + " ";
    }

    public boolean equals(Object o){
        if (o == firstName){
            return true;
        }
        else {
            if (o == lastName){
                return true;
            }
            else {
                return false;
            }
        }
    }
}