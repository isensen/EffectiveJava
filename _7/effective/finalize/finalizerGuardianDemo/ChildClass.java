package effective.finalize.finalizerGuardianDemo;

class ChildClass extends ParentClass{
	
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalizer from ChildClass is running...");
        System.out.println(Thread.currentThread());
    }
    
}
