#-------markdown---------
******
______
    public class x_z {
        private double a;
        private double b;
        //构造方法名必须和类名相同
        public x_z(double a,double b){
            this.a=a;
            this.b=b;
        }
        public x_z(double a){
            this.a=a;
        }//构造方法
        public void c(){
            System.out.println(a*4+"and"+a*a);
        }
        public void s(){
            System.out.println(2*a+2*b+"and"+a*b);
    
        }//无须传参，因为初始化的参数和所传的参数不同
        public static void main(String[]args){
            x_z sc=new x_z(4,5);
    
            sc.c();
            sc.s();
    
        }
    }
---- 
----



动物 | 动作 | 食物
--- | --- | ---
老虎 | 吃|肉 
兔子| 吃|草 
老鼠|偷|粱


![alt text](/Users/mac/Desktop/timg.jpeg)