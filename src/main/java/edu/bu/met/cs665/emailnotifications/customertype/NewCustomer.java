/**
 * Assignment-3
 * Description: NewCustomer is implements the interface Customer.
 */

package edu.bu.met.cs665.emailnotifications.customertype;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public class NewCustomer implements Customer {
  /**
   * Template for New Customers.
   *
   * @return String with the email template information.
   */
  @Override
  public String typeofEmailTemplate() {
    return ("Template for New Customers!");
  }
}
