package Tutorial13;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private View view;
    private List<Booking> bookings = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<Vacation> vacations = new ArrayList<>();

    public void addView(View view) {
        this.view = view;
    }

    public void notifyViews() {
        if (view != null) {
            view.update();
        }
    }

    public void createBooking(Booking booking) {
        bookings.add(booking);
        notifyViews(); // Notify the view after adding a booking
    }

    // Method to add a Car to the list of cars
    public void addCar(Car car) {
        if (car != null) {
            cars.add(car);
            notifyViews(); // Notify the view that a new car has been added
        }
    }

    // Method to add a Vacation to the list of vacations
    public void addVacation(Vacation vacation) {
        if (vacation != null) {
            vacations.add(vacation);
            notifyViews(); // Notify the view that a new vacation has been added
        }
    }

    // Getters for the lists, if needed for other operations or tests
    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Vacation> getVacations() {
        return vacations;
    }
}
