package effective.finalize;

/**
 * @author isensen
 * 终结方法守卫者
 * (如果子类实现者覆盖了超类的终结方法,但是忘了手动调用超类的终结方法,那么超类的终结方法
 * 将永远也不会被调用到,要防范这样的粗心大意或恶意的子类是有可能的,代价就是为每个将被终结
 * 的对象创建一个附加的对象,把终结方法放在一个匿名的类中,该匿名类的唯一用途就是终结它的外
 * 围实例,外围类的每个实例都会创建这样的守卫者)
 * 
 * 注意: 公有类FinalizerGuardian并没有终结方法.对于每一个带有终结方法的非fianl公有类
 * 都应该考虑使用这种方法
 */
public class FinalizerGuardian {
	
	
	
	//Sole purpose of this object is to finalize outer FinalizerGuardian object
	private final Object finalizerGuardian = new Object (){
		
		@Override
		protected void finalize() throws Throwable {
			//TODO Finalize outer FinalizerGuardian object
		}
		
	};
	
	
}
