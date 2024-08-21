import java.util.Stack;

public class Caretaker {

    private final Originator originator;
    private Stack<Memento> states = new Stack<>();

    Caretaker(String str) {
        originator = new Originator(str);
        states.push(originator.getMemento());
    }

    private void save() {
        states.push(originator.getMemento());
    }

    void undo() {
        states.pop();
        originator.restore(states.peek());
    }

    Memento getMemento() {
        return originator.getMemento();
    }

    private StringBuilder getCurrentState() {
        return originator.getMemento().getState();
    }

    void append(String str) {
        StringBuilder currentState = getCurrentState();
        currentState.append(str);
        originator.setState(currentState);
        save();
    }

    void delete(int start, int end) {
        StringBuilder currentState = getCurrentState();
        currentState.delete(start, end);
        originator.setState(currentState);
        save();
    }

    void deleteCharAt(int index) {
        StringBuilder currentState = getCurrentState();
        currentState.deleteCharAt(index);
        originator.setState(currentState);
        save();
    }

    void insert(int offset, String str) {
        StringBuilder currentState = getCurrentState();
        currentState.insert(offset, str);
        originator.setState(currentState);
        save();
    }

    void replace(int start, int end, String str) {
        StringBuilder currentState = getCurrentState();
        currentState.replace(start, end, str);
        originator.setState(currentState);
        save();
    }


}
