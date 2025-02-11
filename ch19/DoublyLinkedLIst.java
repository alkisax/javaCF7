package gr.aueb.cf.exercises.ch19;

public class DoublyLinkedLIst  <T>{
    private Node<T> head = null;
    private Node<T> tail = null;

    public DoublyLinkedLIst(){}

    //φτιαχνω νέο κόμβο, τον next α δείχνει στο head και το prev στο null.
    //στη συνέχεια ο head θα πρέπει να δείξει στον νεό πρωτο κόμβο
    //ο tail έχει πρόβλημα μονα αν η λίστα είναι άδεια και τόττε θα πρέπει να δείχνει και αυτός στον tmp
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) {
            tail =tmp;
        } else {
            head.setPrev((tmp));
        }
        head = tmp;
    }
    // για το τελος φτιαχνω έναν κόμβο. ως Next to null και ως prev το tail. Ο tail μετα πρέπει να πάει στον tmp. Το head δεν επιρεαζετε αν υπάρχει έστω και ένα στοιχείο στην λίστα.
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        //εδω δεν οριζω τον tail αλλα τον προτελευταιο πια, (Μετα την εισαγωγη του καινοριου), γιατι στο επόμενο βήμα ο tail θα αλλάξει
        tail.setNext(tmp);

        tail = tmp;
    }

    //Μετακοινουμε το head στο head next και το παίρνει ο garbage collector.
    //αν δεν υπάρχει κανένα δεν αλλαζει κατι. αν υπάρχει ένα πρέπει και ο tail να δειξει στο ιδιο
    public Node<T> removeFirst(){
        Node<T> nodeToReturn;

        //φτιαξαμε μια βοηθητικη isEmpty
        if (isEmpty()) return null;

        nodeToReturn = head;
        head = head.getNext();
        head.setPrev(null);
        return  nodeToReturn;

    }
    // βοηθητική
    public boolean isEmpty() {
        return head == null;
    }

    // Το tail πρέπει να πάει στο προηγούμενο. Και ο προτελευταίος να βάλει ως next null(δηλαδή να αποκοπεί το τελευταίο)
    public Node<T> removeLast(){
        Node<T> nodeToReturn;
        if (isEmpty() || head.getNext() == null){
            return removeFirst();
        }

        nodeToReturn = tail;

        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t){
        Node<T> nodeToReturn = null;

        // Αν n=null τότε φτάσαμε στο τελευταίο όταν n!=null είμαστε προτελευταίο και μετά n.getNext και φτάνει τελευταίο
        // η for δεν είναι με i αλλά αυτό που τρέχει είναι ένα ολόκληρος node. Τρέχει με το να πηγένει βήμα βήμα στον επόμενο με .getNext()
        for (Node<T> n = head; n !=null; n = n.getNext()) {
            if(n.getItem().equals(t)){
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    /**
     * Time-complexity O(n)
     */
    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
    }

}
