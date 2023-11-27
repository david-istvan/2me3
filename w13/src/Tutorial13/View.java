package Tutorial13;

import java.util.Scanner;

public class View {
    private Controller controller;
    private Model model;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void display() {
        System.out.println("Booking system updated:");

        System.out.println("----------------------------------------");
    	System.out.println(">>> Cars:");
        if (model.getCars().size() > 0) {
            for (Car car : model.getCars()) {
                System.out.println(car);
            }
        }
        else {
            System.out.println("Commming soon...");
        }

        System.out.println("----------------------------------------");
    	System.out.println(">>> Vacations:");
        if (model.getCars().size() > 0) {
            for (Vacation vacation : model.getVacations()) {
                System.out.println(vacation);
            }
        }
        else {
            System.out.println("Commming soon...");
        }
        
        System.out.println("----------------------------------------");
    	System.out.println(">>> Bookings:");
        if (model.getCars().size() > 0) {
            for (Booking booking : model.getBookings()) {
                System.out.println(booking);
            }
        }
        else {
            System.out.println("No bookings yet...");
        }
        System.out.println("----------------------------------------");
    }

    public void getBookingInfo() {

        System.out.println("Create new booking");
        String startDate = readString(">>> Input start date:");
        String endDate = readString(">>> Input end date:");
        int vacationId = readInt(">>> Input vacation Id:");
        int carId = readInt(">>> Input car Id:");

        controller.createBooking(startDate, endDate, carId, vacationId);
    }

    public int getAction() {
        System.out.println("1 - Create booking");
        System.out.println("2 - Exit");
        int action = readInt(">>> Input action:");
        while (action < 1 || action > 2) {
            System.out.println(">>> Invalid input");
            action = readInt(">>> Input action again:");
        }
        return action;
    }

    public void update() {
        // This method will be called when the Model changes state
        display();
    }

    private int readInt(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private String readString(String message) {
        Scanner in = new Scanner(System.in);  
        System.out.println(message);
        return in.nextLine();
    }
}
