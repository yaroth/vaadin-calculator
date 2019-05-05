package ch.bfh.bti7081;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains several buttons and  listeners.
 */
@Route("despresso.html")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {
    public MainView() {
        // Create the model and the Vaadin view implementation
        CalculatorModel model = new CalculatorModel();
        CalculatorViewImpl view = new CalculatorViewImpl();
        // The presenter connects the model and view
        new CalculatorPresenter(model, view);
        // The view implementation is a Vaadin component
        add(view);
    }
}
