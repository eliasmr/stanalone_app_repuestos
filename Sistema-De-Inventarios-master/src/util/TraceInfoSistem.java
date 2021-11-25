package util;


/**
 *
 * @author Elias
 */
public class TraceInfoSistem {
    
    public static String getTraceInfoError(String msg,Exception e){
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stacks = new Throwable().getStackTrace();
        sb.append("Error: ").append(msg).
                         append("; clase: ").append(stacks[1].getClassName())
                        .append("; metodo: ").append(stacks[1].getMethodName())
                        .append("; linea: ").append(stacks[1].getLineNumber())
                        .append("; error: ").append(e);
        return sb.toString();

    }
    
        public static String getTraceInfo(String msg){
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stacks = new Throwable().getStackTrace();
                        sb.append(msg).
                         append("; clase: ").append(stacks[1].getClassName())
                        .append("; metodo: ").append(stacks[1].getMethodName())
                        .append("; linea: ").append(stacks[1].getLineNumber());
        return sb.toString();

    }
}
