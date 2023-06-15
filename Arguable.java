package info.zpss.SimpleHttpServer;

public interface Arguable {
    static boolean paramInArgs(String[] args, String paraA, String paraB) {
        for (String arg : args)
            if (arg.equals(paraA) || arg.equals(paraB))//遍历String args[]中 找到与paraA或paraB相同的返回true 否则返回false
                return true;
        return false;
    }

    static String stringInArgs(String[] args, String paraA, String paraB) {
        for (int i = 0; i < args.length; i++)
            if (args[i].equals(paraA) || args[i].equals(paraB))//返回args中与paraA或paraB相同的字符串
                if (i + 1 < args.length)
                    return args[i + 1];
        return null;
    }

    void init(String[] args) throws Exception;
}