package game;

/**
 * Normal Enemy with basic attributes.
 */
public class NormalEnemy extends AbstractEnemy {
    public NormalEnemy() {
        this(0, 2 * 70);
    }
    public NormalEnemy(double x, double y) {
        super(x, y, "assets/enemies/towerDefense_tile245.png");
        this.setHp(Settings.NORMAL_HP);
        this.setVelocity(2, 0);
        this.setDefense(1);
    }
    // TODO: Every class use only 1 image, so there is no need to input url every time
    public NormalEnemy(double x, double y, String url, int hp, double velocityX, double velocityY) {
        super(x, y, url, hp, velocityX, velocityY);
    }

    //    @Override
//    public void subtractHp() {
//        hp -= 1;
//        if(hp < 0){
//            deactivate();
//        }
//    }
}
