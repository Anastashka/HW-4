/**
 * Created by Anastasia on 03.08.2015.
 */
public class StackImpl implements Stack{
    private int sizeArray;
    private Object[] array;
    private int numberElement = 0;

    StackImpl(int arrSize) {
        this.array = new Object[arrSize];
        this.sizeArray = arrSize;
    }

    @Override
    public void push(Object o) throws StackException {

        numberElement++;

        try {
            if (numberElement > sizeArray) {
                throw new StackException("Stack is full");
            }

            for (int i = 0; i < sizeArray; i++) {
                if (array[i] == null) {
                    array[i] = o;
                    break;
                }
            }
        }
        catch (StackException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public Object pop() throws StackException {
        try {
            if (array[0] != null) {
                return array[0];
            } else {
                throw new StackException("Stack is empty");
            }
        } catch (StackException exception) {
            return exception.getMessage();
        }
    }

    @Override
    public void clear() {

        for (int i = 0; i < sizeArray; i++) {
            array[i] = null;
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < sizeArray; i++) {
            System.out.println(array[i]);
        }
    }
}

