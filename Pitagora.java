package bug;

import javax.swing.JOptionPane;

public class Pitagora {
	public static void main(String[] args) {

		double x1 = Double.parseDouble(

				JOptionPane.showInputDialog("Unesi x1:")

		);

		double y1 = Double.parseDouble(

				JOptionPane.showInputDialog("Unesi y1:")

		);
		double x2 = Double.parseDouble(

				JOptionPane.showInputDialog("Unesi x2:")

		);
		double y2 = Double.parseDouble(

				JOptionPane.showInputDialog("Unesi y2:")

		);

		double ac = Math.abs(y2 - y1);
		double cb = Math.abs(x2 - x1);
		double udaljenost;
		if (x1 == x2)
			udaljenost = ac;
		else if (y1 == y2)
			udaljenost = cb;
		else {

			udaljenost = Math.sqrt(ac * ac + cb * cb);

		}
		System.out.println("Udaljenost izmeðu dvije toèke je " + udaljenost);
	}
}
