public class DesignPrinciple {
    public static void main(String[] args) {

    }
}

class DryAnimal{
    public void eat(){
        System.out.println("Eating Food");
    }
}

class DryDog extends DryAnimal{

    @Override
    public void eat() {
        super.eat();
    }
}
class DryCat extends DryAnimal{
    @Override
    public void eat() {
        super.eat();
    }
}

interface Reader {
    void read();
}

interface Writer{
    void write();
}

class Keyboard implements Reader{
    @Override
    public void read() {

    }
}
class Printer implements Writer{
    @Override
    public void write() {

    }
}

// Dependency Inversion principle
class Copier{
    void copy(Reader reader,Writer writer){
        //no info related to low level implementations for how reader & writer were created
        writer.write();
        reader.read();
    }

    public static void main(String[] args) {
        Copier copier = new Copier();
        Reader reader = new Keyboard();
        Writer writer = new Printer();
        // pass high level
        copier.copy(reader,writer);
    }
}
/*
* 1. SOLID:
*       Single Responsibility principle
*       Open and Close
*       Liscov Substitution
*       Interface Segregation
*       Dependency Injection
* 2. DRY
*       Dont Repeat Yourself
* 3. YAGNI
*       Your aren't gonna need it
* 4. KISS
*       Keep it simple silly
*
*
*
* */
