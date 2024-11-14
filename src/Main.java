public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        ChainLink linkOne = new ChainLink("red");
        ChainLink linkTwo = new ChainLink("blue");
        ChainLink linkThree = new ChainLink("green");

        list.append(linkOne);
        list.append(linkTwo);
        list.append(linkThree);

        ChainLink retrievedLinkOne = list.get(0); 
        ChainLink retrievedLinkTwo = list.get(1); 
        ChainLink retrievedLinkThree = list.get(2); 

        if (retrievedLinkOne != null) {
            System.out.println("First link color: " + retrievedLinkOne.color);
        }
        if (retrievedLinkTwo != null) {
            System.out.println("Second link color: " + retrievedLinkTwo.color);
        }
        if (retrievedLinkThree != null) {
            System.out.println("Third link color: " + retrievedLinkThree.color);
        }
    }
}
