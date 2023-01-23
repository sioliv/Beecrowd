public class SequenciIJ {

    public static void main(String[] args) {

       int i =1;
       int j = 7;

       while(i <=9){
           for(int k = 0; k < 3; k++){
               System.out.println("I= " + i + " J" +j);
               j--;
           }
           j = j + 5;
       }

    }

}


