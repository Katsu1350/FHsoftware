/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static int[] makeArray(){
        int[] temp = new int[4];
        for(int i =0 ; i < temp.length; i++){
            temp[i]= 1;
         }
        return temp;
    }
    public static void main(String[] args){
        // int[] myArray = {10, 20, 50, 4, 9 ,-1, 2};
        // int sum = 0; 

        // for(int i = 0; i <myArray.length; i++){
        // sum += myArray[i];
        // }

        // for(int t : myArray){
        // sum += t;
        // }
        // double average = sum/ myArray.length;
        // System.out.println(average);

        // String[] stArray = {"10", "20", "-1"};
        // for(String t: stArray){
        // System.out.println(t);
        // }

        //2차원 배열~~!
        // int[][] myArray = new int[2][3];
        // myArray[0][0] = 10;
        // myArray[0][1] = 20;
        int[][] myArray = {{10, 20, 30},{-1, -2, -3}};

        // for(int i =0; i < myArray.length; i++){
        // for(int j =0; j < myArray[0].length; j++){
        // System.out.println(myArray[i][j]);

        // }
        // }

        // for(int[] x : myArray){
            // for(int y : x){
                // System.out.println(y);
            // }
          // }
          
        // int[] newArray = makeArray();
        // for(int x: newArray){
            // System.out.println(x);
        // }
        
        for(String s : args){
            System.out.println(s);
        }
        }
  }

// edit =Auto-layout 들여쓰기 기능