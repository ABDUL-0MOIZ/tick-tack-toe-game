import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
static JFrame frame;
static JButton[] btn=new JButton[9];
static  JButton btn1,bt2,bt3,bt4,btn5,btn6,btn7,btn8,btn9;
static int player=0;
    public static void main(String[] args) {
        frame=new JFrame();
        frame.setTitle("Tick Tack toe game");
        frame.setBounds(500,100,500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        Font font= new Font("name",Font.BOLD,40);
        panel.setBounds(20,20,400,400);
        panel.setLayout(new GridLayout(3,3,5,5));
        for (int i = 0; i < 9; i++) {

            btn[i]=new JButton();
            btn[i].setFont(font);

            panel.add(btn[i]);
        }
        panel.setVisible(true);
frame.add(panel);
        frame.setVisible(true);
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (player==1) {
                        btn[finalI].setText("o");
                        player=0;
                        result();;

                    }
                    else {
                        btn[finalI].setText("x");
                        player=1;
                        result();
                    }

                }
            });

        }

    }
    static void result(){
        if (!btn[1].getText().isEmpty()&&!btn[2].getText().isEmpty()&&!btn[3].getText().isEmpty()&&!btn[0].getText().isEmpty()&&!btn[4].getText().isEmpty()&&!btn[5].getText().isEmpty()&&!btn[6].getText().isEmpty()&&!btn[7].getText().isEmpty()&&!btn[8].getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"match draw");
        }
        else if (btn[0].getText().equals("x")&&btn[1].getText().equals("x")&&btn[2].getText().equals("x")||btn[0].getText().equals("x") && btn[3].getText().equals("x") && btn[6].getText().equals("x")||btn[2].getText().equals("x") && btn[5].getText().equals("x") && btn[8].getText().equals("x")||btn[3].getText().equals("x") && btn[4].getText().equals("x") && btn[5].getText().equals("x")||btn[6].getText().equals("x") && btn[7].getText().equals("x") && btn[8].getText().equals("x")||btn[1].getText().equals("x") && btn[4].getText().equals("x") && btn[7].getText().equals("x")||btn[0].getText().equals("x") && btn[4].getText().equals("x") && btn[8].getText().equals("x")||btn[2].getText().equals("x") && btn[4].getText().equals("x") && btn[6].getText().equals("x")){
            JOptionPane.showMessageDialog(frame,"X win");
        }
        else if (btn[0].getText().equals("o")&&btn[1].getText().equals("o")&&btn[2].getText().equals("o")||btn[0].getText().equals("o") && btn[3].getText().equals("o") && btn[6].getText().equals("o")||btn[2].getText().equals("o") && btn[5].getText().equals("o") && btn[8].getText().equals("o")||btn[3].getText().equals("o") && btn[4].getText().equals("o") && btn[5].getText().equals("o")||btn[6].getText().equals("o") && btn[7].getText().equals("o") && btn[8].getText().equals("0")||btn[1].getText().equals("o") && btn[4].getText().equals("o") && btn[7].getText().equals("o")||btn[0].getText().equals("o") && btn[4].getText().equals("o") && btn[8].getText().equals("o")||btn[2].getText().equals("o") && btn[4].getText().equals("o") && btn[6].getText().equals("o")){
            JOptionPane.showMessageDialog(null,"O win");
        }

    }
}
