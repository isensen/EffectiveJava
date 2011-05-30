package effective.finalize.finalizerGuardianDemo;
/**
 * Finalizer Guardian设计模式通过一个匿名类实例来实现其环绕实例的终结，
 * 从而避免了在其环绕类的子类中手工调用父类终结方法（super.finalize()）的麻烦。
 * 但是该模式存在一个明显的缺陷，就是来自子类的终结方法和来自父类Guardian的终结方法二者之间的运行次序是不确定的
 * 
 * 从以上运行结果看，终结方法的执行顺序是不确定的.而且二者都由同一个线程来执行（Thread[Finalizer,8,system]），
 * 而在实际的编程实践中，我们往往更希望来自子类的终结方法首先执行。即便这样，这种先父类后子类的终结顺序也不是完全确定的
 * ，它还依赖于具体的JVM实现，按照Java语言规范的定义，二者执行的先后次序以及到底由一个还是多个线程来执行，
 * 都是完全不确定的。因此，如果你的终结机制依赖于二者之间某种确定的执行顺序的话，那该设计模式并不合适
 * */
import org.junit.Test;

public class TestGuardian {

	  @Test 
	  public void test(){
	        ChildClass child = new ChildClass();
	        child = null;
	        System.gc();
	    }
}
