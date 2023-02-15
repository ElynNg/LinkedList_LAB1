public class Main {
    public static void main(String args[]){
        LinkedList t = new LinkedList();
        int[] a = {7, 2, 9, 8, 6, 3};
        t.insertToFirst(10);
        t.addTail(7);
        t.addMany(a);
        t.traverse();
        System.out.println("\nTraverse: ");
        t.traverse();
        System.out.println("\nSearch: ");
        System.out.println(t.search(9));
    }
}