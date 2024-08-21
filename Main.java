public class Main {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker("hello");
        System.out.println(caretaker.getMemento().getState());

        caretaker.append("world");
        System.out.println(caretaker.getMemento().getState());

        caretaker.deleteCharAt(0);
        System.out.println(caretaker.getMemento().getState());

        var offset = caretaker.getMemento().getState().length();
        caretaker.insert(offset, "hello");
        System.out.println(caretaker.getMemento().getState());

        caretaker.replace(0, 4, "world");
        System.out.println(caretaker.getMemento().getState());

        caretaker.delete(0, 5);
        System.out.println(caretaker.getMemento().getState());




    }


}


