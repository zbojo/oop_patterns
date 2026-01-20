package PrototypePrep;

public class Main
{
    public static void main(String[] args)
    {
        Class clas = new Class();
        clas.setName("meow");
        System.out.println("name of real class " + clas.getName());

        Class clas2 = (Class) clas.makeCopy();
        System.out.println("name of copy class " + clas2.getName());
    }
}
