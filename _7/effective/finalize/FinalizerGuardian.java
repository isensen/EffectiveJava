package effective.finalize;

/**
 * @author isensen
 * �ս᷽��������
 * (�������ʵ���߸����˳�����ս᷽��,���������ֶ����ó�����ս᷽��,��ô������ս᷽��
 * ����ԶҲ���ᱻ���õ�,Ҫ���������Ĵ��Ĵ���������������п��ܵ�,���۾���Ϊÿ�������ս�
 * �Ķ��󴴽�һ�����ӵĶ���,���ս᷽������һ������������,���������Ψһ��;�����ս�������
 * Χʵ��,��Χ���ÿ��ʵ�����ᴴ��������������)
 * 
 * ע��: ������FinalizerGuardian��û���ս᷽��.����ÿһ�������ս᷽���ķ�fianl������
 * ��Ӧ�ÿ���ʹ�����ַ���
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
