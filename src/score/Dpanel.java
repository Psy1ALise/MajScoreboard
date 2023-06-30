package score;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Component;

public class Dpanel extends JFrame {

	public static Dpanel Instance;
	private JPanel contentPane;
	JLabel pl1Score;
	JLabel pl2Score;
	JLabel pl3Score;
	JLabel pl4Score;
	JLabel pl1Name;
	JLabel pl2Name;
	JLabel pl3Name;
	JLabel pl4Name;
	JLabel wind;
	JLabel kyokuNumber;
	JLabel kyoutakuNumber;
	JLabel honbaNumber;
	JPanel oyaPanel;
	JPanel gamePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dpanel frame = new Dpanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dpanel() {
		setTitle("直播面板");
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
//		setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
//		contentPane.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		pl1Score = new JLabel("25000");
		pl1Score.setForeground(Color.WHITE);
		pl1Score.setHorizontalAlignment(SwingConstants.LEFT);
		pl1Score.setFont(new Font("微软雅黑", Font.BOLD, 45));
		pl1Score.setBounds(200, 775, 200, 45);
		contentPane.add(pl1Score);

		pl2Score = new JLabel("25000");
		pl2Score.setForeground(Color.WHITE);
		pl2Score.setHorizontalAlignment(SwingConstants.LEFT);
		pl2Score.setFont(new Font("微软雅黑", Font.BOLD, 45));
		pl2Score.setBounds(550, 775, 200, 45);
		contentPane.add(pl2Score);

		pl3Score = new JLabel("25000");
		pl3Score.setForeground(Color.WHITE);
		pl3Score.setHorizontalAlignment(SwingConstants.LEFT);
		pl3Score.setFont(new Font("微软雅黑", Font.BOLD, 45));
		pl3Score.setBounds(900, 775, 200, 45);
		contentPane.add(pl3Score);

		pl4Score = new JLabel("25000");
		pl4Score.setForeground(Color.WHITE);
		pl4Score.setHorizontalAlignment(SwingConstants.LEFT);
		pl4Score.setFont(new Font("微软雅黑", Font.BOLD, 45));
		pl4Score.setBounds(1250, 775, 200, 45);
		contentPane.add(pl4Score);

		pl1Name = new JLabel("pl1Name");
		pl1Name.setForeground(Color.WHITE);
		pl1Name.setHorizontalAlignment(SwingConstants.LEFT);
		pl1Name.setFont(new Font("微软雅黑", Font.BOLD, 32));
		pl1Name.setBounds(200, 720, 200, 45);
		contentPane.add(pl1Name);

		pl2Name = new JLabel("pl2Name");
		pl2Name.setForeground(Color.WHITE);
		pl2Name.setHorizontalAlignment(SwingConstants.LEFT);
		pl2Name.setFont(new Font("微软雅黑", Font.BOLD, 32));
		pl2Name.setBounds(550, 720, 200, 45);
		contentPane.add(pl2Name);

		pl3Name = new JLabel("pl3Name");
		pl3Name.setForeground(Color.WHITE);
		pl3Name.setHorizontalAlignment(SwingConstants.LEFT);
		pl3Name.setFont(new Font("微软雅黑", Font.BOLD, 32));
		pl3Name.setBounds(900, 720, 200, 45);
		contentPane.add(pl3Name);

		pl4Name = new JLabel("pl4Name");
		pl4Name.setForeground(Color.WHITE);
		pl4Name.setHorizontalAlignment(SwingConstants.LEFT);
		pl4Name.setFont(new Font("微软雅黑", Font.BOLD, 32));
		pl4Name.setBounds(1250, 720, 200, 45);
		contentPane.add(pl4Name);

		wind = new JLabel("東");
		wind.setForeground(Color.WHITE);
		wind.setHorizontalAlignment(SwingConstants.CENTER);
		wind.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		wind.setBounds(40, 25, 45, 60);
		contentPane.add(wind);

		kyokuNumber = new JLabel("1");
		kyokuNumber.setForeground(Color.WHITE);
		kyokuNumber.setHorizontalAlignment(SwingConstants.CENTER);
		kyokuNumber.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		kyokuNumber.setBounds(85, 27, 45, 60);
		contentPane.add(kyokuNumber);

		JLabel kyoku = new JLabel("局");
		kyoku.setForeground(Color.WHITE);
		kyoku.setHorizontalAlignment(SwingConstants.CENTER);
		kyoku.setFont(new Font("微软雅黑", Font.PLAIN, 40));
		kyoku.setBounds(130, 25, 45, 60);
		contentPane.add(kyoku);

		JLabel senten = new JLabel();
		ImageIcon resizedIcon = new ImageIcon(new ImageIcon(Dpanel.class.getResource("/img/1000ten.png")).getImage()
				.getScaledInstance(120, 10, Image.SCALE_SMOOTH));
		senten.setIcon(resizedIcon);
		senten.setBounds(200, 40, 120, 10);
		contentPane.add(senten);

		JLabel hyakuten = new JLabel();
		hyakuten.setBounds(200, 65, 120, 10);
		ImageIcon resizedIcon1 = new ImageIcon(new ImageIcon(Dpanel.class.getResource("/img/100ten.png")).getImage()
				.getScaledInstance(120, 10, Image.SCALE_SMOOTH));
		hyakuten.setIcon(resizedIcon1);
		contentPane.add(hyakuten);

		kyoutakuNumber = new JLabel("0");
		kyoutakuNumber.setHorizontalAlignment(SwingConstants.CENTER);
		kyoutakuNumber.setForeground(Color.WHITE);
		kyoutakuNumber.setFont(new Font("微软雅黑", Font.BOLD, 18));
		kyoutakuNumber.setBounds(330, 32, 34, 27);
		contentPane.add(kyoutakuNumber);

		honbaNumber = new JLabel("0");
		honbaNumber.setHorizontalAlignment(SwingConstants.CENTER);
		honbaNumber.setForeground(Color.WHITE);
		honbaNumber.setFont(new Font("微软雅黑", Font.BOLD, 18));
		honbaNumber.setBounds(330, 57, 34, 27);
		contentPane.add(honbaNumber);
		
		oyaPanel = new JPanel();
		oyaPanel.setBackground(Color.RED);
		oyaPanel.setBounds(184, 720, 6, 100);
		contentPane.add(oyaPanel);
		
		gamePanel = new JPanel() ;
		gamePanel.setBackground(new Color(0f, 0f, 0f, 0.5f));
		gamePanel.setBounds(30, 25, 340, 65);
		contentPane.add(gamePanel);

		Instance = this;
	}
}
