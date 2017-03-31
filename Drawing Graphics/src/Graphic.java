import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.awt.dnd.DropTarget;

import java.awt.event.*;

import java.awt.peer.ContainerPeer;
import java.awt.peer.ComponentPeer;
import java.awt.peer.LightweightPeer;

import java.beans.PropertyChangeListener;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.PrintStream;
import java.io.PrintWriter;

import java.lang.ref.WeakReference;
import java.security.AccessController;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;

import javax.accessibility.*;

import sun.util.logging.PlatformLogger;

import sun.awt.AppContext;
import sun.awt.AWTAccessor;
import sun.awt.CausedFocusEvent;
import sun.awt.PeerEvent;
import sun.awt.SunToolkit;

import sun.awt.dnd.SunDropTargetEvent;

import sun.java2d.pipe.Region;

import sun.security.action.GetBooleanAction;

public class Graphic extends JPanel {
    
    public void paintComponents (Graphics g)
    {
        super.paintComponents(g);
        this.setBackground(Color.WHITE);
        
        
        g.setColor(Color.BLUE);
        g.fillRect(25,25,100, 30);
        
        g.setColor(new Color(190,81,215));
        g.fillRect(25, 65,100, 30);
        
        g.setColor(Color.RED);
        g.drawString("this is jahid",25,120);
        
        
          
        
            
      add(Graphic(),BorderLayout.CENTER);
      setSize(300,200);
      setVisible(true);
        
    }
}
