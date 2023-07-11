import java.io.IOException;

public class Level2Test {


    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Level2 myAbsCoordinate=new Level2();
        myAbsCoordinate.createGUI();
        new Thread(myAbsCoordinate).start();


    }

}

