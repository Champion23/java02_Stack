/**
 * @author 亮23
 * @version 1.0
 * 定义栈
 */
public class Stack {
    private int maxSize;
    private int[] stack; // 使用 数组存储数据
    private int top = -1; // 栈空时为 -1，非空时为该入栈位置索引

    // 构造器
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize]; // 大小为 maxSize 的 int数组
    }

    // 返回当前栈顶值的 方法
    int peek(){
        return stack[top];
    }

    // 判断栈是否空
    boolean isEmpty() {
        return top == -1; // top == -1 即为 栈空
    }

    // 判断栈是否满
    boolean isFull() {
        return top == maxSize - 1; // 此为 栈满 条件
    }

    // 入栈操作 push
    void push(int val){
        if(isFull()){
            System.out.println("栈已满~~");
            return; // 直接返回
        }
        top++; // 这是栈未满的加入逻辑
        stack[top] = val;
        // stack[++top] = val; 也可以
    }

    // 出栈 pop , 返回栈顶数据
    int pop() {
        //先判断栈是否空
        if(isEmpty()) {
            //抛出异常
            throw new RuntimeException("栈空，没有数据~");
        }
        int value = stack[top];
        top--;
        return value;
    }

    // 判断 元素 是否在 栈中
    private boolean isExist(int element){
        if(isEmpty()){
            System.out.println("栈空无元素");
            return false;
        }
        // 从栈顶 开始 查询数据
        for (int i = top; i >= 0;i--){
            if(element == stack[i]) return true;
        }
        return false;
    }
}
