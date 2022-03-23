package chap4;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JFrameExample {

    public static void main(String[] args) {
        JFrame frm;
        JDialog dlg;
        frm = new JFrame("JFrame");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        dlg = new JDialog(frm,"JDialog", true);
        dlg.setSize(100, 100);
        dlg.setVisible(true);

    }

}
