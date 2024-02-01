public class NameList{

    public void start(){
        String[] names = {"Harry", "Ron", "Hermione", "Neville", "Draco"};
        for(String name : names){
            System.out.println(name);
        }
    }
    
    public static void main(String[] args){
        NameList app = new NameList();
        app.start();
    }
}