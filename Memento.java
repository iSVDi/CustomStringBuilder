public class Memento {

    private final StringBuilder state;

    Memento(StringBuilder state) {
        this.state = state;
    }

    StringBuilder getState() {
        return state;
    }
}
