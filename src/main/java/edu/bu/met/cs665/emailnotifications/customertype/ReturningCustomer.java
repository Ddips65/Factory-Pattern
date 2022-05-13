/**
 * Assignment-3
 * Description: ReturningCustomer is implements the interface Customer.
 */

package edu.bu.met.cs665.emailnotifications.customertype;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public class ReturningCustomer implements Customer {
  /**
   * Template for Returning Customers.
   *
   * @return String with the email template information.
   */
  @Override
  public String typeofEmailTemplate() {
    // System.out.println("Generate E-mail Template for Returning Customers!");
    return ("Template for Returning Customers!");
  }
}
