package test.design.patterns.behavioral.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChainRunner {

    public static final Logger log = LogManager.getLogger(ChainRunner.class);

    public static void main(String args) {

        log.info(args);

        Component layer = new LayerComponent(TypesCo.LAYER);
        Component panel = new PanelComponent(TypesCo.PANEL);
        Component table = new TableComponent(TypesCo.TABLE);
        Component button = new ButtonComponent(TypesCo.BUTTON);
        Component checkbox = new CheckBoxComponent(TypesCo.CHECKBOX);

        layer.setNextComponent(panel);
        panel.setNextComponent(table);
        table.setNextComponent(button);
        button.setNextComponent(checkbox);

        layer.validateComponent("#layer1", TypesCo.LAYER);
        layer.validateComponent("#panel1", TypesCo.PANEL);
        layer.validateComponent("#table1", TypesCo.TABLE);
        layer.validateComponent("#button1", TypesCo.BUTTON);
        layer.validateComponent("#checkbox1", TypesCo.CHECKBOX);

        log.info(args);
    }
}
