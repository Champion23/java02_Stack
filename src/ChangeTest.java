import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author 闫亮23
 * @version 1.0
 */
public class ChangeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("在此输入待转换数字 ：");
        int num = scanner.nextInt();
        System.out.println("请输入想要转换的进制(2/4/8/10/16) ：");
        int target = scanner.nextInt();
        System.out.println("转换结果如下： ");
        ExecChange execChange = new ExecChange(num, target);
        execChange.changeNum(num,target);
    }
}
/**
 *  输出案例
 *
 * 在此输入待转换数字 ：
 * 28887946
 * 请输入想要转换的进制(2/4/8/10/16) ：
 * 16
 * 转换结果如下：
 * 1B8CB8A
 */
