class Student{
    String name;
    // 名前を代入したいのでstring型、フィールド名はname
    public double calculateAvg(double[] data){
        // 引数はdouble型の配列
        double sum = 0;
        for( int i=0; i < data.length; i++) {
            // ループを回す回数は、配列の要素数だけ回す。なので配列の要素数を数えるlengthメソッドを使う
            sum += data[i];
         }
        double avg = sum/data.length;
        return avg;
        // 算出した値をreturnを使って返す
    }
    
    public String judge(double avg) {
        String result;
        if( avg >= 60) {
            result = "passed" ;
            // 数値が６０以上ならpassed
            }else {
                result = "failed";
            }
            return result;
        }
    }
    
public class App {
    public static void main(String[] args){
        Student a001 = new Student();
        // インスタンス化し、クラスを使えるように
        a001.name="sato";
        // フィールドに値を代入
        double[] data = { 70, 65, 50 ,10, 30};
        
        double avg= a001.calculateAvg(data);
        // calculateAvgメソッドで平均を算出してavgに代入
        String result = a001.judge(avg);
        
        System.out.println(avg);
        System.out.println(a001.name + " " + result);
    }
}
