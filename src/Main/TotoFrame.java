
package Main;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TotoFrame extends JFrame {
    private final int[] choisTaierd = new int[6];

    public TotoFrame() {
        int numbar = 0;
        int numbar1 = 0;
        String chois = "0";
        int choisSecond = 0;
        int[] choisThaierd = new int[6];

        this.setTitle("Toto");
        this.setSize(900, 600);

        JLabel lab = new JLabel();
        lab.setBounds(180, 60, 200, 50);
        lab.setText("TOTO 2 6/49");
        lab.getFont();

        JTextField choisOfNumber = new JTextField();
        choisOfNumber.setBounds(50, 500, 300, 30);
        choisOfNumber.getFont();

        JButton panel = new JButton();
        panel.setLayout((LayoutManager)null);
        this.getContentPane().add(panel);
        panel.setLayout((LayoutManager)null);
        this.getContentPane().add(panel);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);

        JButton startChoisNumbar = new JButton("Старт за избор на числа");
        startChoisNumbar.setBounds(50, 100, 380, 40);
        panel.add(startChoisNumbar);
        panel.add(lab);
        panel.add(choisOfNumber);

        this.ListenerButon(startChoisNumbar, choisOfNumber, choisThaierd);
        this.ActionButton(startChoisNumbar);
        this.buttonTable(panel, numbar, this.choisTaierd);
        System.out.println("eto go" + choisThaierd);
    }

    public void ListenerButon(JButton startChoisNumbar, final JTextField choisOfNumber, final int[] choisThaierd) {
        startChoisNumbar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                choisOfNumber.setText("Вшият избор е :  " + choisThaierd[0] + " , " + choisThaierd[1] +
                        " , " + choisThaierd[2] + " , " + choisThaierd[3] + " , " + choisThaierd[4] +
                        " , " + choisThaierd[5] + " , ");
            }
        });
    }

    public void ActionButton(final JButton startChoisNumbar) {
        startChoisNumbar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                startChoisNumbar.setBackground(Color.cyan);
            }
        });
    }

    public int[] ActionButtonMatrix(final JButton buttons, final int numbar, final int[] choisTaierd) {
        final int choisSecond = 0;
        final int[] numbar1 = new int[]{0};
        buttons.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttons.setBackground(Color.green);
                choisTaierd[numbar1[0]] = TotoFrame.this.choisFirstNumber(buttons, numbar, choisSecond);
                ++numbar1[0];
                System.out.print(" =-= " + choisTaierd[numbar1[0]]);
                System.out.println(" ? " + numbar1[0]);
            }
        });
        return choisTaierd;
    }

    public int choisFirstNumber(JButton buttons, int numbar, int choisSecond) {
        for(int i = 1; i <= 49; ++i) {
            int choisFirst = Integer.parseInt(buttons.getText());
            if (choisFirst == i) {
                choisSecond = choisFirst;
                System.out.print("->" + choisFirst);
            }
        }

        System.out.print(" , " + choisSecond);
        return choisSecond;
    }

    public int[] buttonTable(JButton buttons, int numbar, int[] choisTaierd) {
        this.getContentPane().add(buttons);

        JButton button1 = new JButton("1");
        button1.setBounds(50, 180, 50, 30);
        buttons.add(button1);
        this.ActionButtonMatrix(button1, numbar, choisTaierd);

        JButton button2 = new JButton("2");
        button2.setBounds(105, 180, 50, 30);
        buttons.add(button2);
        this.ActionButtonMatrix(button2, numbar, choisTaierd);

        JButton button3 = new JButton("3");
        button3.setBounds(160, 180, 50, 30);
        buttons.add(button3);
        this.ActionButtonMatrix(button3, numbar, choisTaierd);

        JButton button4 = new JButton("4");
        button4.setBounds(215, 180, 50, 30);
        buttons.add(button4);
        this.ActionButtonMatrix(button4, numbar, choisTaierd);

        JButton button5 = new JButton("5");
        button5.setBounds(270, 180, 50, 30);
        buttons.add(button5);
        this.ActionButtonMatrix(button5, numbar, choisTaierd);

        JButton button6 = new JButton("6");
        button6.setBounds(325, 180, 50, 30);
        buttons.add(button6);
        this.ActionButtonMatrix(button6, numbar, choisTaierd);

        JButton button7 = new JButton("7");
        button7.setBounds(380, 180, 50, 30);
        buttons.add(button7);
        this.ActionButtonMatrix(button7, numbar, choisTaierd);

        JButton button8 = new JButton("8");
        button8.setBounds(50, 215, 50, 30);
        buttons.add(button8);
        this.ActionButtonMatrix(button8, numbar, choisTaierd);

        JButton button9 = new JButton("9");
        button9.setBounds(105, 215, 50, 30);
        buttons.add(button9);
        this.ActionButtonMatrix(button9, numbar, choisTaierd);

        JButton button10 = new JButton("10");
        button10.setBounds(160, 215, 50, 30);
        buttons.add(button10);
        this.ActionButtonMatrix(button10, numbar, choisTaierd);

        JButton button11 = new JButton("11");
        button11.setBounds(215, 215, 50, 30);
        buttons.add(button11);
        this.ActionButtonMatrix(button11, numbar, choisTaierd);

        JButton button12 = new JButton("12");
        button12.setBounds(270, 215, 50, 30);
        buttons.add(button12);
        this.ActionButtonMatrix(button12, numbar, choisTaierd);

        JButton button13 = new JButton("13");
        button13.setBounds(325, 215, 50, 30);
        buttons.add(button13);
        this.ActionButtonMatrix(button13, numbar, choisTaierd);

        JButton button14 = new JButton("14");
        button14.setBounds(380, 215, 50, 30);
        buttons.add(button14);
        this.ActionButtonMatrix(button14, numbar, choisTaierd);

        JButton button15 = new JButton("15");
        button15.setBounds(50, 250, 50, 30);
        buttons.add(button15);
        this.ActionButtonMatrix(button15, numbar, choisTaierd);

        JButton button16 = new JButton("16");
        button16.setBounds(105, 250, 50, 30);
        buttons.add(button16);
        this.ActionButtonMatrix(button16, numbar, choisTaierd);

        JButton button17 = new JButton("17");
        button17.setBounds(160, 250, 50, 30);
        buttons.add(button17);
        this.ActionButtonMatrix(button17, numbar, choisTaierd);

        JButton button18 = new JButton("18");
        button18.setBounds(215, 250, 50, 30);
        buttons.add(button18);
        this.ActionButtonMatrix(button18, numbar, choisTaierd);

        JButton button19 = new JButton("19");
        button19.setBounds(270, 250, 50, 30);
        buttons.add(button19);
        this.ActionButtonMatrix(button19, numbar, choisTaierd);

        JButton button20 = new JButton("20");
        button20.setBounds(325, 250, 50, 30);
        buttons.add(button20);
        this.ActionButtonMatrix(button20, numbar, choisTaierd);

        JButton button21 = new JButton("21");
        button21.setBounds(380, 250, 50, 30);
        buttons.add(button21);
        this.ActionButtonMatrix(button21, numbar, choisTaierd);

        JButton button22 = new JButton("22");
        button22.setBounds(50, 285, 50, 30);
        buttons.add(button22);
        this.ActionButtonMatrix(button22, numbar, choisTaierd);

        JButton button23 = new JButton("23");
        button23.setBounds(105, 285, 50, 30);
        buttons.add(button23);
        this.ActionButtonMatrix(button23, numbar, choisTaierd);

        JButton button24 = new JButton("24");
        button24.setBounds(160, 285, 50, 30);
        buttons.add(button24);
        this.ActionButtonMatrix(button24, numbar, choisTaierd);

        JButton button25 = new JButton("25");
        button25.setBounds(215, 285, 50, 30);
        buttons.add(button25);
        this.ActionButtonMatrix(button25, numbar, choisTaierd);

        JButton button26 = new JButton("26");
        button26.setBounds(270, 285, 50, 30);
        buttons.add(button26);
        this.ActionButtonMatrix(button26, numbar, choisTaierd);

        JButton button27 = new JButton("27");
        button27.setBounds(325, 285, 50, 30);
        buttons.add(button27);
        this.ActionButtonMatrix(button27, numbar, choisTaierd);

        JButton button28 = new JButton("28");
        button28.setBounds(380, 285, 50, 30);
        buttons.add(button28);
        this.ActionButtonMatrix(button28, numbar, choisTaierd);

        JButton button29 = new JButton("29");
        button29.setBounds(50, 320, 50, 30);
        buttons.add(button29);
        this.ActionButtonMatrix(button29, numbar, choisTaierd);

        JButton button30 = new JButton("30");
        button30.setBounds(105, 320, 50, 30);
        buttons.add(button30);
        this.ActionButtonMatrix(button30, numbar, choisTaierd);

        JButton button31 = new JButton("31");
        button31.setBounds(160, 320, 50, 30);
        buttons.add(button31);
        this.ActionButtonMatrix(button31, numbar, choisTaierd);

        JButton button32 = new JButton("32");
        button32.setBounds(215, 320, 50, 30);
        buttons.add(button32);
        this.ActionButtonMatrix(button32, numbar, choisTaierd);

        JButton button33 = new JButton("33");
        button33.setBounds(270, 320, 50, 30);
        buttons.add(button33);
        this.ActionButtonMatrix(button33, numbar, choisTaierd);

        JButton button34 = new JButton("34");
        button34.setBounds(325, 320, 50, 30);
        buttons.add(button34);
        this.ActionButtonMatrix(button34, numbar, choisTaierd);

        JButton button35 = new JButton("35");
        button35.setBounds(380, 320, 50, 30);
        buttons.add(button35);
        this.ActionButtonMatrix(button35, numbar, choisTaierd);

        JButton button36 = new JButton("36");
        button36.setBounds(50, 355, 50, 30);
        buttons.add(button36);
        this.ActionButtonMatrix(button36, numbar, choisTaierd);

        JButton button37 = new JButton("37");
        button37.setBounds(105, 355, 50, 30);
        buttons.add(button37);
        this.ActionButtonMatrix(button37, numbar, choisTaierd);

        JButton button38 = new JButton("38");
        button38.setBounds(160, 355, 50, 30);
        buttons.add(button38);
        this.ActionButtonMatrix(button38, numbar, choisTaierd);

        JButton button39 = new JButton("39");
        button39.setBounds(215, 355, 50, 30);
        buttons.add(button39);
        this.ActionButtonMatrix(button39, numbar, choisTaierd);

        JButton button40 = new JButton("40");
        button40.setBounds(270, 355, 50, 30);
        buttons.add(button40);
        this.ActionButtonMatrix(button40, numbar, choisTaierd);

        JButton button41 = new JButton("41");
        button41.setBounds(325, 355, 50, 30);
        buttons.add(button41);
        this.ActionButtonMatrix(button41, numbar, choisTaierd);

        JButton button42 = new JButton("42");
        button42.setBounds(380, 355, 50, 30);
        buttons.add(button42);
        this.ActionButtonMatrix(button42, numbar, choisTaierd);

        JButton button43 = new JButton("43");
        button43.setBounds(50, 390, 50, 30);
        buttons.add(button43);
        this.ActionButtonMatrix(button43, numbar, choisTaierd);

        JButton button44 = new JButton("44");
        button44.setBounds(105, 390, 50, 30);
        buttons.add(button44);
        this.ActionButtonMatrix(button44, numbar, choisTaierd);

        JButton button45 = new JButton("45");
        button45.setBounds(160, 390, 50, 30);
        buttons.add(button45);
        this.ActionButtonMatrix(button45, numbar, choisTaierd);

        JButton button46 = new JButton("46");
        button46.setBounds(215, 390, 50, 30);
        buttons.add(button46);
        this.ActionButtonMatrix(button46, numbar, choisTaierd);

        JButton button47 = new JButton("47");
        button47.setBounds(270, 390, 50, 30);
        buttons.add(button47);
        this.ActionButtonMatrix(button47, numbar, choisTaierd);

        JButton button48 = new JButton("48");
        button48.setBounds(325, 390, 50, 30);
        buttons.add(button48);
        this.ActionButtonMatrix(button48, numbar, choisTaierd);

        JButton button49 = new JButton("49");
        button49.setBounds(380, 390, 50, 30);
        buttons.add(button49);
        this.ActionButtonMatrix(button49, numbar, choisTaierd);

        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        System.out.println(numbar);
        return choisTaierd;
    }


    public int[] choisFirstNumber(JButton buttons, int[] choisSecond) {
        for (int i = 0; i < 6; i++) {

//            int choisFirst = Integer.parseInt(buttons.getActionCommand());
        int choisFirst = 0;
        if (choisFirst == i) {
        choisSecond[0] = choisFirst;
        }
        if (choisFirst == i) {
        choisSecond[1] = choisFirst;
        }
        if (choisFirst == i) {
        choisSecond[2] = choisFirst;
        }
        if (choisFirst == i) {
        choisSecond[3] = choisFirst;
        }
        if (choisFirst == i) {
        choisSecond[4] = choisFirst;
        }
        if (choisFirst == i) {
        choisSecond[5] = choisFirst;
        }
        System.out.println(" , " + choisFirst + " , ");

        }return choisSecond;
        }



}