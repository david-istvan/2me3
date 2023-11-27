
package Tutorial13;

public class Runner {

    public static void main(String[] args) {
        // Instantiate the Model, View, and Controller
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Start program here
        controller.run();
    }
}
