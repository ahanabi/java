package GuessNumberGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuessNumber extends javax.swing.JFrame {
	{
		try{
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
  
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JButton jButton1;
	private JButton jButton2;
	private int number=0;
	private int counter=0;
	long startTime = System.currentTimeMillis();
	long endTime;
	
	public static void main(String[] args){
        GuessNumber inst = new GuessNumber();
        inst.setVisible(true);
	}
	
	public GuessNumber(){
		super();
		initGUI();
		Random random = new Random();
		number = random.nextInt(100);
	}
	
	private void initGUI(){
		try{
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
			    jLabel1.setText("<html>欢迎进入猜数字游戏，游戏规则如下：<br>"+"游戏随机产生1-100的整数，玩家通过输入数字来匹配所产生的数字。<br>"+"我心里有一个1到100的整数，你猜是什么？</html>");
			    jLabel1.setBounds(7, 0, 420, 147);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(42, 168, 112, 28);
				jTextField1.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent evt){
						jTextField1KeyPressed(evt);
					}
				});
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("确定");
				jButton1.setBounds(182, 168, 77, 30);
				jButton1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						jButton1ActionPerformed(evt);
					}
				});
			}
			
			{
		        jButton2 = new JButton();
		        getContentPane().add(jButton2);
		        jButton2.setText("重新开始");
		        jButton2.setBounds(280, 168, 100, 30);
		        jButton2.addActionListener(new ActionListener(){
			        public void actionPerformed(ActionEvent evt){
				        jButton2ActionPerformed(evt);
			        }
		        });
			}
			
	pack();
	this.setSize(442, 265);
	setLocationRelativeTo(null);
    } catch (Exception e){
	e.printStackTrace();
    }
    }

    private void jButton1ActionPerformed(ActionEvent evt){
    	int guess = 0;
    		counter++;
    	try{
    		guess=Integer.parseInt(jTextField1.getText());
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "数字不合法,请输入1-100的整数");
    		jTextField1.setText("");
    		jTextField1.requestFocus();
    		return;
    	}
    	if(guess>100){
    		JOptionPane.showMessageDialog(null, "不在范围内，请重新输入");
    		jTextField1.setText("");
    		jTextField1.requestFocus();
    		return;
    	}
    	if(guess<1){
    		JOptionPane.showMessageDialog(null, "不在范围内，请重新输入");
    		jTextField1.setText("");
    		jTextField1.requestFocus();
    		return;
    	}
    	if(guess>number){
    		JOptionPane.showMessageDialog(null, "输入的大了");
    		jTextField1.setText("");
    		jTextField1.requestFocus();
    		return;
    	}
    	if(guess<number){
    		JOptionPane.showMessageDialog(null, "输入的小了");
    		jTextField1.setText("");
    		jTextField1.requestFocus();
    		return;
    	}
    	if(guess == number){
    		endTime=System.currentTimeMillis();
    		switch(counter){
    		case 1:JOptionPane.showMessageDialog(null, "牛逼");
    		break;
    		case 2:
    		case 3:
    		case 4:
    		case 5:
    		case 6:
    		case 7:JOptionPane.showMessageDialog(null, "你很smart");
    		break;
    		default:JOptionPane.showMessageDialog(null, "猜了挺久，你需要努力");
    		break;
    		}
    		JOptionPane.showMessageDialog(null, "您总共猜了"+counter+"次，共花了"+(endTime-startTime)/1000+"秒的时间答对正确答案");
    	}
    	jTextField1.setText("");
    	jTextField1.requestFocus();
    }
    
    private void jButton2ActionPerformed(ActionEvent evt){
    	Random random = new Random();
    	number = random.nextInt(100);
    	counter = 0;
    	jTextField1.setText("");
    	startTime = System.currentTimeMillis();
    }
    
    private void jTextField1KeyPressed(KeyEvent evt){
    	if (evt.getKeyCode()==KeyEvent.VK_ENTER){
    		jButton1.doClick();
    	}
    }
}