package effective.finalize;

/**
 * @author isensen
 * ��д�������ս᷽��
 */
public class OverrideFinalize_2 {
	
	//Manual finalizer chaining
	@Override
	protected void finalize() throws Throwable {
		
		try {
			//TODO Finalize subclass state
			//��д�������ս᷽��
		}finally{
			//������ʹ��д���ս᷽���׳��쳣���������ս᷽��Ҳ�ᱻ��ȷִ��
			//����Ȼ��Զ���ᱻִ�У� 
			super.finalize();
		}
		
	}
}
