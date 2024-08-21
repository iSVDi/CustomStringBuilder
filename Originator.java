/*

// creating and restore snapshot
class Originator(CustomSB)
    private String value

    Originator(String value)



// object with data.
class memento


class caretaker
- originator
- history: [Memento]
    undo()

    // called before do any operation over stringBuilder
    private save()
 */

public class Originator {
    private StringBuilder state;

    Originator(String state) {
        this.state = new StringBuilder(state);
    }

    void setState(StringBuilder strB) {
        state = new StringBuilder(strB.toString());
    }

    Memento getMemento() {
        StringBuilder stringBuilder = new StringBuilder(state.toString());

        return new Memento(stringBuilder);
    }

    void restore(Memento memento) {
        state = new StringBuilder(memento.getState().toString());
    }

}


