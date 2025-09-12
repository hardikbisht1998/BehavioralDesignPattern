package commandPattern;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad {
    public JTextArea textField;
    public String clipBoard;
    private ActionHistory actionHistory=new ActionHistory();

    public void starter(){
        JFrame frame=new JFrame("HHHHHHHHHH: Standard text Editor: HHHHHHHH ");
        JPanel content=new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content,BoxLayout.Y_AXIS));
        textField=new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC=new JButton("Ctrl+c");
        JButton ctrlV=new JButton("Ctrl+v");
        JButton ctrlX=new JButton("Ctrl+x");
        JButton ctrlZ=new JButton("Ctrl+z");
        Notepad notepad=this;

        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyAction(notepad));
            }
        });

        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteAction(notepad));
            }
        });

        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutAction(notepad));
            }
        });

        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlV);
        buttons.add(ctrlX);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }

    public void executeCommand(Action action){
        if(action.execute()){
            actionHistory.push(action);
        }
    }

    public void undo(){
        if(actionHistory.isEmpty()) return;
        Action action=actionHistory.pop();
        if (action!=null) action.undo();
    }

}
