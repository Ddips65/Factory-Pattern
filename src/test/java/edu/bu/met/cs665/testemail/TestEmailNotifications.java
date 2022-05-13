/**
 * Assignment-3
 * Description: Unit test for generate email-notification for different types of the customers.
 */

package edu.bu.met.cs665.testemail;

import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.emailnotifications.emailcenter.BusinessEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.EmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.FrequentEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.NewEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.ReturningEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.VipEmailCenter;
import org.junit.Test;

public class TestEmailNotifications {

  /** Test case for check types of the business customer. */
  @Test
  public void testBusinessCustomer() {
    EmailCenter businessCustomer = new BusinessEmailCenter();
    businessCustomer.sendEmail("business", "Keli", "keli@gmail.com");
    assertEquals("business", businessCustomer.toString("business"));
  }

  /** Test case for check types of the frequent customer. */
  @Test
  public void testFrequentCustomer() {
    EmailCenter frequentCustomer = new FrequentEmailCenter();
    assertEquals(
        "Template for Frequent Customers!",
        frequentCustomer.sendEmail("frequent", "Lucy", "lucy@gmail.com").typeofEmailTemplate());
  }

  /** Test case for check types of the new customer. */
  @Test
  public void testNewCustomer() {

    EmailCenter newCustomer = new NewEmailCenter();
    assertEquals(
        "Template for New Customers!",
        newCustomer.sendEmail("new", "John", "john@gmail.com").typeofEmailTemplate());
  }

  /** Test case for check types of the vip customer. */
  @Test
  public void testVipCustomer() {

    EmailCenter vipCustomer = new VipEmailCenter();
    vipCustomer.sendEmail("vip", "Steve", "steve@gmail.com");
    assertEquals("vip", vipCustomer.toString("vip"));
  }

  /** Test case for check types of the returning customer. */
  @Test
  public void testReturnCustomer() {
    EmailCenter returnCustomer = new ReturningEmailCenter();
    returnCustomer.sendEmail("returning", "Tony", "tony@gmail.com");
    assertEquals("returning", returnCustomer.toString("returning"));
  }
}
