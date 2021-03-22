package L1603_设计停车系统;

/**
 * @Description:
 * @Author: Wuxin
 * @Date: Create in  2021-03-19 16:02
 */
public class Main {

    /**
     * 变量保存
     */
    public class ParkingSystem {

        int big ;
        int medium ;
        int small ;
        public ParkingSystem(int big, int medium, int small) {
            this.big = big ;
            this.medium = medium ;
            this.small = small ;
        }

        public boolean addCar(int carType) {
            switch (carType){
                case 1 :{ big-- ; return big >= 0 ;}
                case 2 : {medium-- ; return medium >= 0 ;}
                case 3 : {small-- ; return small >= 0 ;}
                default:return false;
            }
        }
    }

    /**
     * 数组保存
     */
    public class ParkingSystem1 {

        int []park ;
        public ParkingSystem1(int big, int medium, int small) {
            park = new int[]{0, big, medium, small};
        }

        public boolean addCar(int carType) {
           return park[carType]-- > 0;
        }
    }
}
