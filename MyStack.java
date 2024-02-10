package MyStack;


public class MyStack {
    public MyStack(int size) {
        elements = new int[size];

    }

    public boolean isEmpty() {
        return isEmpty;

    }

    public void push(int element) {
        if (top < elements.length - 1) {
            elements[++top] = element;
            isEmpty = false;
        }


    }



    private boolean isEmpty = true;

    private int[] elements;

    private int top = -1;

    public void pop() {
        if (top >= 0) {
            top--;
            isEmpty = (top == -1);
        }
    }

    public int peek() {
        if (top >=0){
            return elements[top];
        }else{
           return 0;
        }

    }
}