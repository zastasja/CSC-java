// Напишите программу, которая получает на вход с клавиатуры целое число. Это число представляет собой текущее суточное время как количество прошедших с полуночи секунд. Затем программа должна напечатать вывод экрана электронных часов для этого времени.
// Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out
// Гарантируется, что входное значение — неотрицательное.
// Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).

// import  java.util.Scanner;

class DigitalWatch {
  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
    System.out.print("Введите секунды:");
//     int seconds = sc.nextInt();
    int seconds = System.in.read();
    int s = seconds % 60;
    String sec = s < 10 ? "0" + Integer.toString(s): "" + s;
    int m = (seconds / 60) % 60;
    String minutes = m < 10 ? "0" + Integer.toString(m): "" + m;
    int h = (seconds / 60) / 60 % 24;
    
   
    System.out.println(h + ":" + minutes + ":" + sec);

  }
  
}
