import java.util.ArrayDeque;
import java.util.Queue;

public class HelpCenter {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(Customer customer, Category category){
        enquiries.offer( new Enquiry(customer, category));
    }

    public void processAllEnquiries(){
        // using the poll approach
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Ticket has been processed");
        }

        // using the isEmpty approach
       /* while(!enquiries.isEmpty()){
            Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Ticket has been processed");
        } */

    }

    public static void main(String[] args) {
        HelpCenter helpCenter = new HelpCenter();

        helpCenter.enquire(Customer.JACK, Category.SILVER); // top element in the queue
        helpCenter.enquire(Customer.ANNA, Category.GOLD);
        helpCenter.enquire(Customer.TOM, Category.BRONZE);
        helpCenter.enquire(Customer.EDDY, Category.DIAMOND);

        helpCenter.processAllEnquiries();

    }
}
