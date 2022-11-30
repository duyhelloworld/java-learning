package Java64;

import java.util.HashSet;
import java.util.Set;

public class Box_Hash {
    Set<String> box = new HashSet<String>();
    private int lengthCode;

    public int getLengthCode() {
        return this.lengthCode;
    }

    public void setLengthCode(int lengthCode) {
        this.lengthCode = lengthCode;
    }

    public Box_Hash() {
    }

    public Box_Hash(Set<String> box) {
        this.box = box;
    }

    public Set<String> getBox() {
        return this.box;
    }

    public int hashCode(Set<String> box2) {
        return this.hashCode(box);
    }

    @Override
    public String toString() {
        return "{" +
                " box='" + getBox() + "'" +
                "}";
    }
    
    public boolean checkLengthCode(String code) {
        return code.length() == this.getLengthCode();
    }

    public boolean addCode(String code) {
        return box.add(code);
    }
    
    public void showAllCodeInBox() {
        for (String code : box) {
            System.out.println(code);
        }
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

    public int sweepstakes(String code) {
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
