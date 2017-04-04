package com.laboon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StepButton extends JButton {

    private MainPanel _m;
    
	/**
	 *Takes in a Mainpanel, sets _m to it, adds a StepButtonListener to it and 
	 *creates a button called "Step"  
	 *@param m MainPanel to be the panel to step when action is to be performed
	 */

    public StepButton(MainPanel m) {
	super("Step");
	_m = m;
	addActionListener(new StepButtonListener());
    }

    static class StepButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	}
	    // _m.step();
    }    
    
}
