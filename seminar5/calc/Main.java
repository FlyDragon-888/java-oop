package seminar5.calc;

import seminar5.calc.controllers.CalcController;
import seminar5.calc.models.Logger;
import seminar5.calc.views.ViewCalc;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger("seminar5/calc/log.txt");
        CalcController calc = new CalcController(logger);
        ViewCalc view = new ViewCalc(calc);
        logger.addToLog("Calc started");
        view.run();
        logger.addToLog("Calc stopped");
    }
}
