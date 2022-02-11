import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.File;
public class Notepad
{
    String r="Consolas";
    int s=30;
    // for frame1
    JFrame frame1=new JFrame("Notepad");
    JButton button1=new JButton("Save");
    JButton button2=new JButton("Clear");
    JButton button3=new JButton("Font"); 
    JButton button4=new JButton("Theme");
    JTextArea text1=new JTextArea(); 

    //for f1
    JFrame frame11=new JFrame("Set Font");
    JTextField text11=new JTextField();
    JTextField text12=new JTextField();
    JLabel label11=new JLabel("Font Name");
    JLabel label12=new JLabel("Font Size");
    JButton button11=new JButton("OK");
    
    //for f2
    JFrame frame21=new JFrame("Theme");
    JButton button21=new JButton("Save");
    JComboBox box1;
    JComboBox box2;
    
    //for f3
    JFrame frame31=new JFrame("Save File");
    JButton button31=new JButton("Save");
    JLabel label31=new JLabel("File Name");
    JTextField text31=new JTextField();
 

    public void F1()
    {
        label11.setBounds(10,10,200,50);
        text11.setBounds(10,70,200,50);
        label12.setBounds(10,130,200,50);
        text12.setBounds(10,190,80,50);
        button11.setBounds(10,250,60,40);

        button11.setBackground(Color.GREEN);
        button11.addActionListener(A11);
        
        frame11.add(label11);
        frame11.add(label12);
        frame11.add(text11);
        frame11.add(text12);
        frame11.add(button11);

        
        frame11.setSize(300,350);
        frame11.setVisible(true);
        frame11.setLayout(null);

    }
    public void F2()
    {
        String Text_Color[]={"WHITE","BLUE","GRAY","PINK","RED","BLACK"};
        String BG_Color[]={"WHITE","BLUE","GRAY","PINK","RED","BLACK","YELLOW"};
        
        box1=new JComboBox(Text_Color);
        box2=new JComboBox(BG_Color);
        JLabel label1=new JLabel("TClor");
        JLabel label2=new JLabel("BGColor");

        label1.setBounds(10,10,100,40);
        label2.setBounds(120,10,100,40);
        box1.setBounds(10,60,100,40);
        box2.setBounds(120,60,100,40);
        button21.setBounds(10,110,80,40);
        
        button21.setBackground(Color.GREEN);

        frame21.add(label1);
        frame21.add(label2);
        frame21.add(box1);
        frame21.add(box2);
        frame21.add(button21);
        
        button21.addActionListener(A21);

        frame21.setSize(300,200);
        frame21.setLayout(null);
        frame21.setVisible(true);

    }
    public void F3()
    {
        label31.setBounds(10,10,250,30);
        text31.setBounds(10,40,250,40);
        button31.setBounds(10,90,70,40);

        frame31.add(label31);
        frame31.add(text31);
        frame31.add(button31);

        button31.setBackground(Color.GREEN);

        button31.addActionListener(A31);
        
        frame31.setSize(350,200);
        frame31.setVisible(true);
        frame31.setLayout(null);
    }
    public void makeFrame()
    {
        button1.setBounds(10,10,100,50);
        button2.setBounds(120,10,100,50);
        button3.setBounds(230,10,100,50);
        button4.setBounds(340,10,100,50);
        text1.setBounds(10,60,1000,1000);

        Font font1=new Font("Algerian",Font.PLAIN,20);
        button1.setFont(font1);
        button2.setFont(font1);
        button3.setFont(font1);
        button4.setFont(font1);
        text1.setFont(new Font(r,Font.PLAIN,s));

        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);

        frame1.add(button1);
        frame1.add(button2);
        frame1.add(button3);
        frame1.add(button4);
        frame1.add(text1);

        button1.addActionListener(A1);
        button2.addActionListener(A2);
        button3.addActionListener(A3);
        button4.addActionListener(A4);
        
        frame1.setSize(1020,1070);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    public static void main(String [] args)
    {
        Notepad note=new Notepad();
        note.makeFrame();

    }
    ActionListener A1=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae1)
        {
            F3();
        }
    };
    
    ActionListener A2=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae2)
        {
            text1.setText("");
        }
    };

    ActionListener A3=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae3)
        {
           F1(); 
        }
    };

    ActionListener A4=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae4)
        {
            F2();
        }
    };

    ActionListener A11=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae11)
        {
            String q=text11.getText();
            String z=text12.getText();
            s=Integer.valueOf(z);
            text1.setFont(new Font(q,Font.PLAIN,s));
            frame11.dispose();
        }
    };
    ActionListener A21=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae21)
        {
            int a=box1.getSelectedIndex();
            
            switch (a) {
                case 0:
                {
                    text1.setForeground(Color.WHITE);
                    break;
                }

                case 1:
                {
                    text1.setForeground(Color.BLUE);
                    break;
                }
                case 2:
                {
                    text1.setForeground(Color.GRAY);
                    break;
                }
                case 3:
                {
                    text1.setForeground(Color.PINK);
                    break;
                }
                case 4:
                {
                    text1.setForeground(Color.RED);
                    break;
                }
                case 5:
                {
                    text1.setForeground(Color.BLACK);
                    break;
                }
   
            } 
            int b=box2.getSelectedIndex();
            

            switch (b) 
            {
                case 0:
                {
                    text1.setBackground(Color.BLACK);
                    break;
                }
                case 1:
                {
                    text1.setBackground(Color.BLUE);
                    break;
                }
                case 2:
                {
                    text1.setBackground(Color.GRAY);
                    break;
                }
                case 3:
                {
                    text1.setBackground(Color.PINK);
                    break;
                }
                case 4:
                {
                    text1.setBackground(Color.RED);
                    break;
                }

                case 5:
                {
                    text1.setBackground(Color.WHITE);
                    break;
                }   
                case 6:
                {
                    text1.setBackground(Color.YELLOW);
                    break;
                }
                
                   
            }
            frame21.dispose();
        }
    };
    ActionListener A31=new ActionListener()
    {
        public void actionPerformed(ActionEvent ae31)
        {
            String c=text31.getText();
            String d=text1.getText();
            try
            {
                File myfile=new File(c);
                myfile.createNewFile();
                FileWriter fw=new FileWriter(c);
                fw.write(d);
                fw.close();
            }
            catch(Exception ee)
            {
                System.out.println(ee);
            }
            frame31.dispose();
        }
    };
    
}