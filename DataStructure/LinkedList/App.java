import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int select = 0;
            do
            { 
                try {
                    System.out.println("\nSelection : "
                            + "\n1. Display current"
                            + "\t2. Is list empty"
                            + "\n3. Get size LL"
                            + "\t4. "
                            + "\n5. Add to head"
                            + "\t6. Add to tail"
                            + "\n7. Remove by data"
                            + "\t8. Remove by index"
                        );
                select = scanner.nextInt();            
                switch (select) {
                case 1:
                    list.display();
                    break;
                case 2:
                    System.out.println("List now is" + (list.isEmpty() ? " " : " not") + "empty.");
                    break;
                case 3:
                    System.out.println("Curren list size : " + list.size());
                    break;
                case 5:
                    System.out.print("Head data = ");
                    int data5 = scanner.nextInt();
                    Node node5 = Node.setNode(data5);
                    list.addToHead(node5);
                    break;
                case 6:
                    System.out.print("Tail data = ");
                    int data6 = scanner.nextInt();
                    Node node6 = Node.setNode(data6);
                    list.addToTail(node6);
                    break;
                case 7:
                    System.out.println("Data : ");
                    int dataToRemove = scanner.nextInt();
                    list.remove(dataToRemove); 
                default:
                    break;
            }
        } catch(Exception e) {
            System.out.println("Selection is error.");
        };
        } while (select != 0);
    }
}