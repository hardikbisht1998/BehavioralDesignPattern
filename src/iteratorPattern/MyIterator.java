package iteratorPattern;


interface MyIterator<T> {
    boolean hasNext();
    T getNext();
    void reset();
}