package score;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

public class Cpanel extends JFrame {

	private JPanel contentPane;
	private JTextField IDField1;
	private JTextField IDField2;
	private JTextField IDField3;
	private JTextField IDField4;

	private JLabel scoreLabel;
	private JTextField scoreField1;
	private JTextField scoreField2;
	private JTextField scoreField3;
	private JTextField scoreField4;

	private JTextField tenPai1;
	private JTextField tenPai2;
	private JTextField tenPai3;
	private JTextField tenPai4;
	private JTextField doraField;
	private JTextField kyoutakuField;
	private JTextField honbaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpanel frame = new Cpanel();
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
	public Cpanel() {
		setResizable(false);
		setTitle("立直麻将控制面板");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel windLabel = new JLabel("场风");
		windLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		windLabel.setBounds(82, 58, 46, 14);
		contentPane.add(windLabel);

		JRadioButton tonRB = new JRadioButton("東");
		tonRB.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tonRB.setSelected(true);
		tonRB.setBounds(220, 54, 86, 23);
		contentPane.add(tonRB);

		JRadioButton nanRB = new JRadioButton("南");
		nanRB.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		nanRB.setBounds(308, 54, 86, 23);
		contentPane.add(nanRB);

		JRadioButton shaRB = new JRadioButton("西");
		shaRB.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		shaRB.setBounds(396, 54, 86, 23);
		contentPane.add(shaRB);

		ButtonGroup windButtonGroup = new ButtonGroup();
		windButtonGroup.add(tonRB);
		windButtonGroup.add(nanRB);
		windButtonGroup.add(shaRB);

		JLabel kyoutakuLabel = new JLabel("供托");
		kyoutakuLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		kyoutakuLabel.setBounds(560, 58, 36, 14);
		contentPane.add(kyoutakuLabel);

		kyoutakuField = new JTextField();
		kyoutakuField.setText("0");
		kyoutakuField.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		kyoutakuField.setColumns(10);
		kyoutakuField.setBounds(590, 54, 36, 24);
		contentPane.add(kyoutakuField);

		JLabel honbaLabel = new JLabel("本场");
		honbaLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		honbaLabel.setBounds(640, 58, 36, 14);
		contentPane.add(honbaLabel);

		honbaField = new JTextField();
		honbaField.setText("0");
		honbaField.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		honbaField.setColumns(10);
		honbaField.setBounds(670, 54, 36, 24);
		contentPane.add(honbaField);

		JLabel doraLabel = new JLabel("宝牌");
		doraLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		doraLabel.setBounds(82, 103, 46, 14);
		contentPane.add(doraLabel);

		doraField = new JTextField();
		doraField.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		doraField.setColumns(10);
		doraField.setBounds(200, 97, 90, 24);
		contentPane.add(doraField);

		JLabel pl1Label = new JLabel("player1");
		pl1Label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		pl1Label.setBounds(222, 133, 46, 24);
		contentPane.add(pl1Label);

		JLabel pl2Label = new JLabel("player2");
		pl2Label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		pl2Label.setBounds(465, 133, 46, 24);
		contentPane.add(pl2Label);

		JLabel pl3Label = new JLabel("player3");
		pl3Label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		pl3Label.setBounds(705, 133, 46, 24);
		contentPane.add(pl3Label);

		JLabel pl4Label = new JLabel("player4");
		pl4Label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		pl4Label.setBounds(948, 133, 46, 24);
		contentPane.add(pl4Label);

		JLabel IDLabel = new JLabel("ID");
		IDLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		IDLabel.setBounds(82, 170, 46, 14);
		contentPane.add(IDLabel);

		IDField1 = new JTextField();
		IDField1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		IDField1.setColumns(10);
		IDField1.setBounds(170, 166, 150, 24);
		contentPane.add(IDField1);

		IDField2 = new JTextField();
		IDField2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		IDField2.setColumns(10);
		IDField2.setBounds(413, 168, 150, 24);
		contentPane.add(IDField2);

		IDField3 = new JTextField();
		IDField3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		IDField3.setColumns(10);
		IDField3.setBounds(653, 168, 150, 24);
		contentPane.add(IDField3);

		IDField4 = new JTextField();
		IDField4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		IDField4.setColumns(10);
		IDField4.setBounds(896, 168, 150, 24);
		contentPane.add(IDField4);

		JButton updateIDButton = new JButton("保存ID");
		updateIDButton.setToolTipText("");
		updateIDButton.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		updateIDButton.setBounds(1069, 168, 75, 24);
		contentPane.add(updateIDButton);

		JLabel oyaLabel = new JLabel("自亲");
		oyaLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		oyaLabel.setBounds(82, 199, 46, 14);
		contentPane.add(oyaLabel);

		JRadioButton oyaRB1 = new JRadioButton("");
		oyaRB1.setSelected(true);
		oyaRB1.setBounds(235, 195, 23, 23);
		contentPane.add(oyaRB1);

		JRadioButton oyaRB2 = new JRadioButton("");
		oyaRB2.setBounds(477, 195, 23, 23);
		contentPane.add(oyaRB2);

		JRadioButton oyaRB3 = new JRadioButton("");
		oyaRB3.setBounds(717, 195, 23, 23);
		contentPane.add(oyaRB3);

		JRadioButton oyaRB4 = new JRadioButton("");
		oyaRB4.setBounds(960, 195, 23, 23);
		contentPane.add(oyaRB4);

		ButtonGroup oyaButtonGroup = new ButtonGroup();
		oyaButtonGroup.add(oyaRB1);
		oyaButtonGroup.add(oyaRB2);
		oyaButtonGroup.add(oyaRB3);
		oyaButtonGroup.add(oyaRB4);

		scoreLabel = new JLabel("点数");
		scoreLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		scoreLabel.setBounds(82, 229, 46, 14);
		contentPane.add(scoreLabel);

		scoreField1 = new JTextField();
		scoreField1.setText("25000");
		scoreField1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		scoreField1.setBounds(200, 225, 90, 24);
		contentPane.add(scoreField1);
		scoreField1.setColumns(10);

		scoreField2 = new JTextField();
		scoreField2.setText("25000");
		scoreField2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		scoreField2.setColumns(10);
		scoreField2.setBounds(443, 225, 90, 24);
		contentPane.add(scoreField2);

		scoreField3 = new JTextField();
		scoreField3.setText("25000");
		scoreField3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		scoreField3.setColumns(10);
		scoreField3.setBounds(683, 225, 90, 24);
		contentPane.add(scoreField3);

		scoreField4 = new JTextField();
		scoreField4.setText("25000");
		scoreField4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		scoreField4.setColumns(10);
		scoreField4.setBounds(926, 225, 90, 24);
		contentPane.add(scoreField4);

		JLabel tenpaiLabel = new JLabel("听牌");
		tenpaiLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tenpaiLabel.setBounds(82, 264, 46, 14);
		contentPane.add(tenpaiLabel);

		tenPai1 = new JTextField();
		tenPai1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tenPai1.setColumns(10);
		tenPai1.setBounds(200, 260, 90, 24);
		contentPane.add(tenPai1);

		tenPai2 = new JTextField();
		tenPai2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tenPai2.setColumns(10);
		tenPai2.setBounds(443, 260, 90, 24);
		contentPane.add(tenPai2);

		tenPai3 = new JTextField();
		tenPai3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tenPai3.setColumns(10);
		tenPai3.setBounds(683, 260, 90, 24);
		contentPane.add(tenPai3);

		tenPai4 = new JTextField();
		tenPai4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		tenPai4.setColumns(10);
		tenPai4.setBounds(926, 260, 90, 24);
		contentPane.add(tenPai4);

		JToggleButton riichii1 = new JToggleButton("立直");
		riichii1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		riichii1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		riichii1.setBounds(200, 295, 90, 24);
		contentPane.add(riichii1);

		JToggleButton riichii2 = new JToggleButton("立直");
		riichii2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		riichii2.setBounds(443, 295, 90, 24);
		contentPane.add(riichii2);

		JToggleButton riichii3 = new JToggleButton("立直");
		riichii3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		riichii3.setBounds(683, 295, 90, 24);
		contentPane.add(riichii3);

		JToggleButton riichii4 = new JToggleButton("立直");
		riichii4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		riichii4.setBounds(926, 295, 90, 24);
		contentPane.add(riichii4);

		JButton updateButton = new JButton("更新场况");
		updateButton.setToolTipText("");
		updateButton.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		updateButton.setBounds(876, 445, 90, 24);
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// wind selection
				if (tonRB.isSelected()) {
					Dpanel.Instance.wind.setText("東");
				} else if (nanRB.isSelected()) {
					Dpanel.Instance.wind.setText("南");
				} else if (shaRB.isSelected()) {
					Dpanel.Instance.wind.setText("西");
				}
				
				// kyoutakuNumber honbaNumber
				Dpanel.Instance.kyoutakuNumber.setText(kyoutakuField.getText());
				Dpanel.Instance.honbaNumber.setText(honbaField.getText());
				
				// kyokuNumber
				if (oyaRB1.isSelected()) {
					Dpanel.Instance.kyokuNumber.setText("1");
				} else if (oyaRB2.isSelected()) {
					Dpanel.Instance.kyokuNumber.setText("2");
				} else if (oyaRB3.isSelected()) {
					Dpanel.Instance.kyokuNumber.setText("3");
				} else if (oyaRB4.isSelected()) {
					Dpanel.Instance.kyokuNumber.setText("4");
				}
				
				// player name
				Dpanel.Instance.pl1Name.setText(IDField1.getText());
				Dpanel.Instance.pl2Name.setText(IDField2.getText());
				Dpanel.Instance.pl3Name.setText(IDField3.getText());
				Dpanel.Instance.pl4Name.setText(IDField4.getText());
				
				// player score
				Dpanel.Instance.pl1Score.setText(scoreField1.getText());
				Dpanel.Instance.pl2Score.setText(scoreField2.getText());
				Dpanel.Instance.pl3Score.setText(scoreField3.getText());
				Dpanel.Instance.pl4Score.setText(scoreField4.getText());
			}
		});
		contentPane.add(updateButton);

		JButton resetButton = new JButton("重置");
		resetButton.setToolTipText("");
		resetButton.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		resetButton.setBounds(1045, 445, 90, 24);
		contentPane.add(resetButton);

		JButton openDPanel = new JButton("开启直播面板");
		openDPanel.setToolTipText("");
		openDPanel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		openDPanel.setBounds(82, 445, 120, 24);
		openDPanel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Dpanel().setVisible(true);
			}
		});
		contentPane.add(openDPanel);

	}
}
