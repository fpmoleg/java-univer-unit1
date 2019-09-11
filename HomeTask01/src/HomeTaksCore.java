import ua.univer.tasks.bool.BoolTasks;
import ua.univer.tasks.begin.BeginTasks;
import ua.univer.tasks.integer.IntegerTasks;

public class HomeTaksCore {

	public static void main(String[] args) {
		/**
		 *  Begin tasks.
		 *  */
		BeginTasks.task17(5, 7, 9);
		BeginTasks.task22(5, 7);
		BeginTasks.task27(4);
		/**
		 * Integer tasks.
		 * */
		System.out.println("File size is: " + IntegerTasks.task3(2500) + "KB");
		IntegerTasks.task8( (byte) 72);
		IntegerTasks.task11((short) 125);
		IntegerTasks.task24((short) 250);
		IntegerTasks.task29(3, 14, 2); 
		/**
		 * Boolean tasks.
		 * */
		BoolTasks.task10(1, 2);
		BoolTasks.task32(5, 4, 5);
		BoolTasks.task34( (byte) 2, (byte) 5);
		BoolTasks.task40( (byte) 4, (byte) 5, (byte) 2, (byte) 6);
		BoolTasks.task40( (byte) 4, (byte) 5, (byte) 6, (byte) 6);
		BoolTasks.task40( (byte) 4, (byte) 5, (byte) 2, (byte) 4);
		BoolTasks.task40( (byte) 4, (byte) 5, (byte) 6, (byte) 4);
	}

}
