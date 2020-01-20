package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class MainWindow extends Frame {
	public MainWindow() {

		// ���� ���� ������Ʈ���� �÷� ���� �� �ִ� �г��� ����
		Panel northPanel = new Panel();
		// ���̺�� �ؽ�Ʈ �ʵ带 ���� �гο� ��ġlowLayout �̶� ������� ��ġ
		// �г���
		Label lblTitle = new Label("����");
		TextField txtTitle = new TextField(30);
		// ȭ�鿡 �������� ���� ����
		txtTitle.setEchoChar('*');
		northPanel.add(lblTitle);
		northPanel.add(txtTitle);

		// �������� BorderLayout �ϼ� ����� �Բ� ��ġ
		// ����� ���ʿ� ��ġ
		add("North", northPanel);

		Panel centerPanel = new Panel();
		Label  lblcontent = new Label("����");
		TextArea taContent = new TextArea(20, 30);
		centerPanel.add(lblcontent);
		centerPanel.add(taContent);
		add("Center", centerPanel);

		Panel southPanel = new Panel();
		// �г��� ���̾ƿ��� ����
		// ���� ������ �����ϸ� ���̳� ���� ������ �÷��� ��ġ
		southPanel.setLayout(new GridLayout(2, 2));
		for (int i = 0; i < 4; i = i + 1) {
			Button button = new Button("��ư" + i);
			southPanel.add(button);
		}
		add("South", southPanel);

		setTitle("�Խù� �Է�");
		setLocation(100, 100);
		setSize(300, 200);
		// ũ�⺯�� ���ϰ� ����
		setResizable(false);
		setVisible(true);
	}

}
