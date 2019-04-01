import java.io.*;

public class ExecObj {
    public ExecObj() {
        try{
            String cmd = "/Applications/Calculator.app/Contents/MacOS/Calculator";
//            String cmd = "gedit";
            final Process process = Runtime.getRuntime().exec(cmd);
            printMessage(process.getInputStream());
            printMessage(process.getErrorStream());
            int value = process.waitFor();
            System.out.println(value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printMessage(final InputStream input) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Reader reader = new InputStreamReader(input);
                BufferedReader bf = new BufferedReader(reader);
                String line = null;
                try {
                    while ((line=bf.readLine())!=null)
                    {
                        System.out.println(line);
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) throws Exception {
        ExecObj e = new ExecObj();
    }


}
