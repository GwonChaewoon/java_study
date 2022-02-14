class Point implements Cloneable {
    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point upperLeft;    //좌측 상단 좌표
    private Point lowerRight;    //우측 하단 좌표

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void changePos(int x1, int y1, int x2, int y2) {   //좌표 정보 수정
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showPosition() {
        System.out.print("좌측 상단: ");
        upperLeft.showPosition();

        System.out.print("우측 하단: ");
        lowerRight.showPosition();
        System.out.println();
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle)org.clone();   // 인스턴스 복사
            org.changePos(2, 2, 7, 7);    // 인스턴스의 좌표 정보 수정
            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
