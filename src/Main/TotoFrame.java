package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotoFrame extends JFrame{


    public TotoFrame () {
        int numbar = 0;
        String chois = null;

        setTitle("Toto");
        setSize(900, 600);

        JLabel lab = new JLabel();
        lab.setBounds(180, 60, 200, 50);
//        lab.setFont(getFont(40));
        lab.setText("TOTO 2 6/49");

        JTextField choisOfNumber = new JTextField();
        choisOfNumber.setBounds(50, 500, 300, 30);
//        choisOfNumber.setFont(getFont(40));


        JButton panel = new JButton();
        JButton buttons = panel;
        buttons.setLayout(null);
        getContentPane().add(buttons);
        panel.setLayout(null);
        getContentPane().add(panel);

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JButton startChoisNumbar = new JButton("Старт за избор на числа");
        startChoisNumbar.setBounds(50, 100, 380, 40);
        panel.add(startChoisNumbar);
        panel.add(lab);
        panel.add(choisOfNumber);
        ActionButton(startChoisNumbar);
        buttonTable(buttons,numbar,chois);

       if (numbar <= 6){
           buttonTable(buttons,numbar,chois);
//           printChoisNumbar();
           choisOfNumber.setText("Вшият избор е :  " + chois + " , "
            );
            }





    }




    public void ActionButton(JButton startChoisNumbar) {
        startChoisNumbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                startChoisNumbar.setBackground(Color.cyan);
            }

        });
    }


    public String ActionButtonMatrix(JButton buttons,int numbar, String chois) {

        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                buttons.setBackground(Color.green);
                System.out.print(buttons.getText());
                printChoisNumbar(numbar);
                System.out.print(" , " + numbar + " ");

            }
        });
            chois = buttons.getText();
            return chois;
    }


    public int printChoisNumbar(int numbar) {
        numbar++;
        return numbar;
    }


    private void ActionButtonMatrixChois(JButton buttons, int[] chois) {

        for (int i = 0; i < 6; i++) {
        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

            }
        });
            System.out.println(" -= " + buttons);
        }
    }






    public JButton buttonTable(JButton buttons, int numbar, String chois) {

        getContentPane().add(buttons);

        JButton button1 = new JButton("1");
        button1.setBounds(50, 180, 50, 30);
        buttons.add(button1);
        ActionButtonMatrix(button1,numbar,chois);

        JButton button2 = new JButton("2");
        button2.setBounds(105, 180, 50, 30);
        buttons.add(button2);
        ActionButtonMatrix(button2,numbar,chois);

        JButton button3 = new JButton("3");
        button3.setBounds(160, 180, 50, 30);
        buttons.add(button3);
        ActionButtonMatrix(button3,numbar,chois);

        JButton button4 = new JButton("4");
        button4.setBounds(215, 180, 50, 30);
        buttons.add(button4);
        ActionButtonMatrix(button4,numbar,chois);

        JButton button5 = new JButton("5");
        button5.setBounds(270, 180, 50, 30);
        buttons.add(button5);
        ActionButtonMatrix(button5,numbar,chois);

        JButton button6 = new JButton("6");
        button6.setBounds(325, 180, 50, 30);
        buttons.add(button6);
        ActionButtonMatrix(button6,numbar,chois);

        JButton button7 = new JButton("7");
        button7.setBounds(380, 180, 50, 30);
        buttons.add(button7);
        ActionButtonMatrix(button7,numbar,chois);

        JButton button8 = new JButton("8");
        button8.setBounds(50, 215, 50, 30);
        buttons.add(button8);
        ActionButtonMatrix(button8,numbar,chois);

        JButton button9 = new JButton("9");
        button9.setBounds(105, 215, 50, 30);
        buttons.add(button9);
        ActionButtonMatrix(button9,numbar,chois);

        JButton button10 = new JButton("10");
        button10.setBounds(160, 215, 50, 30);
        buttons.add(button10);
        ActionButtonMatrix(button10,numbar,chois);

        JButton button11 = new JButton("11");
        button11.setBounds(215, 215, 50, 30);
        buttons.add(button11);
        ActionButtonMatrix(button11,numbar,chois);

        JButton button12 = new JButton("12");
        button12.setBounds(270, 215, 50, 30);
        buttons.add(button12);
        ActionButtonMatrix(button12,numbar,chois);

        JButton button13 = new JButton("13");
        button13.setBounds(325, 215, 50, 30);
        buttons.add(button13);
        ActionButtonMatrix(button13,numbar,chois);

        JButton button14 = new JButton("14");
        button14.setBounds(380, 215, 50, 30);
        buttons.add(button14);
        ActionButtonMatrix(button14,numbar,chois);

        JButton button15 = new JButton("15");
        button15.setBounds(50, 250, 50, 30);
        buttons.add(button15);
        ActionButtonMatrix(button15,numbar,chois);

        JButton button16 = new JButton("16");
        button16.setBounds(105, 250, 50, 30);
        buttons.add(button16);
        ActionButtonMatrix(button16,numbar,chois);

        JButton button17 = new JButton("17");
        button17.setBounds(160, 250, 50, 30);
        buttons.add(button17);
        ActionButtonMatrix(button17,numbar,chois);

        JButton button18 = new JButton("18");
        button18.setBounds(215, 250, 50, 30);
        buttons.add(button18);
        ActionButtonMatrix(button18,numbar,chois);

        JButton button19 = new JButton("19");
        button19.setBounds(270, 250, 50, 30);
        buttons.add(button19);
        ActionButtonMatrix(button19,numbar,chois);

        JButton button20 = new JButton("20");
        button20.setBounds(325, 250, 50, 30);
        buttons.add(button20);
        ActionButtonMatrix(button20,numbar,chois);

        JButton button21 = new JButton("21");
        button21.setBounds(380, 250, 50, 30);
        buttons.add(button21);
        ActionButtonMatrix(button21,numbar,chois);

        JButton button22 = new JButton("22");
        button22.setBounds(50, 285, 50, 30);
        buttons.add(button22);
        ActionButtonMatrix(button22,numbar,chois);

        JButton button23 = new JButton("23");
        button23.setBounds(105, 285, 50, 30);
        buttons.add(button23);
        ActionButtonMatrix(button23,numbar,chois);

        JButton button24 = new JButton("24");
        button24.setBounds(160, 285, 50, 30);
        buttons.add(button24);
        ActionButtonMatrix(button24,numbar,chois);

        JButton button25 = new JButton("25");
        button25.setBounds(215, 285, 50, 30);
        buttons.add(button25);
        ActionButtonMatrix(button25,numbar,chois);

        JButton button26 = new JButton("26");
        button26.setBounds(270, 285, 50, 30);
        buttons.add(button26);
        ActionButtonMatrix(button26,numbar,chois);

        JButton button27 = new JButton("27");
        button27.setBounds(325, 285, 50, 30);
        buttons.add(button27);
        ActionButtonMatrix(button27,numbar,chois);

        JButton button28 = new JButton("28");
        button28.setBounds(380, 285, 50, 30);
        buttons.add(button28);
        ActionButtonMatrix(button28,numbar,chois);

        JButton button29 = new JButton("29");
        button29.setBounds(50, 320, 50, 30);
        buttons.add(button29);
        ActionButtonMatrix(button29,numbar,chois);

        JButton button30 = new JButton("30");
        button30.setBounds(105, 320, 50, 30);
        buttons.add(button30);
        ActionButtonMatrix(button30,numbar,chois);

        JButton button31 = new JButton("31");
        button31.setBounds(160, 320, 50, 30);
        buttons.add(button31);
        ActionButtonMatrix(button31,numbar,chois);

        JButton button32 = new JButton("32");
        button32.setBounds(215, 320, 50, 30);
        buttons.add(button32);
        ActionButtonMatrix(button32,numbar,chois);

        JButton button33 = new JButton("33");
        button33.setBounds(270, 320, 50, 30);
        buttons.add(button33);
        ActionButtonMatrix(button33,numbar,chois);

        JButton button34 = new JButton("34");
        button34.setBounds(325, 320, 50, 30);
        buttons.add(button34);
        ActionButtonMatrix(button34,numbar,chois);

        JButton button35 = new JButton("35");
        button35.setBounds(380, 320, 50, 30);
        buttons.add(button35);
        ActionButtonMatrix(button35,numbar,chois);

        JButton button36 = new JButton("36");
        button36.setBounds(50, 355, 50, 30);
        buttons.add(button36);
        ActionButtonMatrix(button36,numbar,chois);

        JButton button37 = new JButton("37");
        button37.setBounds(105, 355, 50, 30);
        buttons.add(button37);
        ActionButtonMatrix(button37,numbar,chois);

        JButton button38 = new JButton("38");
        button38.setBounds(160, 355, 50, 30);
        buttons.add(button38);
        ActionButtonMatrix(button38,numbar,chois);

        JButton button39 = new JButton("39");
        button39.setBounds(215, 355, 50, 30);
        buttons.add(button39);
        ActionButtonMatrix(button39,numbar,chois);

        JButton button40 = new JButton("40");
        button40.setBounds(270, 355, 50, 30);
        buttons.add(button40);
        ActionButtonMatrix(button40,numbar,chois);

        JButton button41 = new JButton("41");
        button41.setBounds(325, 355, 50, 30);
        buttons.add(button41);
        ActionButtonMatrix(button41,numbar,chois);

        JButton button42 = new JButton("42");
        button42.setBounds(380, 355, 50, 30);
        buttons.add(button42);
        ActionButtonMatrix(button42,numbar,chois);

        JButton button43 = new JButton("43");
        button43.setBounds(50, 390, 50, 30);
        buttons.add(button43);
        ActionButtonMatrix(button43,numbar,chois);

        JButton button44 = new JButton("44");
        button44.setBounds(105, 390, 50, 30);
        buttons.add(button44);
        ActionButtonMatrix(button44,numbar,chois);

        JButton button45 = new JButton("45");
        button45.setBounds(160, 390, 50, 30);
        buttons.add(button45);
        ActionButtonMatrix(button45,numbar,chois);

        JButton button46 = new JButton("46");
        button46.setBounds(215, 390, 50, 30);
        buttons.add(button46);
        ActionButtonMatrix(button46,numbar,chois);

        JButton button47 = new JButton("47");
        button47.setBounds(270, 390, 50, 30);
        buttons.add(button47);
        ActionButtonMatrix(button47,numbar,chois);

        JButton button48 = new JButton("48");
        button48.setBounds(325, 390, 50, 30);
        buttons.add(button48);
        ActionButtonMatrix(button48,numbar,chois);

        JButton button49 = new JButton("49");
        button49.setBounds(380, 390, 50, 30);
        buttons.add(button49);
        ActionButtonMatrix(button49,numbar,chois);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        System.out.println(numbar);

    return buttons;
    }
}