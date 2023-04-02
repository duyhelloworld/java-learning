/**
 * Manga
 */
class Anime {
    String name;
    private String author;
    int yearToPublish; 

    public Anime(String name, String author, int yearToPublish){
        this.author = author;
        this.name = name;
        this.yearToPublish = yearToPublish;
    }

    public void showAllAboutIt(){
        System.out.println("Anime : " + this.name);
        System.out.println("Tac gia : " + this.author);
        System.out.println("Light novel ra nam " + this.yearToPublish);
    }

    public void fanAniverary() {
        System.out.println("Chuc mung tac gia " + this.author);
        System.out.println("Nam ki niem cua " + this.name + " la " + (this.yearToPublish + 15));        
        // https://www.google.com/search?channel=fs&client=ubuntu&q=nam+ki+niem+voi+1+bo+anime
    }
}


// > Kế thừa

// < Cha có thì con có>
// ! Nhưng con có, chưa chắc cha đã có

// Ở đây, cha là Anime, Romance là con

// - Keyword để kế thừa là extends
class RomanceAnime extends Anime {
    public String levelGlocoze;
    // > Thuộc tính mới ở lớp con có thể thêm vào

    public RomanceAnime(String name, String author, int yearToPublish, String levelGlucoze) {
        // - Gán lại các đồ của Anime
        // this.name = name;
        // this.yearToPublish = yearToPublish;

        // this.author = author;
        // author là privated --> kế thừa ko cho Romance truy cập author.
        
        // > Vì việc gán ở trên quá dài dòng -> super ra đời
        super(name, author, yearToPublish);
        // --> Tác dụng super như là this bản có con thôi

        this.levelGlocoze = levelGlucoze;
    }
    // > Constructor additional

    // > Phương thức mới có thể thêm vào con
    public void fanAniverary(){
        // super(this.fanAniverary()); // ! Ko xài super đc vì cha méo cho
        // this.fanAniverary();
        // ! Dòng trên đem đc, nhưng hàm gọi lại là hàm con --> tác dụng viết lại = 0
        super.fanAniverary();
        
        System.out.println("From Romance Fan with Luv");
    }
    public void showAllAboutIt(){
        // this.showAllAboutIt();
        super.fanAniverary();
        System.out.println("Do Ngot : " + this.levelGlocoze);
    }
}



public class Bai14_inheritance {
    public static void main(String[] args) {
        Anime deathNote = new Anime("Death Note", "Oba Tsugmi", 2003);
        // > Khỏi nói về bộ này nhỉ!
        // https://vi.wikipedia.org/wiki/Death_Note
        RomanceAnime weatheringWithYou = new RomanceAnime("Dua con cua thoi tiet","Shinkai Makoto", 2019, "Oscar 92");
        // > Thông tin film : 
        // https://vi.wikipedia.org/wiki/%C4%90%E1%BB%A9a_con_c%E1%BB%A7a_th%E1%BB%9Di_ti%E1%BA%BFt
        // > Xem : Web lậu thôi, nhưng ít nhất là nó rất đáng xem

        deathNote.showAllAboutIt();
        deathNote.fanAniverary();

        System.out.println();

        weatheringWithYou.showAllAboutIt();
        weatheringWithYou.fanAniverary();
    }
}
