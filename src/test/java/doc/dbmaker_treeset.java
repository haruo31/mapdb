package doc;

import org.mapdb20.DB;
import org.mapdb20.DBMaker;

import java.util.NavigableSet;


public class dbmaker_treeset {

    public static void main(String[] args) {
        DB db = DBMaker
                .memoryDB()
                .make();
        //a
        NavigableSet treeSet = db.getTreeSet("treeSet");
        //z
    }
}
