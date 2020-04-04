import javax.swing.JFrame;

public class Timetable extends JFrame {
    public static void main(String[] args){
        Timetable timetable = new Timetable();

        timetable.setWindowParameters(JFrame.EXIT_ON_CLOSE, 500, 500, true );
    }

    private void setWindowParameters(int onClose, int width, int height, boolean isVisible){
        // operation to perform when window closed
        this.setDefaultCloseOperation(onClose);

        this.setSize(width,height);
        this.setVisible(isVisible);
    }
}
