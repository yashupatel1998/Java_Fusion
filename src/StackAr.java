import java.util.Scanner;

class StackAr {

    int top = -1;
    int n = 10;
    int a[] = new int[n];
    Scanner sc = new Scanner(System.in);


    //PUSH Operation
    void push(int j){
        if(top == n-1 ){
            System.out.println("Stack is full");
        } else
        {
            //System.out.println("Enter Elements");
            //int i = sc.nextInt();
            top = top+1;
            a[top] = j;
            System.out.println("Pushed: " + j);
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            int poppedElement = a[top];
            top = top - 1;
            System.out.println("Element Deleted: " + poppedElement);

        }
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            int poppedElement = a[top];
            top = top - 1;
            System.out.println("Element Deleted: " + poppedElement);

        }

    }


        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackAr s = new StackAr();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


    }
 }
