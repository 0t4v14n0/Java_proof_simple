import javax.swing.JOptionPane;

public class Prova {

	public static void main(String[] args) {

		double[] a = new double[10];
		String[] b = new String[10];
		b[0] = "Danin";
		b[1] = "Diogo";
		b[2] = "MR.M";
		b[3] = "Carlos Games";
		b[4] = "Bruno Cornito";
		b[5] = "Zé Çucao Careca";
		b[6] = "Inragex";
		b[7] = "Rogiwow";
		b[8] = "Tomas turbanu";
		b[9] = "20matargames";

		int[] c = new int[10];

		double aa = 0, bb = 100, total = 0;
		int mln = 0, pin = 0, t1 = 0;

		int cont = 0;

		for (int i = 0; i <= 9; i++) {

			do {

				a[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a Nota do Aluno " + b[i]));
				total = total + a[i];

				if (a[i] >= 0 && a[i] <= 100) {

					if (aa < a[i]) {
						aa = a[i];
						mln = i;
					} else if (bb > a[i]) {
						bb = a[i];
						pin = i;
					}

					cont = 5;

				} else
					cont = 1;

			} while (cont != 5);

			do {

				c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a frequencia do Aluno " + b[i]));

				if (c[i] >= 0 && c[i] <= 100) {
					t1 = 5;
				} else
					t1 = 1;

			} while (t1 != 5);

		}

		cont = 0;

		for (int i = 0; i <= 9; i++) {

			if (a[i] >= 70) {
				cont = cont + 1;
				JOptionPane.showMessageDialog(null, "Nome do Aluno Aprovado :" + b[i] + "\n " + "Media     : " + a[i]
						+ "\n" + "Fequencia : " + c[i]);

			} else {
				JOptionPane.showMessageDialog(null, "Nome do Aluno Reprovado :" + b[i] + "\n " + "Media     : " + a[i]
						+ "\n" + "Fequencia : " + c[i]);
			}

		}
		JOptionPane.showMessageDialog(null,
				"Nome do Aluno com melhor nota :" + b[mln] + "\n " + "Media     : " + a[mln]);

		JOptionPane.showMessageDialog(null, "Nome do Aluno com pior nota :" + b[pin] + "\n " + "Media     : " + a[pin]);

		JOptionPane.showMessageDialog(null,
				"Percentual de Alunos Aprovados :" + (cont * 10) + "%\n" + "Percentual de Alunos Reprovados : "
						+ ((10 - cont) * 10) + "%\n" + "Media da turma : " + (total / 10) + "%");

	}

}
