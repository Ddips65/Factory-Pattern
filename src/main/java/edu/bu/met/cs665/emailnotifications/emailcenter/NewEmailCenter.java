/**
 * Assignment-3
 * Description: NewEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;
import edu.bu.met.cs665.emailnotifications.customertype.NewCustomer;

public class NewEmailCenter extends EmailCenter {
  /**
   * Factory method! implementation of method, creates the concrete customer. *
   *
   * @param type String
   * @return NewCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("new")) {
      return new NewCustomer();
    } else {
      return null;
    }
  }
}
