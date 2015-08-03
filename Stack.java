/**
 * Created by Anastasia on 03.08.2015.
 */
public interface Stack {

    void push(Object o) throws StackException;
    Object pop() throws StackException;
    void clear();
    void print();
}
