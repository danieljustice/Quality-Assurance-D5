package com.laboon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunButton extends JButton {

    private MainPanel _m;
    
	/**
	 *Takes in a Mainpanel, sets _m to it, adds a RunButtonListener to it and 
	 *creates a button called "Run"  
	 *@param m MainPanel to be the panel to run when action is to be performed
	 */

    public RunButton(MainPanel m) {
	super("Run");
	_m = m;
	addActionListener(new RunButtonListener());
    }

    class RunButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
	    _m.run();
	}
    }    
    
}
