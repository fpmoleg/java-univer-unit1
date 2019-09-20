import ua.univer.forstatement.ForStatement;
import ua.univer.ifstatement.IfStatement;
import ua.univer.switchstatement.SwitchStamenent;
import ua.univer.whilestatement.WhileStatement;

public class HomeTaskCore {

	public static void main(String[] args) {
		/**
		 * IF tasks.
		 * */
		IfStatement.task14(1, 4, 2);
		IfStatement.task15(1, 2, 4);
		System.out.println(IfStatement.task26((float) 1));
		System.out.println(IfStatement.task27((float) 3));
		/**
		 * Switch tasks.
		 * */
		System.out.println(SwitchStamenent.task1((byte) 4));
		System.out.println(SwitchStamenent.task5((float)1.5, (float)2.0, (byte) 1));
		/**
		 * For tasks.
		 *  */
		ForStatement.task7(1, 10);
		ForStatement.task11(10);
		ForStatement.task13(10);
		ForStatement.task40(1, 10);
		/**
		 * While tasks.
		 *  */
		WhileStatement.task1(11, 2);
		WhileStatement.task7(10);
		WhileStatement.task11(10);
		WhileStatement.task17(726);
	}

}
