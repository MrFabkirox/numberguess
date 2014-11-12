import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller72 {

	View72 vi;
	Model72 mo;
	
	int secretNum;


	Controller72(View72 v, Model72 m) {

		this.vi = v;
		this.mo = m;

		this.vi.generateNumListener(new gNumListener());
		this.vi.addCompareNumListener(new cNumListener());
		this.vi.showRandNumListener(new sRandNumListener());

	}

	class gNumListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			mo.createNum();
			secretNum = mo.getRandNum();
			vi.setTf1(888888888);

		}
	}
	class cNumListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			vi.messToUser(mo.compareN(secretNum, vi.gettf2()));

		}
	}
	class sRandNumListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			vi.setTf1(secretNum);

		}
	}
}
