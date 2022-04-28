public class getCallerClassAndMethodName {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] elem = new Exception().getStackTrace();
        if(elem.length < 3){
            return null;
        } else {
            return elem[2].getClassName()+"#"+elem[2].getMethodName();
        }
    }
}
