abstract class Artist{
    private String name;
    private int expInVietNamMusic;
    private int age;
    private int startArtFrom;
    static int maxAge = 140;
    
    public Artist(String name, int age, int startArtFrom){
        this.name = name;
        this.startArtFrom = startArtFrom;
        this.age = age;
    }
// Setter
    public String setName(){
        return this.name;
    }

    public boolean setAge(int age){
        if (age >= 0 && age <= maxAge) {
            return true;
        }
        else return false;
    }

    public boolean setStartTime(int startArtFrom){
        if (startArtFrom >= 0 && startArtFrom <= this.age) {
            return true;
        }
        else 
            return false;
    }

    public void setTimeline(){
        if (this.age - this.startArtFrom > 0) {
            this.expInVietNamMusic = this.age - this.startArtFrom;
        }
    }
// Getter
    public int getAge(){
        return this.age;
    }
    
    public int getExpInVietnamMusic(){
        return this.expInVietNamMusic;
    }
    
    
    abstract void whatTheyDo();
}

interface UnderGround{
    public String[] workFlow = {"King Of Rap", "Rap Viet"};
    
}

class Rapper extends Artist implements UnderGround{
    public Rapper(String name, int age, int startArtFrom){
        super(name, age, startArtFrom);
    }

@Override
    public void whatTheyDo(){
        System.out.println("They are rappers of the underground.\n--> They rap");
    }  
    public void getTimeline(){
        super.setTimeline();
    }
}

class Singer extends Artist{
    public Singer(String name, int age, int startArtFrom){
        super(name, age, startArtFrom);
    }

@Override
    public void whatTheyDo(){
        System.out.println("They are singer\n--> They sing");
    }
}

public class Abstract_java {
    
    public static void main(String[] args) {
        
    }
}
