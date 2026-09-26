public class Room {

    int length;
    int breath;

    Room (int x,int y) {
        length = x;
        breath = y;
    }

    Room(int x) {

        length = x;
        breath = x;
    }

    int area () {

      return length * breath;

    }

    
}

   class Method {

    public static void main (String args []) {

        Room r1 = new Room (15,10);
        int a = r1.area();

        System.out.println("Area="+a);

        Room r2 = new Room (3);

        int b = r2.area();

        System.out.println("Area="+b);
    }
   }
