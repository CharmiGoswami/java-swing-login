
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{
	JFrame f;
	JLabel email_lable=new JLabel("Username");
	JTextField email=new JTextField();
	JLabel password_lable=new JLabel("Password");
	JPasswordField password=new JPasswordField();
	JButton submit=new JButton("Submit");
	JCheckBox view_password=new JCheckBox("Show password");
	JLabel singup=new JLabel("Click here to create new account");

	public Login() {
		createFrame();
		setElement();
		addElements();
		f.setVisible(true);
	}

	public void createFrame() {
		f=new JFrame();
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setBounds(100,100,500,500);
	}
	
	public void setElement() {
		//img.setBounds(10,10,200,100);
		email_lable.setBounds(100,200,100,100);
		email.setBounds(170,240,200,25);
		password_lable.setBounds(100,240,100,100);
		password.setBounds(170,280,200,25);
		view_password.setBounds(170,305,150,30);
		submit.setBounds(120,340,220,40);
		singup.setBounds(130,380,300,25);
	}
	
	
	public void addElements() {
		f.add(email_lable);
		f.add(email);
		f.add(password_lable);
		f.add(password);
		f.add(view_password);
		f.add(submit);
		f.add(singup);
	}
		
	public static void main(String[] args) {
		new Login();
	}

}
