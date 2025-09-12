package iteratorPattern;

public interface MyIterator {
    boolean hasNext();
    Employee getNext();
    void reset();
}
