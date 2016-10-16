import java.lang.*
public class proj1{
    public static void main(String args[]){
        System.out.println("Program Running...");
        int[] matrix = getMatrix();
        for(int i =0;i<100;i+=5){
            System.out.print(matrix[i]);
            System.out.print(matrix[++i]);
            System.out.print(matrix[++i]);
            System.out.print(matrix[++i]);
            System.out.println(matrix[++i]);
        }
    }
    public static int[] getMatrix(){
        int[] m = new int[100];
        int num = 0;
        final int LENGTH = 100;
        for(int i =2;;i++){
            int flag = (int)Math.sqrt(i);
            for(int j =2;j<=flag;j++){
                if(i%j == 0) break;
                else if(j==flag){
                    if(num<LENGTH){
                        String s = Integer.toString(i);
                        int length = s.length/2;
                        for(int k=0;k<half;k++){
                            if(s.charAt(k)!=s.charAt(length-k-1)
                                break;
                        }
                        m[num++] = i;
                    }
                    else return m;
                }
            }
        }
    }
}
