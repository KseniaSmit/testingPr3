import java.io.File;

public class Main {
    public static void main(String[] args){
        System.out.println("something");
    }
    public static File[] getFiles(){
        File folder = new File("/src/patterns");
        return folder.listFiles();
    }
}
