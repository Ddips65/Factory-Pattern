/** Assignment-3 Description: VipEmailCenter is extends the EmailCenter class. */

package edu.bu.met.cs665.emailnotifications.emailcenter;

import edu.bu.met.cs665.emailnotifications.customer.Customer;
import edu.bu.met.cs665.emailnotifications.customertype.VipCustomer;

public class VipEmailCenter extends EmailCenter {
  /**
   * Factory method! implementation of method, creates the concrete customer. *
   *
   * @param type String
   * @return VipEmailCenter
   */
  Customer generateEmail(String type) {
    if (type.equals("vip")) {
      return new VipCustomer();
    } else {
      return null;
    }
  }
}
