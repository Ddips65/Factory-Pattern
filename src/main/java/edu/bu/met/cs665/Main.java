/**
 * Assignment-3
 * Description: Main method to run program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.emailnotifications.emailcenter.BusinessEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.EmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.FrequentEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.NewEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.ReturningEmailCenter;
import edu.bu.met.cs665.emailnotifications.emailcenter.VipEmailCenter;

public class Main {
  /**
   * A main method to run examples.
   *
   * @param args String
   */
  public static void main(String[] args) {

    EmailCenter businessCustomer = new BusinessEmailCenter();
    businessCustomer.sendEmail("business", "Keli", "keli@gmail.com");

    EmailCenter frequentCustomer = new FrequentEmailCenter();
    frequentCustomer.sendEmail("frequent", "Lucy", "lucy@gmail.com");

    EmailCenter newCustomer = new NewEmailCenter();
    newCustomer.sendEmail("new", "John", "john@gmail.com");

    EmailCenter vipCustomer = new VipEmailCenter();
    vipCustomer.sendEmail("vip", "Steve", "steve@gmail.com");

    EmailCenter returnCustomer = new ReturningEmailCenter();
    returnCustomer.sendEmail("returning", "Tony", "tony@gmail.com");
  }
}
