/**
 * Assignment-3
 * Description: BusinessEmailCenter is extends the EmailCenter class.
 */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;
import edu.bu.met.cs665.emailnotifications.customertype.BusinessCustomer;

public class BusinessEmailCenter extends EmailCenter {
  /**
   * Factory method! implementation of method, creates the concrete customer.
   * @param type String
   * @return new BuisnessCustomer
   */
  @Override
  Customer generateEmail(String type) {
    if (type.equals("business")) {
      return new BusinessCustomer();
    } else {
      return null;
    }
  }
}
