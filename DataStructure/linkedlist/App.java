import java.util.Scanner;

public class App {
    Node node;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList list = new LinkedList();
            int select = 0;
                do
                { 
                    try {
                        System.out.println("\nSelection : "
                                + "\n1. Display current"
                                + "\t2. Is list empty"
                                + "\n3. Get size LL"
                                + "\t4. Find node by data"
                                + "\n5. Add to head"
                                + "\t6. Add to tail"
                                + "\n7. Remove by data"
                                + "\t8. Get index"
                            );
                    select = scanner.nextInt();     
                    Node g_node = new Node();

                    switch (select) {
                    case 1:
                        list.display();
                        break;
                    case 2:
                        System.out.println("List now is" + (list.isEmpty() ? " " : " not ") + "empty.");
                        break;
                    case 3:
                        System.out.println("Curren list size : " + list.size());
                        break;
                    case 4:
                        System.out.println("Enter data : ");
                        int dataToFind = scanner.nextInt();
                        System.out.println("Data " + dataToFind + " is "
                                + (list.contains(dataToFind) ? " existed." : " not existed."));
                        break;
                    case 5:
                        System.out.print("Head data = ");
                        int data5 = scanner.nextInt();
                        g_node = Node.setNode(data5);
                        list.addToHead(g_node);
                        break;
                    case 6:
                        System.out.print("Tail data = ");
                        int data6 = scanner.nextInt();
                        g_node = Node.setNode(data6);
                        list.addToTail(g_node);
                        break;
                    case 7:
                        System.out.println("Data : ");
                        int dataToRemove = scanner.nextInt();
                        list.remove(dataToRemove);
                    case 8:
                        if (list.isEmpty()) {
                            System.out.println("List empty. Choose 5 to enter data.");
                            break;
                
                        }
                        System.out.println("Data : ");
                        int data = scanner.nextInt();
                        g_node = Node.setNode(data);
                        System.out.println("Index of " + data + " : " + list.indexOf(g_node));
                        break;
                    default:
                        break;
                }
            } catch(Exception e) {
                System.out.println("Selection is error.");
            };
            } while (select != 0);
        }
    }
}