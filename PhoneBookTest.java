import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PhoneBookTest {

    @Test
    public void testThatPhoneBookExist(){
        PhoneBook myPhoneBook = new PhoneBook();
        assertNotNull(myPhoneBook);


    }

    @Test
    public void testThatContactExist(){
        Contact myContact = new Contact("Solomon","08164556912","ayomidebanjo02@gmail.com","7 adebare street");
        assertNotNull(myContact);

    }
    @Test
    public void testSetName(){
        Contact myContact = new Contact("ayomide", "08103722570", "ayomidebanjo@gmail.com", "yaba");
        myContact.setName("Ayomide");
        assertEquals("Ayomide",myContact.getName());
    }

}
