package dayfour;

import java.io.*;
import java.util.Date;

public class IOTasks {

    public static void main(String[] args) throws IOException {

        // Task 1
        //task1("C:/Users/klimi/Documents");

        // Task 2
        //task2("C:/Users/klimi/Pictures/memes",".png");

        //Task 3
        //System.out.println(task3("C:/Users/klimi/Pictures/memes/gleb.png"));

        //Task 4
        //task4("C:/Users/klimi/Pictures/memes/gleb.png");

        //Task 5
        //System.out.println(task5("C:/Users/klimi/Pictures/memes"));

        //Task 6
        //System.out.println(task6("C:\\Users\\klimi\\IdeaProjects\\accenture\\AccentureBootcamp\\src\\daytwo\\test1.txt",
        //        "C:\\Users\\klimi\\IdeaProjects\\accenture\\AccentureBootcamp\\src\\daytwo\\test2.txt"));

        //Task 7
        //System.out.println(task7("C:/Users/klimi/Pictures/memes/gleb.png"));

        //Task 8
        //task8();

        //Task 9
        System.out.println(task9("C:/Users/klimi/Pictures/memes/gleb.png","kb"));

    }

    public static void task1(String path) {
        File listDir = new File(path);
        String[] res = listDir.list();
        if (res != null) for (String name : res) System.out.println(name);
    }

    public static void task2(String path, String ext) {
        File listDir = new File(path);
        String[] res = listDir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(ext);
            }
        });
        if (res != null) for (String name : res) System.out.println(name);
    }

    public static boolean task3(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static void task4(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.canRead()) System.out.println("Can read file");
            else System.out.println("Can't read file");

            if (file.canWrite()) System.out.println("Can write to file");
            else System.out.println("Can't write to file");
        }
    }

    public static String task5(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) return "file";
            else return "directory";
        } else return "error";
    }

    public static boolean task6(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);

        try {
            BufferedReader in1 = new BufferedReader(new FileReader(file1));
            BufferedReader in2 = new BufferedReader(new FileReader(file2));
            String s1, s2;
            s1 = in1.readLine();
            s2 = in2.readLine();
            while (s1 != null) {
                if (s2 == null) return false;
                if (s1.compareTo(s2) != 0) return false;
                s1 = in1.readLine();
                s2 = in2.readLine();
            }
            return s2 == null;
        } catch (IOException e) {
            return false;
        }
    }

    public static Date task7(String path) {
        File file = new File(path);
        return new Date(file.lastModified());
    }

    public static void task8() throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = r.readLine()) != null && s.length() != 0) System.out.println(s);
    }

    public static long task9(String path, String size){
        File file = new File(path);
        long res = file.length();
        if(size.equals("mb")) return res / 1_048_576;
        if(size.equals("kb")) return res / 1_024;
        return res;
    }
}
