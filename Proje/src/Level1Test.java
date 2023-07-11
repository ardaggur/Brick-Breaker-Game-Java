import java.io.IOException;

public class Level1Test {


        /**
         * @param args
         */
        public static void main(String[] args) throws IOException {
            // TODO Auto-generated method stub
            Level1 myAbsCoordinate=new Level1();
            myAbsCoordinate.createGUI();
            new Thread(myAbsCoordinate).start();


        }

    }

