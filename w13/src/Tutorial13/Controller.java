package Tutorial13;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setController(this); // Link the view to this controller
        this.view.setModel(model); // Link the view to model
        this.model.addView(view); // Add the view to the model's observer list
        initData();
    }

    private void initData() {
        // You can set up initial data or configurations here
        // For example, add some cars and vacations to the model
        Car car1 = new Car(10000, 4, "ABC123");
        Car car2 = new Car(12000, 2, "XYZ789");
        model.addCar(car1);
        model.addCar(car2);

        Vacation vacation1 = new Vacation(5000, "Hawaii", true);
        Vacation vacation2 = new Vacation(3000, "Bahamas", false);
        model.addVacation(vacation1);
        model.addVacation(vacation2);
        
        createBooking("20211031", "20211115", 0, 0);
    }

    public void createBooking(String startDate, String endDate, int carId, int vacationId) {
        // Logic to create a booking and add it to the model
        Booking booking = new Booking(startDate, endDate);

        // Search vacation
        for (Vacation vacation : model.getVacations()) {
            if (vacation.getId() == vacationId) {
                booking.addProduct(vacation);
                break;
            }
        }

        // Search car
        for (Car car : model.getCars()) {
            if (car.getId() == carId) {
                booking.addProduct(car);
                break;
            }
        }
        
        model.createBooking(booking);
    }
    
    public void run() {
        // Start the system or controller logic
        // This could be the entry point for the application

        while (true) {
            // Read unser input action in view
            int action = view.getAction();
            if (action == 1) {
                view.getBookingInfo();
            }
            else if (action == 2) {
                break;
            }
            else {
                break;
            }
         }
    }
}
