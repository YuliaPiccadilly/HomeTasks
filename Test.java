public class Test {
    public static void main(String[] args) {
        Person p = new Person(); 
        p.age = 34;
        p.name = "Julia";
       System.out.println ("Меня зовут "+p.name+". "+"мне " +p.age);

       Person p2 = new Person(); 
       p2.age = 3;
       p2.name = "Lada";
      System.out.println ("Меня зовут "+p2.name+". "+"мне " + p2.age);    
        
        p.run(); 
        p.say(); 
        p2.run();
        p2.say();
        
       
    }
}
