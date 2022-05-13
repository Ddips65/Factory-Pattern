/**
 * Assignment-3
 * Description: ReturningEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;
import edu.bu.met.cs665.emailnotifications.customertype.ReturningCustomer;

public class ReturningEmailCenter extends EmailCenter {
  /**
   * Factory method! implementation of method, creates the concrete customer. *
   *
   * @param type String
   * @return ReturningCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("returning")) {
      return new ReturningCustomer();
    } else {
      return null;
    }
  }
}
