/**
 * Assignment-3
 * Description: FrequentCustomer is implements the interface Customer.
 */

package edu.bu.met.cs665.emailnotifications.customertype;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public class FrequentCustomer implements Customer {
  /**
   * Template for Frequent Customers.
   *
   * @return String with the email template information.
   */
  @Override
  public String typeofEmailTemplate() {
    return ("Template for Frequent Customers!");
  }
}
