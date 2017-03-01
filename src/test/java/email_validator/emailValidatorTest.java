package email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class emailValidatorTest {
	emailValidator test = new emailValidator();
	@Test
	public void testEmail1() {
		String email = "123123@gmail.com";
		assertEquals(2,test.checkInpt(email));
	}
	@Test
	public void testEmail2() {
		String email = "213123123123.com";
		assertEquals(1,test.checkInpt(email));
	}
	@Test
	public void testEmail3() {
		String email = "2131231231@23...com";
		assertEquals(2,test.checkInpt(email));
	}
	@Test
	public void testEmail4() {
		String email = "asdasdqwecom";
		assertEquals(0,test.checkInpt(email));
	}
	@Test
	public void testEmail5() {
		String email = "asdasdqw@ecom";
		assertEquals(1,test.checkInpt(email));
	}
	@Test
	public void testEmail6() {
		String email = "asdasd@@@@@@@qwecom";
		assertEquals(0,test.checkInpt(email));
	}
}
