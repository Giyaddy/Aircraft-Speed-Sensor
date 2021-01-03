/**
 * Write a description of class TesDataIterator here.
 * 
 * @author (Giyaddy Ilmi Alavan) 
 * @version (a version number or a date)
 */
public class TesDataIterator
{
   public static void main(String[] args){

      DataDownloaderIterator iterator = new DataDownloaderIterator();

      //disini kita gunakan iterator yang telah kita buat sebelumnya
      System.out.println("------------All Data From Both Sensor------------");
      iterator.print();
   }
}
