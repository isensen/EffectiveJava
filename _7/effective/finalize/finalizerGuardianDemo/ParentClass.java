package effective.finalize.finalizerGuardianDemo;

class ParentClass{
	
	
	
	
    private final Object finalizerGuardian = new Object(){
    	
        @Override
        protected void finalize() throws Throwable{
            System.out.println("Finalizer from the guardian in the ParentClass is running...");
            System.out.println(Thread.currentThread());
        }
    };
    
}