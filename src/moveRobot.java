
public class moveRobot {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public class Robot {

        public Direction getDirection() {
            // текущее направление взгляда
            return getDirection();
        }

        public int getX() {
            // текущая координата X
            return getY();
        }

        public int getY() {
            // текущая координата Y
            return getY();
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            return;
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            return;
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
            return;
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int stepsX = toX - currentX;
        int stepsY = toY - currentY;
        int stepBackX = Math.abs(toX - currentX);
        int stepBackY = Math.abs(toY - currentY);

        while (robot.getDirection() != Direction.RIGHT){
            robot.turnRight();
        }
        if(stepsX > 0){
            for(int i = 0; i < stepsX; i++){
                robot.stepForward();
            }
        } else if (stepsX < 0) {
            robot.turnLeft();
            robot.turnLeft();
            for(int i = 0; i < stepBackX; i++ ){
                robot.stepForward();
            }
        }

        while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
            }
        if (stepsY > 0){
            for(int j = 0; j < stepsY; j++){
                robot.stepForward();
            }
        } else if (stepsY < 0) {
            robot.turnLeft();
            robot.turnLeft();
            for (int j=0; j < stepBackY; j++){
                robot.stepForward();
            }
        }
    }
}
