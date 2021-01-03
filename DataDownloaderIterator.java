/**
 * Write a description of class DBAccessor here.
 * 
 * @author (Giyaddy Ilmi Alavan) 
 * @version (a version number or a date)
 */

import java.util.Iterator;
import java.util.ArrayList;

public class DataDownloaderIterator{

    private ArrayList<String> allData = new ArrayList<String>();
    private int index = 0;
    private DBAccessor db = DBAccessor.getInstance();
    private Iterator i;

    public DataDownloaderIterator(){
        db.authorize("123456789", "password");
        this.allData = db.readDB(); //hasil pembacaan dari database disimpan disini
        i = allData.iterator();
    }

    public void print(){
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }


}