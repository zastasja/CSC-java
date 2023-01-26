import java.io.*;

class workingWTextFile{
  public static void main(String[] args) throws Exception {
        File file = new File("testlog.txt");
        if(!file.exists()){
          file.createNewFile();
        }
    FileWriter fileWriter = new FileWriter(file);
    FileReader fileReader = new FileReader(file);
    
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    bufferedWriter.write("test line 1");
    bufferedWriter.newLine();
    bufferedWriter.write("test line 2");
    bufferedWriter.flush();
    bufferedWriter.close();

    BufferedReader bufferedReader = new BufferedReader(fileReader);
    while (bufferedReader.ready()) {
      System.out.println(bufferedReader.readLine());
}
    }
}
