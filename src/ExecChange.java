/**
 * @author 闫亮23
 * @version 1.0
 */
public class ExecChange {
     /**
     * 十进制转为二进制、八进制、十六进制打印输出
      * num 为 待转换 的值 ，target 为转换进制
     *   方法： 第一位（最小位） 要 用 num % target ；
      *   之后的 位  依次 num / target 然后 % target
     *
     */

     private int num;
     private int target;

    // 初始化 栈（大小随意，够用就行）
     Stack stack = new Stack(100000000);
     // 构造器
     public ExecChange(int num, int target) {
        this.num = num;
        this.target = target;
    }

     public void changeNum(int num, int target){
         if(num==0){  // 判断 num 是否为零， 0 的任何 进制均为 0
             System.out.println(0);
         } else{
             while(num!=0){
                 stack.push(num%target); // 计算结果 入栈
                 num/=target;
             }
             while (!stack.isEmpty()) { // 不是空栈 就输出
                 if(stack.peek()==10) { // 这里 处理 16进制 问题（还待 优化）
                     System.out.print("A");
                     int a = stack.pop(); // 这里意思是 弹出栈顶元素
                 }else if(stack.peek()==11){// peek() 方法 只获取 栈顶值 但不弹出
                     System.out.print("B");
                     int a = stack.pop();
                 }else if(stack.peek()==12){
                     System.out.print("C");
                     int a = stack.pop();
                 }else if(stack.peek()==13){
                     System.out.print("D");
                     int a = stack.pop();
                 }else if(stack.peek()==14){
                     System.out.print("E");
                     int a = stack.pop();
                 }else if (stack.peek()==15){
                     System.out.print("F");
                     int a = stack.pop();
                 }else{
                     System.out.print(stack.pop());
                 }
             }
         }
     }
}
