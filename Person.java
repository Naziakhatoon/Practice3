class Person
{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Person(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Person (int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Person p1 = new Person(111,"Nazia",26);  
    Person p2 = new Person(222,"Shyam",25);  
    p1.display();  
    p2.display();  
   }  
}
