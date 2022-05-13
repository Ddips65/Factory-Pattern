/**
 * Assignment-3
 * Description: BusinessCustomer is implements the interface Customer.
 */

package edu.bu.met.cs665.emailnotifications.customertype;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public class BusinessCustomer implements Customer {
  /**
   * Template for businessCustomer.
   *
   * @return String with the email template information.
   */
  @Override
  public String typeofEmailTemplate() {
    return ("Template for Business Customers!");
  }
}
