package effective.finalize;

/**
 * @author isensen
 * 覆写超类的终结方法
 */
public class OverrideFinalize {
	
	//Manual finalizer chaining
	@Override
	protected void finalize() throws Throwable {
		
		try {
			//TODO Finalize subclass state
			//覆写超类的终结方法
		}finally{
			//这样即使覆写的终结方法抛出异常，超类的终结方法也会被正确执行
			//（不然永远不会被执行） 
			super.finalize();
		}
		
	}
}
