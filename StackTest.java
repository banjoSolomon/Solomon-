import MyStack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack stack;

    @BeforeEach
    public void checkThisFirst() {
        stack = new MyStack(3);
    }

    @Test
    public void newStackIsEmptyTest() {
        stack = new MyStack(3);
        assertTrue(stack.isEmpty());


    }

    @Test
    public void addX_MyStackIsNot_EmptyTest() {
        stack = new MyStack(3);
        stack.push(4);
        assertFalse(stack.isEmpty());
        // assertThrows(ArrayIndexOutOfBoundsException.class,() ->stack.push(4));

    }

    @Test
    public void X_Remove_myStackIsEmptyTest() {
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());

    }


    @Test
    public void pickFromTheStackTest() {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assertEquals(4, stack.peek());


    }
}
