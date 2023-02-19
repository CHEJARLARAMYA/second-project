interface  Person{
    public abstract void Eat(int a,int b );

   
}
class Teacher implements  Person{
    public void Eat( int a,int b)
    {
        System.out.println(a*b);

        
    }
    public static void main(String[] args)
    {
        Person p = new Teacher();
        p.Eat(12,13);
        //p.Work();
    }
}









