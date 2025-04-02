import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;  //ArrayList, Stack

public class BinaryNumber extends JFrame implements ActionListener {


  JPanel mainPanel;

  JMenuBar menuBar;
  JMenu fileMenu;
  JMenuItem exitMenuItem;

  // ***** declaration of JPanels for BorderLayout *****
  JPanel northPanel;
  JPanel southPanel;
  JPanel westPanel;
  JPanel eastPanel;
  JPanel centerPanel;

  // ***** define buttons1 and buttons2 as ArrayLists *****
  ArrayList<JButton> buttons1;  // references 0 or 1
  ArrayList<JButton> buttons2;  // shows the place value (not clickable)

  int theBits = 8;  // we will only show 8 bits

  JLabel spacer1, spacer2, spacer3, spacer4, spacer5;
  JLabel baseTenValueLabel, baseEightValueLabel, baseSixteenValueLabel;

  // ***** public void initialize *****
  public void initialize() {

    mainPanel = new JPanel();

    // ***** assignments for menu variables *****
    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    exitMenuItem = new JMenuItem("Exit");

    fileMenu.setMnemonic('F');
    exitMenuItem.setMnemonic('x');
    exitMenuItem.addActionListener(this);
    fileMenu.add(exitMenuItem);
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);

    // ***** create JPanels for a BorderLayout *****
    northPanel = new JPanel();
    southPanel = new JPanel();
    westPanel = new JPanel();
    eastPanel = new JPanel();
    centerPanel = new JPanel();

    Font fontForValueLabels = new Font("Courier New", Font.BOLD, 18);

    baseTenValueLabel = new JLabel("Base 10 Value = 0");
    baseTenValueLabel.setFont(fontForValueLabels);
    baseTenValueLabel.setForeground(Color.RED);

    baseEightValueLabel = new JLabel("Base 8 Value = 0");
    baseEightValueLabel.setFont(fontForValueLabels);

    baseSixteenValueLabel = new JLabel("Base 16 Value = 0");
    baseSixteenValueLabel.setFont(fontForValueLabels);

    southPanel.add(baseEightValueLabel);
    southPanel.add(new JLabel("   |   "));
    southPanel.add(baseTenValueLabel);
    southPanel.add(new JLabel("   |   "));
    southPanel.add(baseSixteenValueLabel);

    centerPanel.setLayout(new GridLayout(2, 8));

    Font titleFont = new Font("Courier New", Font.BOLD, 24);
    String titleString = "Base Two Converter written by Helen Zhou";
    JLabel titleLabel = new JLabel(titleString);
    titleLabel.setFont(titleFont);
    northPanel.add(titleLabel);

    buttons1 = new ArrayList<>();
    Stack<JButton> stack = new Stack<>();

    for (int i = 1; i <= theBits; i++) {
      JButton button = new JButton("0");
      button.setFont(fontForValueLabels);
      button.addActionListener(this);
      stack.push(button);
      centerPanel.add(button);
    }

    for (int i = 1; i <= theBits; i++) {
      buttons1.add(stack.pop());
    }

    buttons2 = new ArrayList<>();
    int value = 128;
    for (int i = 1; i <= theBits; i++) {
      JButton button = new JButton(value + "'s");
      button.setFont(fontForValueLabels);
      buttons2.add(button);
      centerPanel.add(button);
      value /= 2;
    }

    mainPanel.setLayout(new BorderLayout());
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(westPanel, BorderLayout.WEST);
    mainPanel.add(eastPanel, BorderLayout.EAST);
    mainPanel.add(centerPanel, BorderLayout.CENTER);

    setContentPane(mainPanel);
    setVisible(true);
  }

  public BinaryNumber() {
    setSize(820, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Base Two Conversion   My name is Helen Zhou");
    initialize();
  }

  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == exitMenuItem) {
      System.exit(0);
    } else {
      int baseTenValue = 0;
      int valueOfBit = 1;

      for (int i = 0; i < theBits; i++) {
        JButton button = buttons1.get(i);

        if (button == source) {
          String theBit = button.getText();
          button.setText(theBit.equals("1") ? "0" : "1");
        }

        if (button.getText().equals("1")) {
          baseTenValue += valueOfBit;
        }

        valueOfBit *= 2;
      }

      baseTenValueLabel.setText("Base 10 Value = " + baseTenValue);
      baseEightValueLabel.setText("Base 8 Value = " + Integer.toOctalString(baseTenValue));
      baseSixteenValueLabel.setText("Base 16 Value = " + Integer.toHexString(baseTenValue).toUpperCase());
    }
  }

  public static void main(String[] arguments) {
    new BinaryNumber();
  }
}
