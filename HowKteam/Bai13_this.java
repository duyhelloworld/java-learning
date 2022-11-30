// package HowKteam;
/**
 * ConVat
 */
class SinhVat {
    public String name;
    int soChan;
    protected String loai;
    boolean isMale;
    
    public SinhVat(){};
    // public SinhVat(String name, int soChan, String loai, bool isMale){
    //     this.loai = loai;
    //     this.name = name;
    //     this.soChan = soChan;
    //     this.isMale = isMale;
    // }
    // Code thường quá

    // > Advanced :
    // > Reusage code : lập constructor với 1 số ít data
    public SinhVat(String name){
        this.name = name;
    }

    public SinhVat(String name, String loai){
        this(name);
        this.loai = loai;
    }

    public SinhVat(String name, String loai, int soChan, boolean isMale){
        this(name, loai);
        this.soChan = soChan;
        this.isMale = isMale;
    }
    // > Code kiểu này ko chậm hơn mà còn có lợi về lâu dài. nên làm như vậy

    // > 1 tác dụng khác của this : tạo 2 object bằng nhau qua phương thức đc cấp
    public SinhVat getOther(){
        return this;
    }

    public void getSpecify() {
        // > Chỗ duwois này chỉ in ra, nên dùng this hay ko đều đc

        System.out.println("Tên : " + this.name);
        System.out.println("Loài : " + this.loai);
        System.out.println("Số chân : " + this.soChan);
        System.out.println("Là đực rựa ?  - " + this.isMale);
    }
}
public class Bai13_this {
    public static void main(String[] args) {
    
    SinhVat linhG = new SinhVat("Linh G", "Người", 2, false);
    SinhVat hiepGa = new SinhVat("Hiệp", "Nghiện", 2, true);
        linhG.getSpecify();
        hiepGa.getSpecify();

    SinhVat duyDepTraiProVipVaiLon = new SinhVat("Phạm Duy");
    duyDepTraiProVipVaiLon = hiepGa.getOther();
    duyDepTraiProVipVaiLon.name = "Duy Duy";

    duyDepTraiProVipVaiLon.loai = "Người";

    duyDepTraiProVipVaiLon.getSpecify();
    }
}
