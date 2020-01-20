package GUI;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.Random;

public class ButtonWindow extends Frame {
	// 버튼변수
	private Button btn;
	// 체크박스
	private Checkbox man, woman;

	public ButtonWindow() {

		setTitle("빠른 윈도우");
		setLocation(100, 100);
		setSize(300, 300);

		Panel p = new Panel();

		btn = new Button("버튼");
		// btn.setLabel("버튼1");

		// 버튼을 패널에 추가
		p.add(btn);

		CheckboxGroup group = new CheckboxGroup();
		man = new Checkbox("남자", group, true);
		woman = new Checkbox("여자", group, true);

		p.add(man);
		p.add(woman);

		Label lable = new Label("반갑습니다");
		p.add(lable);

		// 버튼 200개를 패널에 추가
		for (int i = 0; i < 200; i = i + 1) {
			Button button = new Button("버튼" + i);
			p.add(button);
		}

		// 출력할 내용이 부모보다 큰 경우에는 스크롤이 가능한 컴포넌트에 배치를 하고 스크롤이 가능한 컴포넌트를
		// 부모에 배치 한다.
		// add(p);

		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		sp.add(p);

		add(sp);

		// 메뉴바 생성
		MenuBar menuBar = new MenuBar();
		// 메뉴 생성
		Menu menu = new Menu("파일");

		// 메뉴 아이템 생성
		MenuItem item = new MenuItem("열기");

		menu.add(item);
		// 메누 바에 메뉴 부착
		menuBar.add(menu);
		// 프레임에 메뉴바 부착
		setMenuBar(menuBar);

		FileDialog open = new FileDialog(this, "열기", FileDialog.LOAD);
		// 기본디렉토리 설정
		open.setDirectory("c:\\");
		open.setVisible(true);
		// 선택된 파일 경로 출력하기
		System.out.println(open.getDirectory() + open.getFile());

		setVisible(true);

		String[] lbls = { "안녕", "잘가", "수고해", "내일봐", "하이" };
		Color[] colors = { Color.RED, Color.BLUE, Color.GREEN };
		int j = 0;
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(1000);
				j = j + 1;
				lable.setText(lbls[j % lbls.length]);
				btn.setForeground(colors[j % colors.length]);
			} catch (Exception e) {
			}

			// 5초 후에 버튼의 레이블 변경
			/*
			 * try { Thread.sleep(5000); btn.setLabel("버튼 글자 변경"); }catch(Exception e) {}
			 * 
			 * 
			 * Color[] colors = { Color.RED, Color.BLUE, Color.GREEN };
			 * 
			 * for (int i = 0; i < 20; i = i++) { try { Thread.sleep(1000);
			 * btn.setBackground(colors[i % colors.length]); i = i + 1; } catch (Exception
			 * e) {
			 * 
			 * } }
			 */
		}
	}
}
