public class example {
    public static void main(String[] args){
        new Sample().a();
        Const c = new Const("test",10);
        System.out.println("type : "+c.getType()+" level :"+c.getLevel());
    }
}

class Const{
    String type;
    int level;

    Const(String type,int level){
        this.type = type;
        this.level = level;
    }

    public String getType(){
        return this.type;
    }


    public int getLevel(){
        return this.level;
    }
}

interface tInterface{
    String t = "hello world";
    double d = 0.0;

    //
}

class Sample implements tInterface{
    public void a(){
        System.out.println("String from interface -> "+t);
    }
}

class Parent{
    void parent(){
        String text = "A Parent";
        System.out.println(text);
    }
}

class Child extends Parent{
    @Override
    void parent(){
        String text = "A child";
    }
}
