package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotoFrame<numbar> extends JFrame{


    public TotoFrame () {
        int numbar = 0;

            setTitle("Toto");
            setSize(900, 600);

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
            ActionButton(startChoisNumbar);

//            buttonTable(buttons);

       if (numbar <= 6){
           buttonTable(buttons);
                ActionButton1(buttons,numbar);
            }
        startRandomDrow();

        }

    private void startRandomDrow() {
    }

    private void ActionButton(JButton startChoisNumbar) {
        startChoisNumbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                startChoisNumbar.setBackground(Color.cyan);
            }

        });
    }

    private void ActionButton1(JButton buttons, int numbar) {
        System.out.println(numbar);
        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                buttons.setBackground(Color.green);
            }
        });
        numbar++;
    }



    public void buttonTable(JButton buttons) {
        getContentPane().add(buttons);

        JButton button1 = new JButton("1");
        button1.setBounds(50, 180, 50, 30);
        buttons.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(105, 180, 50, 30);
        buttons.add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(160, 180, 50, 30);
        buttons.add(button3);

        JButton button4 = new JButton("4");
        button4.setBounds(215, 180, 50, 30);
        buttons.add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(270, 180, 50, 30);
        buttons.add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(325, 180, 50, 30);
        buttons.add(button6);

        JButton button7 = new JButton("7");
        button7.setBounds(380, 180, 50, 30);
        buttons.add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(50, 215, 50, 30);
        buttons.add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(105, 215, 50, 30);
        buttons.add(button9);

        JButton button10 = new JButton("10");
        button10.setBounds(160, 215, 50, 30);
        buttons.add(button10);

        JButton button11 = new JButton("11");
        button11.setBounds(215, 215, 50, 30);
        buttons.add(button11);

        JButton button12 = new JButton("12");
        button12.setBounds(270, 215, 50, 30);
        buttons.add(button12);

        JButton button13 = new JButton("13");
        button13.setBounds(325, 215, 50, 30);
        buttons.add(button13);

        JButton button14 = new JButton("14");
        button14.setBounds(380, 215, 50, 30);
        buttons.add(button14);

        JButton button15 = new JButton("15");
        button15.setBounds(50, 250, 50, 30);
        buttons.add(button15);

        JButton button16 = new JButton("16");
        button16.setBounds(105, 250, 50, 30);
        buttons.add(button16);

        JButton button17 = new JButton("17");
        button17.setBounds(160, 250, 50, 30);
        buttons.add(button17);

        JButton button18 = new JButton("18");
        button18.setBounds(215, 250, 50, 30);
        buttons.add(button18);

        JButton button19 = new JButton("19");
        button19.setBounds(270, 250, 50, 30);
        buttons.add(button19);

        JButton button20 = new JButton("20");
        button20.setBounds(325, 250, 50, 30);
        buttons.add(button20);

        JButton button21 = new JButton("21");
        button21.setBounds(380, 250, 50, 30);
        buttons.add(button21);

        JButton button22 = new JButton("22");
        button22.setBounds(50, 285, 50, 30);
        buttons.add(button22);

        JButton button23 = new JButton("23");
        button23.setBounds(105, 285, 50, 30);
        buttons.add(button23);

        JButton button24 = new JButton("24");
        button24.setBounds(160, 285, 50, 30);
        buttons.add(button24);

        JButton button25 = new JButton("25");
        button25.setBounds(215, 285, 50, 30);
        buttons.add(button25);

        JButton button26 = new JButton("26");
        button26.setBounds(270, 285, 50, 30);
        buttons.add(button26);

        JButton button27 = new JButton("27");
        button27.setBounds(325, 285, 50, 30);
        buttons.add(button27);

        JButton button28 = new JButton("28");
        button28.setBounds(380, 285, 50, 30);
        buttons.add(button28);

        JButton button29 = new JButton("29");
        button29.setBounds(50, 320, 50, 30);
        buttons.add(button29);

        JButton button30 = new JButton("30");
        button30.setBounds(105, 320, 50, 30);
        buttons.add(button30);

        JButton button31 = new JButton("31");
        button31.setBounds(160, 320, 50, 30);
        buttons.add(button31);

        JButton button32 = new JButton("32");
        button32.setBounds(215, 320, 50, 30);
        buttons.add(button32);

        JButton button33 = new JButton("33");
        button33.setBounds(270, 320, 50, 30);
        buttons.add(button33);

        JButton button34 = new JButton("34");
        button34.setBounds(325, 320, 50, 30);
        buttons.add(button34);

        JButton button35 = new JButton("35");
        button35.setBounds(380, 320, 50, 30);
        buttons.add(button35);

        JButton button36 = new JButton("36");
        button36.setBounds(50, 355, 50, 30);
        buttons.add(button36);

        JButton button37 = new JButton("37");
        button37.setBounds(105, 355, 50, 30);
        buttons.add(button37);

        JButton button38 = new JButton("38");
        button38.setBounds(160, 355, 50, 30);
        buttons.add(button38);

        JButton button39 = new JButton("39");
        button39.setBounds(215, 355, 50, 30);
        buttons.add(button39);

        JButton button40 = new JButton("40");
        button40.setBounds(270, 355, 50, 30);
        buttons.add(button40);

        JButton button41 = new JButton("41");
        button41.setBounds(325, 355, 50, 30);
        buttons.add(button41);

        JButton button42 = new JButton("42");
        button42.setBounds(380, 355, 50, 30);
        buttons.add(button42);

        JButton button43 = new JButton("43");
        button43.setBounds(50, 390, 50, 30);
        buttons.add(button43);

        JButton button44 = new JButton("44");
        button44.setBounds(105, 390, 50, 30);
        buttons.add(button44);

        JButton button45 = new JButton("45");
        button45.setBounds(160, 390, 50, 30);
        buttons.add(button45);

        JButton button46 = new JButton("46");
        button46.setBounds(215, 390, 50, 30);
        buttons.add(button46);

        JButton button47 = new JButton("47");
        button47.setBounds(270, 390, 50, 30);
        buttons.add(button47);

        JButton button48 = new JButton("48");
        button48.setBounds(325, 390, 50, 30);
        buttons.add(button48);

        JButton button49 = new JButton("49");
        button49.setBounds(380, 390, 50, 30);
        buttons.add(button49);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


}
