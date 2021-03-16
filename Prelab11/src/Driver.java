import java.util.HashMap;
import java.util.Map;

class ExtendedAddress{
    String email;
    String phoneNumber;
    String address;

    public ExtendedAddress(String email, String phoneNumber, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
public class Driver {

    public static void main(String args[]){
        Map<String, ExtendedAddress> addressBook = new HashMap<>();
        addressBook.put("Nabil",  new ExtendedAddress("nabil@plapla.com", "6044559872", "508 Thasd St. Coquitlam"));
        addressBook.put("Cody",   new ExtendedAddress("nabil@plapla.com", "6044559872", "508 Thasd St. Coquitlam"));

    }
}
