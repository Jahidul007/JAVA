
public class TimeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObject =new tuna();
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13, 26,5);
        System.out.println(tunaObject.toMilitary());
    }
    
}
