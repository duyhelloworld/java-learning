package Java64.BoxHash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
 
public class BoxHash {
    Set<String> box = new HashSet<String>();
    private int lengthCode;

    public int getLengthCode() {
        return this.lengthCode;
    }

    public void setLengthCode(int lengthCode) {
        this.lengthCode = lengthCode;
    }

    public BoxHash() {
    }

    public BoxHash(Set<String> box) {
        this.box = box;
    }

    public Set<String> getBox() {
        return this.box;
    }

    public int hashCode(Set<String> box) {
        return this.hashCode(box);
    }

    @Override
    public String toString() {
        return "{" +
                " box : '" + getBox() + "'" +
                "}";
    }
    
    public boolean checkLengthCode(String code) {
        return code.length() == this.getLengthCode();
    }

    public boolean addCode(String code) {
        return box.add(code);
    }

    public int size(){
        return box.size();
    }
    
    public void showAllCodeInBox() {
        // for (String code : box) {
        //     System.out.println(code);
        // }
        System.out.println(Arrays.toString(this.box.toArray()));
        System.out.println("Now box has " + box.size() + (box.size() < 2 ? " code." : " codes."));
    }

    public boolean searchCode(String code) {
        return box.contains(code);
    }
    
    public boolean isEmptyBox() {
        return box.isEmpty();
    }

    public void clearAll() {
        box.clear();
        this.showAllCodeInBox();
    }

    public boolean removeCode(String code) {
        return box.remove(code);
    }

    public int totalCodeInBox() {
        return this.box.size();
    }

    private String getRandomCode() {
        String codeRand = "";
        Random rd = new Random();
        int index = rd.nextInt(totalCodeInBox());
        codeRand = this.box.toArray()[index].toString().substring(rd.nextInt(this.lengthCode));
        return codeRand;
    }
    
    public int sweepstakes() {
        String code = getRandomCode();
        if (this.searchCode(code)) {
            return 1;
        }
        for (String codeInBox : box) {
            if (codeInBox.contains(code.substring(0, (int)this.getLengthCode() / 2))) {
                return 2;
            } else if (codeInBox.contains(code.substring((int)this.getLengthCode() / 2 + 1, this.getLengthCode()))) {
                return 3;
            }
        }
        return 0;
    }
}
