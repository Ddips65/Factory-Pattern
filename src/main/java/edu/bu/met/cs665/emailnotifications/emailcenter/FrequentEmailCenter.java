/**
 * Assignment-3
 * Description: FrequentEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;
import edu.bu.met.cs665.emailnotifications.customertype.FrequentCustomer;

public class FrequentEmailCenter extends EmailCenter {
  /**
   * Factory method! implementation of method, creates the concrete customer.
   *
   * @param type String
   * @return FrequentCustomer
   */
  Customer generateEmail(String type) {
    if (type.equals("frequent")) {
      return new FrequentCustomer();
    } else {
      return null;
    }
  }
}
