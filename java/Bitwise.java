import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;  

public class Bitwise extends JFrame implements ActionListener { 

  JPanel mainPanel;  
  JMenuBar menuBar;
  JMenu fileMenu;
  JMenuItem exitMenuItem;
  JPanel northPanel, southPanel, westPanel, eastPanel, centerPanel;
  JLabel xLabel, yLabel, xBinaryLabel, yBinaryLabel, xAndYBinaryLabel, xOrYBinaryLabel, xXOrYBinaryLabel;
  JTextField xTextField, yTextField, xBinaryTextField, yBinaryTextField;
  JTextArea xAndYBinaryTextArea, xOrYBinaryTextArea, xXOrYBinaryTextArea;
  JButton calculateButton;

  public void initialize() { 
    mainPanel = new JPanel();
    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    exitMenuItem = new JMenuItem("Exit");
    
    fileMenu.setMnemonic('F');
    exitMenuItem.setMnemonic('x');
    exitMenuItem.addActionListener(this);
    fileMenu.add(exitMenuItem);
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);

    northPanel = new JPanel();
    southPanel = new JPanel();
    westPanel = new JPanel();
    eastPanel = new JPanel();
    centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(7, 4));

    Font mainFont = new Font("Courier New", Font.BOLD, 16);

    xLabel = new JLabel("       x   (in base 10)");
    xLabel.setFont(mainFont);
    xTextField = new JTextField("", 32);
    xTextField.setFont(mainFont);
    centerPanel.add(xLabel);
    centerPanel.add(xTextField);

    yLabel = new JLabel("       y   (in base 10)");
    yLabel.setFont(mainFont);
    yTextField = new JTextField("", 32);
    yTextField.setFont(mainFont);
    centerPanel.add(yLabel);
    centerPanel.add(yTextField);

    xBinaryLabel = new JLabel("       x in Binary");
    xBinaryLabel.setFont(mainFont);
    xBinaryTextField = new JTextField("", 32);
    xBinaryTextField.setFont(mainFont);
    xBinaryTextField.setEditable(false);
    xBinaryTextField.setBackground(Color.MAGENTA);
    centerPanel.add(xBinaryLabel);
    centerPanel.add(xBinaryTextField);

    yBinaryLabel = new JLabel("       y in Binary");
    yBinaryLabel.setFont(mainFont);
    yBinaryTextField = new JTextField("", 32);
    yBinaryTextField.setFont(mainFont);
    yBinaryTextField.setEditable(false);
    yBinaryTextField.setBackground(Color.MAGENTA);
    centerPanel.add(yBinaryLabel);
    centerPanel.add(yBinaryTextField);

    xAndYBinaryLabel = new JLabel("       x & y   (and)");
    xAndYBinaryLabel.setFont(mainFont);
    xAndYBinaryTextArea = new JTextArea("", 3, 32);
    xAndYBinaryTextArea.setFont(mainFont);
    xAndYBinaryTextArea.setEditable(false);
    xAndYBinaryTextArea.setBackground(Color.CYAN);
    centerPanel.add(xAndYBinaryLabel);
    centerPanel.add(xAndYBinaryTextArea);

    xOrYBinaryLabel = new JLabel("       x | y   (or)");
    xOrYBinaryLabel.setFont(mainFont);
    xOrYBinaryTextArea = new JTextArea("", 3, 32);
    xOrYBinaryTextArea.setFont(mainFont);
    xOrYBinaryTextArea.setEditable(false);
    xOrYBinaryTextArea.setBackground(Color.YELLOW);
    centerPanel.add(xOrYBinaryLabel);
    centerPanel.add(xOrYBinaryTextArea);

    xXOrYBinaryLabel = new JLabel("       x ^ y   (exclusive or)");
    xXOrYBinaryLabel.setFont(mainFont);
    xXOrYBinaryTextArea = new JTextArea("", 3, 32);
    xXOrYBinaryTextArea.setFont(mainFont);
    xXOrYBinaryTextArea.setEditable(false);
    xXOrYBinaryTextArea.setBackground(Color.CYAN);
    centerPanel.add(xXOrYBinaryLabel);
    centerPanel.add(xXOrYBinaryTextArea);

    Font buttonFont = new Font("Courier New", Font.BOLD, 18);
    calculateButton = new JButton("Calculate");
    calculateButton.setFont(buttonFont);
    calculateButton.addActionListener(this);
    southPanel.add(calculateButton);

    mainPanel.setLayout(new BorderLayout());
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(eastPanel, BorderLayout.EAST);
    mainPanel.add(westPanel, BorderLayout.WEST);
    mainPanel.add(centerPanel, BorderLayout.CENTER);
    setContentPane(mainPanel);

    Toolkit tk = Toolkit.getDefaultToolkit();   
    int xSize = ((int) tk.getScreenSize().getWidth());   
    int ySize = ((int) tk.getScreenSize().getHeight()) - 35;   
    setSize(xSize, ySize);
    setVisible(true); 
  } 

  public Bitwise() { 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Bitwise written by Helen Zhou");
    initialize();
  }

  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == exitMenuItem) {
      System.exit(0);
    } else if (source == calculateButton) {
      boolean xyOk = true;
      int x = 0, y = 0;
      String xString = xTextField.getText().trim();
      if (!xString.equals("")) {
        x = Integer.parseInt(xString);
        xBinaryTextField.setText(getBinaryString(x));
      } else {
        xyOk = false;
        xBinaryTextField.setText("");
      }

      String yString = yTextField.getText().trim();
      if (!yString.equals("")) {
        y = Integer.parseInt(yString);
        yBinaryTextField.setText(getBinaryString(y));
      } else {
        xyOk = false;
        yBinaryTextField.setText("");
      }

      if (xyOk) {
        xAndYBinaryTextArea.setText(getBinaryString(x & y));
        xOrYBinaryTextArea.setText(getBinaryString(x | y));
        xXOrYBinaryTextArea.setText(getBinaryString(x ^ y));
      } else {
        xAndYBinaryTextArea.setText("");
        xOrYBinaryTextArea.setText("");
        xXOrYBinaryTextArea.setText("");
      }
    }
  }

  public String getBinaryString(int number) {
    String binaryString = "";
    for (int i = 0; i < 32; i++) {
      int bit = number & 1;
      binaryString = bit + binaryString;
      number >>= 1;
    }
    return binaryString;
  }

  public static void main(String[] args) {
    new Bitwise();
  }
}
