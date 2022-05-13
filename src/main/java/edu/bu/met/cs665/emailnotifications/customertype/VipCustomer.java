/**
 * Assignment-3
 * Description: VipCustomer is implements the interface Customer.
 */

package edu.bu.met.cs665.emailnotifications.customertype;

import edu.bu.met.cs665.emailnotifications.customer.Customer;

public class VipCustomer implements Customer {
  /**
   * Template for Vip Customers.
   *
   * @return String with the email template information.
   */
  @Override
  public String typeofEmailTemplate() {
    // System.out.println("Generate E-mail Template for VIP Customers!");
    return ("Template for Vip Customers!");
  }
}
