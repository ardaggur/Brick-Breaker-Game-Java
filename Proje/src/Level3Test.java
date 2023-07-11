import java.io.IOException;

public class Level3Test {


    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Level3 myAbsCoordinate=new Level3();
        myAbsCoordinate.createGUI();
        new Thread(myAbsCoordinate).start();


    }

}

