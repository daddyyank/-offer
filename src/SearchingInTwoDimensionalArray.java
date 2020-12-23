
/**
 *  @author: zhanghd
 *  @Date: 2020/12/23 2:47 下午
 *  @email: hd_z0418@163.com
 *  @Description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 *  每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */

public class SearchingInTwoDimensionalArray {
    public static boolean Find(int target, int [][] array) {
        int x = array.length;
        if(x == 0) {
            return false;
        }
        int y = array[0].length;
        if(y == 0) {
            return false;
        }
        if(array[x - 1][y - 1] < target) {
            return false;
        }
        for(int i =0 ; i <= x -1 ; i++) {
            y = array[0].length;
            if(array[i][y - 1] >= target) {
                while(y >= 1) {
                    if(array[i][y - 1] == target) {
                        return true;
                    }
                    y--;
                }
            }
        }
        return false;
    }
}
